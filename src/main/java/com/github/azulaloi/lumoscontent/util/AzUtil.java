package com.github.azulaloi.lumoscontent.util;

import com.github.azulaloi.lumoscontent.LumosContent;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class AzUtil {
    public static String unlocalizedID(String name){
        return(LumosContent.MODID + "." + name);
    }

    public static void registerItemModel(Item item){
        ModelLoader.setCustomModelResourceLocation(
                item,
                0,
                new ModelResourceLocation(item.getRegistryName(), "inventory")
        );
    }

    public static void registerItemModels(Item... items) {
        for (Item itemIn : items) registerItemModel(itemIn);
    }

    public static void registerBlockItem(Block block){
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }


}
