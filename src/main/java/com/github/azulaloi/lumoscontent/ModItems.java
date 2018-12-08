package com.github.azulaloi.lumoscontent;

import com.github.azulaloi.lumoscontent.item.BaseItem;
import com.github.azulaloi.lumoscontent.item.LumosMaterials;
import com.github.azulaloi.lumoscontent.item.equipment.armor.BaseArmor;
import com.github.azulaloi.lumoscontent.item.equipment.bauble.ItemDraftCloak;
import com.github.azulaloi.lumoscontent.item.equipment.tools.ItemBaseAxe;
import com.github.azulaloi.lumoscontent.item.equipment.tools.ItemBasePick;
import com.github.azulaloi.lumoscontent.item.equipment.tools.ItemBaseSword;
import com.github.azulaloi.lumoscontent.item.equipment.tools.ItemBaseSpade;
import com.github.azulaloi.lumoscontent.item.equipment.tools.ItemBaseHoe;
import com.github.azulaloi.lumoscontent.item.equipment.tools.ItemBaseBow;
import com.github.azulaloi.lumoscontent.item.equipment.tools.BowMaterial;
import com.github.azulaloi.lumoscontent.item.equipment.tools.BowShape;
import com.github.azulaloi.lumoscontent.item.equipment.bauble.ItemTestRing;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import static com.github.azulaloi.lumoscontent.util.AzUtil.registerItemModel;

@Mod.EventBusSubscriber(modid=LumosContent.MODID)
public class ModItems {

    //MATERIALS

    public static Item oreCopper = new BaseItem("ore_copper");
    public static Item oreIron = new BaseItem("ore_iron");
    public static Item oreGold = new BaseItem("ore_gold");
    public static Item oreSilver = new BaseItem("ore_silver");

    public static Item copperIngot = new BaseItem("copper_ingot");
    public static Item wroughtIngot = new BaseItem("wrought_ingot");
    public static Item silverIngot = new BaseItem("silver_ingot");
    public static Item redIngot = new BaseItem("redbronze_ingot");
    public static Item blueIngot = new BaseItem("bluebronze_ingot");
    public static Item scorchIngot = new BaseItem("scorchsteel_ingot");
    public static Item paleIngot = new BaseItem("palebrass_ingot");

    public static Item copperNugget = new BaseItem("copper_nugget");
    public static Item wroughtNugget = new BaseItem("wrought_nugget");
    public static Item silverNugget = new BaseItem("silver_nugget");
    public static Item redNugget = new BaseItem("redbronze_nugget");
    public static Item blueNugget = new BaseItem("bluebronze_nugget");
    public static Item scorchNugget = new BaseItem("scorchsteel_nugget");
    public static Item paleNugget = new BaseItem("palebrass_nugget");

    public static Item fluxBasic = new BaseItem("flux_basic");
    public static Item fluxTerra = new BaseItem("flux_terra");
    public static Item fluxCinder = new BaseItem("flux_cinder");
    public static Item fluxUmber = new BaseItem("flux_umber");
    public static Item fluxOther = new BaseItem("flux_other");

    public static Item plantFibre = new BaseItem("plant_fibre");
    public static Item bindingFibre = new BaseItem("binding_fibre");
    public static Item bindingSilk = new BaseItem("binding_silk");
    public static Item bindingFlax = new BaseItem("binding_flax");

    public static Item skinCow = new BaseItem("skin_cow");
    public static Item skinPig = new BaseItem("skin_pig");
    public static Item skinSheep = new BaseItem("skin_sheep");
    public static Item skinRabbit = new BaseItem("skin_rabbit");
    public static Item skinHorse = new BaseItem("skin_horse");
    public static Item skinMule = new BaseItem("skin_mule");
    public static Item skinDonkey = new BaseItem("skin_donkey");
    public static Item skinLlama = new BaseItem("skin_llama");
    public static Item skinWolf = new BaseItem("skin_wolf");
    public static Item skinBear = new BaseItem("skin_bear");
    public static Item skinGeneric = new BaseItem("skin_generic");

    public static Item animalSkin = new BaseItem("hide");
    public static Item curedSkin = new BaseItem("hide_cured");
    public static Item rawHide = new BaseItem("leather_rawhide");
    public static Item tannedLeather = new BaseItem("leather_tanned");
    public static Item leatherStrip = new BaseItem("leather_strip");

