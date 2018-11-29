package com.github.azulaloi.lumoscontent.item.tools;

import com.github.azulaloi.lumoscontent.LumosContent;
import net.minecraft.item.ItemPickaxe;

import static com.github.azulaloi.lumoscontent.util.AzUtil.unlocalizedID;

public class ItemBasePick extends ItemPickaxe {

    public ItemBasePick(ToolMaterial mat, String name){
        super(mat);
        setUnlocalizedName(LumosContent.MODID + "." + name);
        setRegistryName(LumosContent.MODID, name);
        setCreativeTab(LumosContent.lumosTools);
    }
}
