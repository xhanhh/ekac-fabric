package top.ilov.mcmods.ekac;

import net.fabricmc.api.ModInitializer;
import top.ilov.mcmods.ekac.blocks.ekacModBlocks;

public class ekaC implements ModInitializer {

	public static final String MOD_ID = "ekac";

	@Override
	public void onInitialize() {

		ekacModBlocks.registerModBlocks();
		ekaCItemGroup.register();

	}
}