    public static Item handleBasic = new BaseItem("tool_handle_basic");
    public static Item handleSturdy = new BaseItem("tool_handle_sturdy");
    public static Item handleStrong = new BaseItem("tool_handle_strong");

    //TOOLS

    public static Item flintPick = new ItemBasePick(LumosMaterials.TOOL_FLINT, "flint_pick", 0);
    public static Item flintAxe = new ItemBaseAxe(LumosMaterials.TOOL_FLINT, "flint_axe");

    public static Item primPick = new ItemBasePick(LumosMaterials.TOOL_STONE, "stone_pick", 0);
    public static Item primAxe = new ItemBaseAxe(LumosMaterials.TOOL_STONE, "stone_axe");
    public static Item primSpade = new ItemBaseSpade(LumosMaterials.TOOL_STONE, "stone_spade");

    public static Item copperPick = new ItemBasePick(LumosMaterials.TOOL_COPPER, "copper_pick", 1);
    public static Item copperAxe = new ItemBaseAxe(LumosMaterials.TOOL_COPPER, "copper_axe");
    public static Item copperSpade = new ItemBaseSpade(LumosMaterials.TOOL_COPPER, "copper_spade");
    public static Item copperHoe = new ItemBaseHoe(LumosMaterials.TOOL_COPPER, "copper_hoe");
    public static Item copperSword = new ItemBaseSword(LumosMaterials.TOOL_COPPER, "copper_sword");

    public static Item redPick = new ItemBasePick(LumosMaterials.TOOL_REDBRONZE, "red_pick", 2);
    public static Item redAxe = new ItemBaseAxe(LumosMaterials.TOOL_REDBRONZE, "red_axe");
    public static Item redSpade = new ItemBaseSpade(LumosMaterials.TOOL_REDBRONZE, "red_spade");
    public static Item redHoe = new ItemBaseHoe(LumosMaterials.TOOL_REDBRONZE, "red_hoe");
    public static Item redSword = new ItemBaseSword(LumosMaterials.TOOL_REDBRONZE, "red_sword");

    public static Item bluePick = new ItemBasePick(LumosMaterials.TOOL_BLUEBRONZE, "blue_pick", 2);
    public static Item blueAxe = new ItemBaseAxe(LumosMaterials.TOOL_BLUEBRONZE, "blue_axe");
    public static Item blueSpade = new ItemBaseSpade(LumosMaterials.TOOL_BLUEBRONZE, "blue_spade");
    public static Item blueHoe = new ItemBaseHoe(LumosMaterials.TOOL_BLUEBRONZE, "blue_hoe");
    public static Item blueSword = new ItemBaseSword(LumosMaterials.TOOL_BLUEBRONZE, "blue_sword");

    public static Item diamantinePick = new ItemBasePick(LumosMaterials.TOOL_DIAMANTINE, "diamantine_pick", 3);
    public static Item diamantineAxe = new ItemBaseAxe(LumosMaterials.TOOL_DIAMANTINE, "diamantine_axe");
    public static Item diamantineSpade = new ItemBaseSpade(LumosMaterials.TOOL_DIAMANTINE, "diamantine_spade");
    public static Item diamantineHoe = new ItemBaseHoe(LumosMaterials.TOOL_DIAMANTINE, "diamantine_hoe");
    public static Item diamantineSword = new ItemBaseSword(LumosMaterials.TOOL_DIAMANTINE, "diamantine_sword");

    public static Item scorchPick = new ItemBasePick(LumosMaterials.TOOL_SCORCH, "scorch_pick", 3);
    public static Item scorchAxe = new ItemBaseAxe(LumosMaterials.TOOL_SCORCH, "scorch_axe");
    public static Item scorchSpade = new ItemBaseSpade(LumosMaterials.TOOL_SCORCH, "scorch_spade");
    public static Item scorchHoe = new ItemBaseHoe(LumosMaterials.TOOL_SCORCH, "scorch_hoe");
    public static Item scorchSword = new ItemBaseSword(LumosMaterials.TOOL_SCORCH, "scorch_sword");

