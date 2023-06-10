package top.ilov.mcmods.ekac;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.ilov.mcmods.ekac.blocks.ekaCBlocksRegistry;
import top.ilov.mcmods.ekac.items.ekaCItemsRegistry;

import static top.ilov.mcmods.ekac.ekaCItemGroup.ITEM_GROUP;

public class ekaCMod implements ModInitializer {

	public static final String MOD_ID = "ekac";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

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
