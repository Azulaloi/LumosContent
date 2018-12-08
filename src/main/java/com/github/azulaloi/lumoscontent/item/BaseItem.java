package com.github.azulaloi.lumoscontent.item;

import com.github.azulaloi.lumoscontent.LumosContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.github.azulaloi.lumoscontent.util.AzUtil.unlocalizedID;

public class BaseItem extends Item {

    public BaseItem(String name) {
        setUnlocalizedName(unlocalizedID(name));
        setRegistryName(name);
        setCreativeTab(LumosContent.lumosGeneric);
    }

    public BaseItem(String name, CreativeTabs tab) {
        setUnlocalizedName(unlocalizedID(name));
        setRegistryName(name);
        setCreativeTab(tab);
    }
}
