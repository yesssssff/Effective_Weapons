package net.diopie.effectiveweapons.entity.client.armor;

import net.diopie.effectiveweapons.EffectiveWeapons;
import net.diopie.effectiveweapons.item.custom.SpiderArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SpiderArmorModel extends AnimatedGeoModel<SpiderArmorItem> {
    @Override
    public Identifier getModelResource(SpiderArmorItem object) {
        return new Identifier(EffectiveWeapons.MOD_ID, "geo/spider_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(SpiderArmorItem object) {
        return new Identifier(EffectiveWeapons.MOD_ID, "textures/models/armor/spider_armor_texture");
    }

    @Override
    public Identifier getAnimationResource(SpiderArmorItem animatable) {
        return new Identifier(EffectiveWeapons.MOD_ID, "animations/armor_animation.json");
    }
}