    public static Item palePick = new ItemBasePick(LumosMaterials.TOOL_PALE, "pale_pick", 3);
    public static Item paleAxe = new ItemBaseAxe(LumosMaterials.TOOL_PALE, "pale_axe");
    public static Item paleSpade = new ItemBaseSpade(LumosMaterials.TOOL_PALE, "pale_spade");
    public static Item paleHoe = new ItemBaseHoe(LumosMaterials.TOOL_PALE, "pale_hoe");
    public static Item paleSword = new ItemBaseSword(LumosMaterials.TOOL_PALE, "pale_sword");


    //ARMOR COMPONENTS

    public static Item chainlinkCopper = new BaseItem("copper_chainlink");
    public static Item chainsheetCopper = new BaseItem("copper_chainsheet");
    public static Item scaleCopper = new BaseItem("copper_scale");
    public static Item scalesheetCopper = new BaseItem("copper_scalesheet");
    public static Item plateCopper = new BaseItem("copper_plate");

    public static Item chainlinkWrought = new BaseItem("wrought_chainlink");
    public static Item chainsheetWrought = new BaseItem("wrought_chainsheet");
    public static Item scaleWrought = new BaseItem("wrought_scale");
    public static Item scalesheetWrought = new BaseItem("wrought_scalesheet");
    public static Item plateWrought = new BaseItem("wrought_plate");

    public static Item chainlinkRedbronze = new BaseItem("red_chainlink");
    public static Item chainsheetRedbronze = new BaseItem("red_chainsheet");
    public static Item scaleRedbronze = new BaseItem("red_scale");
    public static Item scalesheetRedbronze = new BaseItem("red_scalesheet");
    public static Item plateRedbronze = new BaseItem("red_plate");

    public static Item chainlinkBluebronze = new BaseItem("blue_chainlink");
    public static Item chainsheetBluebronze = new BaseItem("blue_chainsheet");
    public static Item scaleBluebronze = new BaseItem("blue_scale");
    public static Item scalesheetBluebronze = new BaseItem("blue_scalesheet");
    public static Item plateBluebronze = new BaseItem("blue_plate");

    public static Item chainlinkScorchsteel = new BaseItem("scorch_chainlink");
    public static Item chainsheetScorchsteel = new BaseItem("scorch_chainsheet");
    public static Item scaleScorchsteel = new BaseItem("scorch_scale");
    public static Item scalesheetScorchsteel = new BaseItem("scorch_scalesheet");
    public static Item plateScorchsteel = new BaseItem("scorch_plate");

    public static Item chainlinkPalebrass = new BaseItem("pale_chainlink");
    public static Item chainsheetPalebrass = new BaseItem("pale_chainsheet");
    public static Item scalePalebrass = new BaseItem("pale_scale");
    public static Item scalesheetPalebrass = new BaseItem("pale_scalesheet");
    public static Item platePalebrass = new BaseItem("pale_plate");


    //ARMOR

    public static Item chainHelmCopper = new BaseArmor(LumosMaterials.CHAIN_COPPER, EntityEquipmentSlot.HEAD, "chain_copper_helm");
    public static Item chainTorsoCopper = new BaseArmor(LumosMaterials.CHAIN_COPPER, EntityEquipmentSlot.CHEST, "chain_copper_chest");
    public static Item chainLegsCopper = new BaseArmor(LumosMaterials.CHAIN_COPPER, EntityEquipmentSlot.LEGS, "chain_copper_legs");
    public static Item chainBootsCopper = new BaseArmor(LumosMaterials.CHAIN_COPPER, EntityEquipmentSlot.FEET, "chain_copper_boots");

    public static Item scaleHelmCopper = new BaseArmor(LumosMaterials.SCALE_COPPER, EntityEquipmentSlot.HEAD, "scale_copper_helm");
    public static Item scaleTorsoCopper = new BaseArmor(LumosMaterials.SCALE_COPPER, EntityEquipmentSlot.CHEST, "scale_copper_chest");
    public static Item scaleLegsCopper = new BaseArmor(LumosMaterials.SCALE_COPPER, EntityEquipmentSlot.LEGS, "scale_copper_legs");
    public static Item scaleBootsCopper = new BaseArmor(LumosMaterials.SCALE_COPPER, EntityEquipmentSlot.FEET, "scale_copper_boots");

