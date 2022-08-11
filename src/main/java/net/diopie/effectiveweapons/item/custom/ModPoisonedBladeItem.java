package net.diopie.effectiveweapons.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModPoisonedBladeItem extends SwordItem {
    public ModPoisonedBladeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(ItemGroup.COMBAT));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 150, 2), attacker);
        return super.postHit(stack, target, attacker);
    }
}
