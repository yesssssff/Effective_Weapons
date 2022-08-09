package net.diopie.effectiveweapons.item;

import net.diopie.effectiveweapons.EffectiveWeapons;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BLOOD_SHARD = registerItem("blood_shard",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EffectiveWeapons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EffectiveWeapons.LOGGER.debug("Registering Mod Items for " + EffectiveWeapons.MOD_ID);
    }
}