    public static Item plateHelmCopper = new BaseArmor(LumosMaterials.PLATE_COPPER, EntityEquipmentSlot.HEAD, "plate_copper_helm");
    public static Item plateTorsoCopper = new BaseArmor(LumosMaterials.PLATE_COPPER, EntityEquipmentSlot.CHEST, "plate_copper_chest");
    public static Item plateLegsCopper = new BaseArmor(LumosMaterials.PLATE_COPPER, EntityEquipmentSlot.LEGS, "plate_copper_legs");
    public static Item plateBootsCopper = new BaseArmor(LumosMaterials.PLATE_COPPER, EntityEquipmentSlot.FEET, "plate_copper_boots");

    public static Item chainHelmRed = new BaseArmor(LumosMaterials.CHAIN_REDBRONZE, EntityEquipmentSlot.HEAD, "chain_red_helm");
    public static Item chainTorsoRed = new BaseArmor(LumosMaterials.CHAIN_REDBRONZE, EntityEquipmentSlot.CHEST, "chain_red_chest");
    public static Item chainLegsRed = new BaseArmor(LumosMaterials.CHAIN_REDBRONZE, EntityEquipmentSlot.LEGS, "chain_red_legs");
    public static Item chainBootsRed = new BaseArmor(LumosMaterials.CHAIN_REDBRONZE, EntityEquipmentSlot.FEET, "chain_red_boots");

    public static Item scaleHelmRed = new BaseArmor(LumosMaterials.SCALE_REDBRONZE, EntityEquipmentSlot.HEAD, "scale_red_helm");
    public static Item scaleTorsoRed = new BaseArmor(LumosMaterials.SCALE_REDBRONZE, EntityEquipmentSlot.CHEST, "scale_red_chest");
    public static Item scaleLegsRed = new BaseArmor(LumosMaterials.SCALE_REDBRONZE, EntityEquipmentSlot.LEGS, "scale_red_legs");
    public static Item scaleBootsRed = new BaseArmor(LumosMaterials.SCALE_REDBRONZE, EntityEquipmentSlot.FEET, "scale_red_boots");

    public static Item plateHelmRed = new BaseArmor(LumosMaterials.PLATE_REDBRONZE, EntityEquipmentSlot.HEAD, "plate_red_helm");
    public static Item plateTorsoRed = new BaseArmor(LumosMaterials.PLATE_REDBRONZE, EntityEquipmentSlot.CHEST, "plate_red_chest");
    public static Item plateLegsRed = new BaseArmor(LumosMaterials.PLATE_REDBRONZE, EntityEquipmentSlot.LEGS, "plate_red_legs");
    public static Item plateBootsRed = new BaseArmor(LumosMaterials.PLATE_REDBRONZE, EntityEquipmentSlot.FEET, "plate_red_boots");

    public static Item chainHelmBlue = new BaseArmor(LumosMaterials.CHAIN_BLUEBRONZE, EntityEquipmentSlot.HEAD, "chain_blue_helm");
    public static Item chainTorsoBlue = new BaseArmor(LumosMaterials.CHAIN_BLUEBRONZE, EntityEquipmentSlot.CHEST, "chain_blue_chest");
    public static Item chainLegsBlue = new BaseArmor(LumosMaterials.CHAIN_BLUEBRONZE, EntityEquipmentSlot.LEGS, "chain_blue_legs");
    public static Item chainBootsBlue = new BaseArmor(LumosMaterials.CHAIN_BLUEBRONZE, EntityEquipmentSlot.FEET, "chain_blue_boots");

    public static Item scaleHelmBlue = new BaseArmor(LumosMaterials.SCALE_BLUEBRONZE, EntityEquipmentSlot.HEAD, "scale_blue_helm");
    public static Item scaleTorsoBlue = new BaseArmor(LumosMaterials.SCALE_BLUEBRONZE, EntityEquipmentSlot.CHEST, "scale_blue_chest");
    public static Item scaleLegsBlue = new BaseArmor(LumosMaterials.SCALE_BLUEBRONZE, EntityEquipmentSlot.LEGS, "scale_blue_legs");
    public static Item scaleBootsBlue = new BaseArmor(LumosMaterials.SCALE_BLUEBRONZE, EntityEquipmentSlot.FEET, "scale_blue_boots");

