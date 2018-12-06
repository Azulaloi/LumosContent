package com.github.azulaloi.lumoscontent.item.equipment.bauble;

import baubles.api.BaubleType;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ItemDraftCloak extends BaseBauble {

    public ItemDraftCloak(String name) {
        super(name);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.BODY;
    }

    @Override
    public void onWornTick(ItemStack stack, EntityLivingBase entity) {
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;

            for (int i = 0; i < 100; i++) {
                Block block = player.world.getBlockState(player.getPosition().down(i)).getBlock();

                if (block.equals(Blocks.FIRE) || block.equals(Blocks.LAVA) || block.equals(Blocks.FLOWING_LAVA)) {
                    player.fallDistance = 0;

                    if (!player.isSneaking()) {
//                        player.addVelocity(0, 0.085, 0); // flight

                        if (player.motionY < 0) {          // controlled falling
                            player.motionY += 0.075;

                            player.motionX *= 1.01f;
                            player.motionZ *= 1.01f;
                        }

                    } else {
//                        player.addVelocity(0, 0.01, 0);
                    }

                    //motionY *= 1.005; //TODO: scale to distance of heat?
                    break;
                } else if (!block.equals(Blocks.AIR)) {
                    break;
                }
            }
        }
    }
}

