package com.github.azulaloi.lumoscontent.item.armor;

import com.github.azulaloi.lumoscontent.LumosContent;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import static com.github.azulaloi.lumoscontent.util.AzUtil.unlocalizedID;

public class BaseArmor extends ItemArmor {

    public BaseArmor(ArmorMaterial mat, EntityEquipmentSlot slot, String name) {
        super(mat, 0, slot);
        setUnlocalizedName(unlocalizedID(name));
        setRegistryName(name);
        setCreativeTab(LumosContent.lumosArmor);
    }
}
