package net.diopie.effectiveweapons.item;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class ModToolMaterials implements ToolMaterial {

        @Override
        public int getDurability() {
                return 111;
        }

        @Override
        public float getMiningSpeedMultiplier() {
                return 0;
        }

        @Override
        public float getAttackDamage() {
                return 0f;
        }

        @Override
        public int getMiningLevel() {
                return 0;
        }

        @Override
        public int getEnchantability() {
                return 5;
        }

        @Override
        public Ingredient getRepairIngredient() {
                return Ingredient.ofItems(Items.STONE, Items.COBBLESTONE, Items.COBBLED_DEEPSLATE, Items.DEEPSLATE, Items.TUFF, Items.FERMENTED_SPIDER_EYE);
        }
}
