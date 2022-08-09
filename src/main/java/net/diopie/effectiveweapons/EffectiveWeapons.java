package net.diopie.effectiveweapons;

import net.diopie.effectiveweapons.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EffectiveWeapons implements ModInitializer {

	public static final String MOD_ID = "effectiveweapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
