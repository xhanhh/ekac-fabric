package top.ilov.mcmods.ekac;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.ilov.mcmods.ekac.blocks.ekaCBlocksRegistry;
import top.ilov.mcmods.ekac.items.ekaCItemsRegistry;
import top.ilov.mcmods.ekac.util.UpdateUtil;

import java.io.IOException;

import static top.ilov.mcmods.ekac.ekaCItemGroup.ITEM_GROUP;

public class ekaCMod implements ModInitializer {

	public static final String MOD_ID = "ekac";
	public static final int VERSION_TAG = 221002;
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Config.config.load();

		if (FabricLoader.getInstance().isModLoaded("yet_another_config_lib_v3")) {

			try {
				UpdateUtil.CheckUpdate();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		ekaCBlocksRegistry.registerModBlocks();
		ekaCItemsRegistry.registerModItems();

		Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
				.displayName(Text.translatable("itemGroup.ekac.tab"))
				.icon(() -> new ItemStack(ekaCBlocksRegistry.ekac))
				.entries((context, entries) -> {
					entries.add(ekaCBlocksRegistry.ekac);
					entries.add(ekaCItemsRegistry.portable_ekac);
					entries.add(ekaCItemsRegistry.ekac_hat);
				})
				.build()
		);

	}

}
