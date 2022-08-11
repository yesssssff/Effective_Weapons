package net.diopie.effectiveweapons;

import net.diopie.effectiveweapons.entity.client.armor.SpiderArmorRenderer;
import net.diopie.effectiveweapons.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class EffectiveWeaponsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        GeoArmorRenderer.registerArmorRenderer(new SpiderArmorRenderer(), ModItems.CAVE_SPIDER_BOOTS,
                ModItems.CAVE_SPIDER_LEGGINGS, ModItems.CAVE_SPIDER_CHESTPLATE, ModItems.CAVE_SPIDER_HELMET);
    }
}
