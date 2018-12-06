package com.github.azulaloi.lumoscontent.item.equipment.bauble;

import baubles.api.BaubleType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ItemTestRing extends BaseBauble {

    public ItemTestRing(String name) {
        super(name);
    }

    @Override
    public void onWornTick(ItemStack stack, EntityLivingBase entity) {
        super.onWornTick(stack, entity);

        entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, Integer.MAX_VALUE, 1, true, true));
    }

    @Override
    public void onUnequipped(ItemStack stack, EntityLivingBase entity) {
        PotionEffect effect = entity.getActivePotionEffect(MobEffects.JUMP_BOOST);
        if (effect != null) entity.removePotionEffect(MobEffects.JUMP_BOOST);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.RING;
    }
}
