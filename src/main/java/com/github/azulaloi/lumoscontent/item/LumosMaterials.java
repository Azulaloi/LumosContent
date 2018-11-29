package com.github.azulaloi.lumoscontent.item;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class LumosMaterials {

    //name, harvest level, max uses, eff, damage, enchant

//    WOOD(   0, 59,   2.0F,  0.0F, 15),
//    STONE(  1, 131,  4.0F,  1.0F, 5),
//    IRON(   2, 250,  6.0F,  2.0F, 14),
//    DIAMOND(3, 1561, 8.0F,  3.0F, 10),
//    GOLD(   0, 32,   12.0F, 0.0F, 22);

    public static final Item.ToolMaterial TOOL_FLINT = EnumHelper.addToolMaterial(
            "FLINT", 0, 32, 1.0F, 0.0F, 1);

    public static final Item.ToolMaterial TOOL_STONE = EnumHelper.addToolMaterial(
            "PRIMITIVE_STONE", 0, 96, 1.5F, 0.5F, 5);

    public static final Item.ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial(
            "COPPER", 1, 172, 2.0F, 1.0F, 10);

    public static final Item.ToolMaterial TOOL_REDBRONZE = EnumHelper.addToolMaterial(
            "REDBRONZE", 2, 356, 2.5F, 1.5F, 14);

    public static final Item.ToolMaterial TOOL_BLUEBRONZE = EnumHelper.addToolMaterial(
            "BLUEBRONZE", 2, 256, 2.7F, 1.7F, 18);

    public static final Item.ToolMaterial TOOL_DIAMANTINE = EnumHelper.addToolMaterial(
            "DIAMANTINE", 3, 892, 3.5F, 2.4F, 16);

    public static final Item.ToolMaterial TOOL_SCORCH = EnumHelper.addToolMaterial(
            "SCORCHSTEEL", 3, 1564, 3.5F, 3.0F, 7);

    public static final Item.ToolMaterial TOOL_PALE = EnumHelper.addToolMaterial(
            "PALEBRASS", 4, 1982, 3.5F, 2.6F, 25);

    //ARMOR
    //name, texturename, durability, reductionamounts, enchantibility, soundonequip, toughness

    public static ItemArmor.ArmorMaterial CHAIN_COPPER = EnumHelper.addArmorMaterial("CHAIN_COPPER", "chain_copper", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial SCALE_COPPER = EnumHelper.addArmorMaterial("SCALE_COPPER", "scale_copper", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial PLATE_COPPER = EnumHelper.addArmorMaterial("PLATE_COPPER", "plate_copper", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);

    public static ItemArmor.ArmorMaterial CHAIN_REDBRONZE = EnumHelper.addArmorMaterial("CHAIN_REDBRONZE", "chain_red", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial SCALE_REDBRONZE = EnumHelper.addArmorMaterial("SCALE_REDBRONZE", "scale_red", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial PLATE_REDBRONZE = EnumHelper.addArmorMaterial("PLATE_REDBRONZE", "plate_red", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);

    public static ItemArmor.ArmorMaterial CHAIN_BLUEBRONZE = EnumHelper.addArmorMaterial("CHAIN_BLUEBRONZE", "chain_blue", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial SCALE_BLUEBRONZE = EnumHelper.addArmorMaterial("SCALE_BLUEBRONZE", "scale_blue", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial PLATE_BLUEBRONZE = EnumHelper.addArmorMaterial("PLATE_BLUEBRONZE", "plate_blue", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);

    public static ItemArmor.ArmorMaterial CHAIN_SCORCHSTEEL = EnumHelper.addArmorMaterial("CHAIN_SCORCHSTEEL", "chain_scorch", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial SCALE_SCORCHSTEEL = EnumHelper.addArmorMaterial("SCALE_SCORCHSTEEL", "scale_scorch", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial PLATE_SCORCHSTEEL = EnumHelper.addArmorMaterial("PLATE_SCORCHSTEEL", "plate_scorch", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);

    public static ItemArmor.ArmorMaterial CHAIN_PALEBRASS = EnumHelper.addArmorMaterial("CHAIN_PALEBRASS", "chain_pale", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial SCALE_PALEBRASS = EnumHelper.addArmorMaterial("SCALE_PALEBRASS", "scale_pale", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);
    public static ItemArmor.ArmorMaterial PLATE_PALEBRASS = EnumHelper.addArmorMaterial("PLATE_PALEBRASS", "plate_pale", 20, new int[]{2,5,7,2},15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0F);

}
