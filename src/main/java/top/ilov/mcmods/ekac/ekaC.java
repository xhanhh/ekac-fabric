package top.ilov.mcmods.ekac;

import top.ilov.mcmods.ekac.blocks.Blocks;
import net.fabricmc.api.ModInitializer;

public class ekaC implements ModInitializer {

	public static final String MOD_ID = "ekac";

	@Override
	public void onInitialize() {

		Blocks.registerModBlocks();

	}
}
