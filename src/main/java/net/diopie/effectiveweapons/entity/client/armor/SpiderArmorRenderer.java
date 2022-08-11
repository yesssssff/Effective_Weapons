package net.diopie.effectiveweapons.entity.client.armor;

import net.diopie.effectiveweapons.item.custom.SpiderArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SpiderArmorRenderer extends GeoArmorRenderer<SpiderArmorItem> {
    public SpiderArmorRenderer() {
        super(new SpiderArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";

    }
}
