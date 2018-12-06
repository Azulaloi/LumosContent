package com.github.azulaloi.lumoscontent.item.equipment.tools;

import com.github.azulaloi.lumoscontent.LumosContent;
import net.minecraft.item.ItemSword;

import static com.github.azulaloi.lumoscontent.util.AzUtil.unlocalizedID;

public class ItemBaseSword extends ItemSword {
    public ItemBaseSword(ToolMaterial mat, String name){
        super(mat);
        setUnlocalizedName(unlocalizedID(name));
        setRegistryName(LumosContent.MODID, name);
        setCreativeTab(LumosContent.lumosTools);
    }
}
