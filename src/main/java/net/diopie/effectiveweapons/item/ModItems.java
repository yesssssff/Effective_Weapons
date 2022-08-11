package net.diopie.effectiveweapons.item;

import net.diopie.effectiveweapons.EffectiveWeapons;
import net.diopie.effectiveweapons.item.custom.ModPoisonedBladeItem;
import net.diopie.effectiveweapons.item.custom.SpiderArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BLOOD_SHARD = registerItem("blood_shard",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));


    public static final Item POISONED_BLADE = registerItem("poisoned_blade",
            new ModPoisonedBladeItem(new ModToolMaterials(), 0, 2f));

    public static final Item CAVE_SPIDER_HELMET = registerItem("cave_spider_helmet",
            new SpiderArmorItem(ModArmorMaterials.SPIDER, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item CAVE_SPIDER_CHESTPLATE = registerItem("cave_spider_chestplate",
            new SpiderArmorItem(ModArmorMaterials.SPIDER, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item CAVE_SPIDER_LEGGINGS = registerItem("cave_spider_leggings",
            new SpiderArmorItem(ModArmorMaterials.SPIDER, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item CAVE_SPIDER_BOOTS = registerItem("cave_spider_boots",
            new SpiderArmorItem(ModArmorMaterials.SPIDER, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EffectiveWeapons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EffectiveWeapons.LOGGER.debug("Registering Mod Items for " + EffectiveWeapons.MOD_ID);
    }
}