    public static Item plateHelmBlue = new BaseArmor(LumosMaterials.PLATE_BLUEBRONZE, EntityEquipmentSlot.HEAD, "plate_blue_helm");
    public static Item plateTorsoBlue = new BaseArmor(LumosMaterials.PLATE_BLUEBRONZE, EntityEquipmentSlot.CHEST, "plate_blue_chest");
    public static Item plateLegsBlue = new BaseArmor(LumosMaterials.PLATE_BLUEBRONZE, EntityEquipmentSlot.LEGS, "plate_blue_legs");
    public static Item plateBootsBlue = new BaseArmor(LumosMaterials.PLATE_BLUEBRONZE, EntityEquipmentSlot.FEET, "plate_blue_boots");

    public static Item chainHelmScorch = new BaseArmor(LumosMaterials.CHAIN_SCORCHSTEEL, EntityEquipmentSlot.HEAD, "chain_scorch_helm");
    public static Item chainTorsoScorch = new BaseArmor(LumosMaterials.CHAIN_SCORCHSTEEL, EntityEquipmentSlot.CHEST, "chain_scorch_chest");
    public static Item chainLegsScorch = new BaseArmor(LumosMaterials.CHAIN_SCORCHSTEEL, EntityEquipmentSlot.LEGS, "chain_scorch_legs");
    public static Item chainBootsScorch = new BaseArmor(LumosMaterials.CHAIN_SCORCHSTEEL, EntityEquipmentSlot.FEET, "chain_scorch_boots");

    public static Item scaleHelmScorch = new BaseArmor(LumosMaterials.SCALE_SCORCHSTEEL, EntityEquipmentSlot.HEAD, "scale_scorch_helm");
    public static Item scaleTorsoScorch = new BaseArmor(LumosMaterials.SCALE_SCORCHSTEEL, EntityEquipmentSlot.CHEST, "scale_scorch_chest");
    public static Item scaleLegsScorch = new BaseArmor(LumosMaterials.SCALE_SCORCHSTEEL, EntityEquipmentSlot.LEGS, "scale_scorch_legs");
    public static Item scaleBootsScorch = new BaseArmor(LumosMaterials.SCALE_SCORCHSTEEL, EntityEquipmentSlot.FEET, "scale_scorch_boots");

    public static Item plateHelmScorch = new BaseArmor(LumosMaterials.PLATE_SCORCHSTEEL, EntityEquipmentSlot.HEAD, "plate_scorch_helm");
    public static Item plateTorsoScorch = new BaseArmor(LumosMaterials.PLATE_SCORCHSTEEL, EntityEquipmentSlot.CHEST, "plate_scorch_chest");
    public static Item plateLegsScorch = new BaseArmor(LumosMaterials.PLATE_SCORCHSTEEL, EntityEquipmentSlot.LEGS, "plate_scorch_legs");
    public static Item plateBootsScorch = new BaseArmor(LumosMaterials.PLATE_SCORCHSTEEL, EntityEquipmentSlot.FEET, "plate_scorch_boots");

    public static Item chainHelmPale = new BaseArmor(LumosMaterials.CHAIN_PALEBRASS, EntityEquipmentSlot.HEAD, "chain_pale_helm");
    public static Item chainTorsoPale = new BaseArmor(LumosMaterials.CHAIN_PALEBRASS, EntityEquipmentSlot.CHEST, "chain_pale_chest");
    public static Item chainLegsPale = new BaseArmor(LumosMaterials.CHAIN_PALEBRASS, EntityEquipmentSlot.LEGS, "chain_pale_legs");
    public static Item chainBootsPale = new BaseArmor(LumosMaterials.CHAIN_PALEBRASS, EntityEquipmentSlot.FEET, "chain_pale_boots");

