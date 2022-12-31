package top.ilov.mcmods.ekac;

import top.ilov.mcmods.ekac.blocks.Blocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ekaC implements ModInitializer {

	public static final String MOD_ID = "ekac";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Blocks.registerModBlocks();
		LOGGER.info("Hello ekaC!");

	}
}
