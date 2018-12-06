package com.github.azulaloi.lumoscontent;

import com.github.azulaloi.lumoscontent.block.BaseBlock;
import com.github.azulaloi.lumoscontent.block.BlockCrop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.github.azulaloi.lumoscontent.util.AzUtil.registerBlockItem;
import static com.github.azulaloi.lumoscontent.util.AzUtil.registerItemModel;

@Mod.EventBusSubscriber(modid=LumosContent.MODID)
public class ModBlocks {

    public static Block oreCopper = new BaseBlock("copper_ore", Material.ROCK, 3.0f, 5.0f, "pickaxe", 1);
    public static Block oreSilver = new BaseBlock("silver_ore", Material.ROCK, 3.0f, 5.0f, "pickaxe", 1);

    public static Block blockCopper = new BaseBlock("copper_block", Material.IRON, 3.0f, 5.0f, "pickaxe", 0);
    public static Block blockSilver = new BaseBlock("silver_block", Material.IRON, 3.0f, 5.0f, "pickaxe", 1);
    public static Block blockRedbronze = new BaseBlock("redbronze_block", Material.IRON, 3.0f, 5.0f, "pickaxe", 1);
    public static Block blockBluebronze = new BaseBlock("bluebronze_block", Material.IRON, 3.0f, 5.0f, "pickaxe", 1);
    public static Block blockScorchsteel = new BaseBlock("scorchsteel_block", Material.IRON, 3.0f, 5.0f, "pickaxe", 1);
    public static Block blockPalebrass = new BaseBlock("palebrass_block", Material.IRON, 3.0f, 5.0f, "pickaxe", 1);

    public static BlockCrop blockFlax= new BlockCrop("flax", ModItems.flaxFibre) {
        @Override
        public Item getSeed() {
            return Item.getItemFromBlock(this);
        }
    };

    public static Block[] blocksOut = {
            oreCopper,
            oreSilver,

            blockCopper,
            blockSilver,
            blockRedbronze,
            blockBluebronze,
            blockScorchsteel,
            blockPalebrass,
            blockFlax
    };

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        for (Block blockIn : blocksOut) event.getRegistry().register(blockIn);
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent<Item> event) {

        for (Block blockIn : blocksOut) registerBlockItem(blockIn);

    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        for (Block blockIn : blocksOut) registerItemModel(Item.getItemFromBlock(blockIn));

    }
}
