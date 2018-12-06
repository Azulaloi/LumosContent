package com.github.azulaloi.lumoscontent.item.equipment.tools;

import com.github.azulaloi.lumoscontent.LumosContent;
import com.github.azulaloi.lumoscontent.ModBlocks;
import com.github.azulaloi.lumoscontent.item.LumosMaterials;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;

public class ItemBasePick extends ItemPickaxe {

    private int trueLevel;

    public ItemBasePick(ToolMaterial mat, String name, int trueLevel){
        super(mat);
        setUnlocalizedName(LumosContent.MODID + "." + name);
        setRegistryName(LumosContent.MODID, name);
        setCreativeTab(LumosContent.lumosTools);
        this.trueLevel = trueLevel;
    }

    @Override
    public boolean canHarvestBlock(IBlockState state) {
        Block block = state.getBlock();

        // the block police are on the case
        if (block == Blocks.COAL_ORE){ return trueLevel >= 0; }
        if (block == ModBlocks.oreCopper && this.toolMaterial != LumosMaterials.TOOL_FLINT) {return trueLevel >= 0;}
        if (block == Blocks.IRON_ORE) { return trueLevel >= 1;}
        if (block == Blocks.GOLD_ORE) { return trueLevel >= 1;}
        if (block == ModBlocks.oreSilver) { return trueLevel >= 1;}
        if (block == Blocks.LAPIS_ORE) { return trueLevel >= 1; }
        if (block == Blocks.REDSTONE_ORE) { return trueLevel >= 1; }
        if (block == Blocks.EMERALD_ORE) { return trueLevel >= 2; }
        if (block == Blocks.DIAMOND_ORE) { return trueLevel >= 2; }
        if (block == Blocks.OBSIDIAN) { return trueLevel >= 3; }
        else return super.canHarvestBlock(state);
    }
}
