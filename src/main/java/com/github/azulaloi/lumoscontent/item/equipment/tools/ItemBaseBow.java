package com.github.azulaloi.lumoscontent.item.equipment.tools;

import com.github.azulaloi.lumoscontent.LumosContent;
import com.github.azulaloi.lumoscontent.ModItems;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

import static com.github.azulaloi.lumoscontent.util.AzUtil.unlocalizedID;

public class ItemBaseBow extends Item {

    private final BowMaterial material;
    private final BowShape shape;


    public ItemBaseBow(BowShape shape, BowMaterial mat) {
        this.material = mat;
        this.shape = shape;
        setMaxDamage(calcDura());
        maxStackSize = 1;

        setUnlocalizedName(unlocalizedID(shape.zame + "_" + mat.zame));
        setRegistryName(LumosContent.MODID,  shape.zame + "_" + mat.zame);

        setCreativeTab(LumosContent.lumosTools);

        addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter() {
            @Override
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
                if (entityIn == null) {
                    return 0.0F;
                } else {
                    System.out.println(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount());
                    return (!isBow(entityIn.getActiveItemStack().getItem())) ? 0.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F; //seconds held
                }
            }
        });

        addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter() {
            @Override
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }
        });
    }

    public boolean isBow(Item item) {
        int flag = 0;

        if (item == ModItems.longbow) flag++;
        if (item == ModItems.shortbow) flag++;
        if (item == ModItems.greatbow) flag++;

        return flag > 0;
    }

    private int calcDura() {
        return shape.baseDurability * material.dura;
    }

    public void onPlayerStoppedUsing(ItemStack stack, World world, EntityLivingBase entityLiving, int timeLeft) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)entityLiving;
            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;
            ItemStack ammo = this.findAmmo(player);

            int i = this.getMaxItemUseDuration(stack) - timeLeft;
            i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(stack, world, player, i, !ammo.isEmpty() || flag);
            if (i < 0) return;

            if (!ammo.isEmpty() || flag) {
                if (ammo.isEmpty()) {
                    ammo = new ItemStack(Items.ARROW);
                }

                float f = getArrowVelocity(i, this.shape);

                if ((double)f >= 0.1D) {
                    boolean flag1 = player.capabilities.isCreativeMode || (ammo.getItem() instanceof ItemArrow && ((ItemArrow) ammo.getItem()).isInfinite(ammo, stack, player));

                    if (!world.isRemote) {
                        ItemArrow itemArrow = (ItemArrow) (ammo.getItem() instanceof ItemArrow ? ammo.getItem() : Items.ARROW);
                        EntityArrow entityArrow = itemArrow.createArrow(world, ammo, player);
                        entityArrow.shoot(player, player.rotationPitch, player.rotationYaw, 0.0F, f * 3.0F, 1.0F); //what is p18454/4?

                        if (f == 1.0F) {
                            entityArrow.setIsCritical(true);
                        }

                        int pow = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);
                        if (pow > 0) {
                            entityArrow.setDamage(entityArrow.getDamage() + (double)pow * 0.5D + 0.5D);
                        }

                        int pun = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);
                        if (pun > 0) {
                            entityArrow.setKnockbackStrength(pun);
                        }

                        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0) {
                            entityArrow.setFire(100);
                        }

                        stack.damageItem(1, player);

                        if (flag1 || player.capabilities.isCreativeMode && (ammo.getItem() == Items.SPECTRAL_ARROW || ammo.getItem() == Items.TIPPED_ARROW)) {
                            entityArrow.pickupStatus = EntityArrow.PickupStatus.CREATIVE_ONLY;
                        }

                        world.spawnEntity(entityArrow);
                    }

                    world.playSound((EntityPlayer) null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0f, 1.0f / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                    if (!flag1 && !player.capabilities.isCreativeMode) {
                        ammo.shrink(1);

                        if (ammo.isEmpty()) {
                            player.inventory.deleteStack(ammo);
                        }
                    }

                    player.addStat(StatList.getObjectUseStats(this));

                }


            }

        }
    }

    public static float getArrowVelocity(int charge, BowShape shape) {

        float f = (float)charge / 20.0F; //seconds held
        System.out.println("seconds held: " + f);

        switch (shape) {
            case GREATBOW: f = (f * f + f * 2.0F) / 3.0F;
            case RECURVE: f = (f * f + f * 2.0F) / 3.0F;
            case SHORTBOW: f = (f * f + f * 2.0F) / 3.0F;
            case LONGBOW: f = (f * f + f * 2.0F) / 3.0F;
            default: f = (f * f + f * 2.0F) / 3.0F;
        }

//        f = (f * f + f * 2.0F) / 3.0F;
//        System.out.println("uncapped v: " + f);

        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack stack = playerIn.getHeldItem(handIn);
        boolean flag = !this.findAmmo(playerIn).isEmpty();

        ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(stack, worldIn, playerIn, handIn, flag);
        if (ret != null) return ret;

        if (!playerIn.capabilities.isCreativeMode && !flag) {
            return flag ? new ActionResult(EnumActionResult.PASS, stack) : new ActionResult(EnumActionResult.FAIL, stack);
        } else {
            playerIn.setActiveHand(handIn);
            return  new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
        }
    }

    private ItemStack findAmmo(EntityPlayer player) {
        if (this.isArrow(player.getHeldItem(EnumHand.OFF_HAND))) {
            return player.getHeldItem(EnumHand.OFF_HAND);
        } else if (this.isArrow(player.getHeldItem(EnumHand.MAIN_HAND))) {
            return player.getHeldItem(EnumHand.MAIN_HAND);
        } else {
            for (int i = 0; i < player.inventory.getSizeInventory(); ++i) {
                ItemStack stack = player.inventory.getStackInSlot(i);
                if (this.isArrow(stack)) {
                    return stack;
                }
            }

            return ItemStack.EMPTY;
        }
    }

    protected boolean isArrow(ItemStack stack) {
        return stack.getItem() instanceof ItemArrow;
    }

    public int getMaxItemUseDuration(ItemStack stack) {
        switch (shape) {
            case GREATBOW: return 190000;
            case LONGBOW: return 128000;
            case SHORTBOW: return 32000;
            case RECURVE: return 72000;
            default: return 72000;
        }
    }

    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.BOW;
    }

    public int getItemEnchantability() {
        return 1;
    }
}