    public static Item scaleHelmPale = new BaseArmor(LumosMaterials.SCALE_PALEBRASS, EntityEquipmentSlot.HEAD, "scale_pale_helm");
    public static Item scaleTorsoPale = new BaseArmor(LumosMaterials.SCALE_PALEBRASS, EntityEquipmentSlot.CHEST, "scale_pale_chest");
    public static Item scaleLegsPale = new BaseArmor(LumosMaterials.SCALE_PALEBRASS, EntityEquipmentSlot.LEGS, "scale_pale_legs");
    public static Item scaleBootsPale = new BaseArmor(LumosMaterials.SCALE_PALEBRASS, EntityEquipmentSlot.FEET, "scale_pale_boots");

    public static Item plateHelmPale = new BaseArmor(LumosMaterials.PLATE_PALEBRASS, EntityEquipmentSlot.HEAD, "plate_pale_helm");
    public static Item plateTorsoPale = new BaseArmor(LumosMaterials.PLATE_PALEBRASS, EntityEquipmentSlot.CHEST, "plate_pale_chest");
    public static Item plateLegsPale = new BaseArmor(LumosMaterials.PLATE_PALEBRASS, EntityEquipmentSlot.LEGS, "plate_pale_legs");
    public static Item plateBootsPale = new BaseArmor(LumosMaterials.PLATE_PALEBRASS, EntityEquipmentSlot.FEET, "plate_pale_boots");


    //BOWS
    public static Item longbowLimbBasic = new BaseItem("longbow_limb_basic");
    public static Item longbowLimbStrong = new BaseItem("longbow_limb_strong");

    public static Item shortbowLimbBasic = new BaseItem("shortbow_limb_basic");
    public static Item shortbowLimbStrong = new BaseItem("shortbow_limb_strong");

    public static Item greatbowLimb = new BaseItem("greatbow_limb");

    public static Item bowstringFibre = new BaseItem("bowstring_fibre");
    public static Item bowstringSilk = new BaseItem("bowstring_silk");
    public static Item bowstringFlax = new BaseItem("bowstring_flax");

    public static Item longbow = new ItemBaseBow(BowShape.LONGBOW, BowMaterial.WOOD);
    public static Item shortbow = new ItemBaseBow(BowShape.SHORTBOW, BowMaterial.WOOD);
    public static Item greatbow = new ItemBaseBow(BowShape.GREATBOW, BowMaterial.COPPER);


    //MISC

    public static Item redCatalyst = new BaseItem("red_catalyst");
    public static Item blueCatalyst = new BaseItem("blue_catalyst");

    //PLANTS

    public static Item flax = new BaseItem("flax_flax");
    public static Item flaxStalk = new BaseItem("flax_stalk");
    public static Item flaxDamp = new BaseItem("flax_damp");
    public static Item flaxRaw = new BaseItem("flax_raw");
    public static Item flaxFibre = new BaseItem("flax_fibre");
    public static Item flaxString = new BaseItem("flax_string");


    //BAUBLES
    public static Item testRing = new ItemTestRing("test_ring");
    public static Item draftCloak = new ItemDraftCloak("draft_cloak");

