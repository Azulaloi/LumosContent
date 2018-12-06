package com.github.azulaloi.lumoscontent.item.equipment.tools;

import com.github.azulaloi.lumoscontent.LumosContent;
import net.minecraft.item.ItemAxe;

import static com.github.azulaloi.lumoscontent.util.AzUtil.unlocalizedID;

public class ItemBaseAxe extends ItemAxe {
    public ItemBaseAxe(ToolMaterial mat, String name){
        super(mat, 6.0F, -3.2F);
        setUnlocalizedName(unlocalizedID(name));
        setRegistryName(LumosContent.MODID, name);
        setCreativeTab(LumosContent.lumosTools);
    }
}
