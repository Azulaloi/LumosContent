package com.github.azulaloi.lumoscontent;

import com.github.azulaloi.lumoscontent.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod(modid=LumosContent.MODID, name=LumosContent.NAME, version=LumosContent.VERSION, dependencies=LumosContent.DEPENDENCIES)
public class LumosContent {

    public static final String MODID = "lumoscontent";
    public static final String NAME = "Lumos Content";
    public static final String VERSION = "@VERSION";
    public static final String DEPENDENCIES = "";

    @Mod.Instance
    public static LumosContent instance;

    @SidedProxy(clientSide = "com.github.azulaloi.lumoscontent.proxy.ClientProxy", serverSide = "com.github.azulaloi.lumoscontent.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    public static CreativeTabs lumosGeneric = new CreativeTabs(MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.redIngot);
        }
    };

    public static CreativeTabs lumosTools = new CreativeTabs(MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.redPick);
        }
    };

    public static CreativeTabs lumosArmor = new CreativeTabs(MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.chainTorsoCopper);
        }
    };

}