    public static Item[] itemsOut = {

            //TOOLS

            flintPick,
            flintAxe,

            primPick,
            primAxe,
            primSpade,

            copperPick,
            copperAxe,
            copperSpade,
            copperHoe,
            copperSword,

            redPick,
            redAxe,
            redSpade,
            redHoe,
            redSword,

            bluePick,
            blueAxe,
            blueSpade,
            blueHoe,
            blueSword,

            diamantinePick,
            diamantineAxe,
            diamantineSpade,
            diamantineHoe,
            diamantineSword,

            scorchPick,
            scorchAxe,
            scorchSpade,
            scorchHoe,
            scorchSword,

            palePick,
            paleAxe,
            paleSpade,
            paleHoe,
            paleSword,

            //METALS

            oreCopper,
            oreGold,
            oreIron,
            oreSilver,

            copperIngot,
            wroughtIngot,
            silverIngot,
            redIngot,
            blueIngot,
            scorchIngot,
            paleIngot,

            copperNugget,
            wroughtNugget,
            silverNugget,
            redNugget,
            blueNugget,
            scorchNugget,
            paleNugget,

            plateCopper,
            plateWrought,
            plateRedbronze,
            plateBluebronze,
            plateScorchsteel,
            platePalebrass,



            //ARMOR COMPONENTS

            chainlinkCopper,
            chainsheetCopper,
            scaleCopper,
            scalesheetCopper,

            chainlinkWrought,
            chainsheetWrought,
            scaleWrought,
            scalesheetWrought,

            chainlinkRedbronze,
            chainsheetRedbronze,
            scaleRedbronze,
            scalesheetRedbronze,

            chainlinkBluebronze,
            chainsheetBluebronze,
            scaleBluebronze,
            scalesheetBluebronze,

            chainlinkScorchsteel,
            chainsheetScorchsteel,
            scaleScorchsteel,
            scalesheetScorchsteel,

            chainlinkPalebrass,
            chainsheetPalebrass,
            scalePalebrass,
            scalesheetPalebrass ,

            skinCow,
            skinPig,
            skinSheep,
            skinHorse,
            skinDonkey,
            skinMule,
            skinWolf,
            skinBear,
            skinLlama,
            skinRabbit,
            skinGeneric,

            animalSkin,
            curedSkin,
            rawHide,
            tannedLeather,
            leatherStrip,

            plantFibre,
            bindingFibre,
            bindingSilk,
            bindingFlax,

            handleBasic,
            handleSturdy,
            handleStrong,

            fluxBasic,
            fluxTerra,
            fluxCinder,
            fluxUmber,
            fluxOther,

            //ARMOR

            chainHelmCopper,
            chainTorsoCopper,
            chainLegsCopper,
            chainBootsCopper,
            scaleHelmCopper,
            scaleTorsoCopper,
            scaleLegsCopper,
            scaleBootsCopper,
            plateHelmCopper,
            plateTorsoCopper,
            plateLegsCopper,
            plateBootsCopper,

            chainHelmScorch,
            chainTorsoScorch,
            chainLegsScorch,
            chainBootsScorch,
            scaleHelmScorch,
            scaleTorsoScorch,
            scaleLegsScorch,
            scaleBootsScorch,
            plateHelmScorch,
            plateTorsoScorch,
            plateLegsScorch,
            plateBootsScorch,

            chainHelmRed,
            chainTorsoRed,
            chainLegsRed ,
            chainBootsRed,
            scaleHelmRed ,
            scaleTorsoRed,
            scaleLegsRed ,
            scaleBootsRed,
            plateHelmRed ,
            plateTorsoRed,
            plateLegsRed ,
            plateBootsRed,

            chainHelmBlue,
            chainTorsoBlue,
            chainLegsBlue,
            chainBootsBlue,
            scaleHelmBlue,
            scaleTorsoBlue,
            scaleLegsBlue,
            scaleBootsBlue,
            plateHelmBlue,
            plateTorsoBlue,
            plateLegsBlue,
            plateBootsBlue,

            chainHelmPale,
            chainTorsoPale,
            chainLegsPale,
            chainBootsPale,
            scaleHelmPale,
            scaleTorsoPale,
            scaleLegsPale,
            scaleBootsPale,
            plateHelmPale,
            plateTorsoPale,
            plateLegsPale,
            plateBootsPale,

            longbowLimbBasic,
            longbowLimbStrong,
            shortbowLimbBasic,
            shortbowLimbStrong,
            greatbowLimb,

            bowstringFibre,
            bowstringSilk,
            bowstringFlax,

            shortbow,
            longbow,
            greatbow,

            flax,
            flaxStalk,
            flaxDamp,
            flaxRaw,
            flaxFibre,
            flaxString,

            testRing,
            draftCloak
    };

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){

        for (Item itemIn : itemsOut) event.getRegistry().register(itemIn);

        registerOreDic();
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        for (Item itemIn : itemsOut) registerItemModel(itemIn);

    }

    private static void registerOreDic() {

        OreDictionary.registerOre("ingotCopper", copperIngot);

        OreDictionary.registerOre("ingotBluebronze", blueIngot);
        OreDictionary.registerOre("ingotBronze", blueIngot);

        OreDictionary.registerOre("ingotRedbronze", redIngot);
        OreDictionary.registerOre("ingotBronze", redIngot);

        OreDictionary.registerOre("ingotScorchsteel", scorchIngot);
        OreDictionary.registerOre("ingotSteel", scorchIngot);

        OreDictionary.registerOre("ingotBrass", paleIngot);
        OreDictionary.registerOre("ingotPalebrass", paleIngot);
    }

}
