package com.github.azulaloi.lumoscontent.block;

import com.github.azulaloi.lumoscontent.LumosContent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static com.github.azulaloi.lumoscontent.util.AzUtil.unlocalizedID;

public class BaseBlock extends Block {

    public BaseBlock(String name, Material material, Float hardness, Float resistance, String tool, int level) {
        super(material);
        setUnlocalizedName(unlocalizedID(name));
        setRegistryName(name);
        setCreativeTab(LumosContent.lumosGeneric);
        setHarvestLevel(tool, level);
        setHardness(hardness);
        setResistance(resistance);
    }

}
