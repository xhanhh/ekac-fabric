package top.ilov.mcmods.ekac.blocks;

import net.minecraft.sound.BlockSoundGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.ilov.mcmods.ekac.itemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import top.ilov.mcmods.ekac.ekaC;

public class Blocks {

    public static final Logger LOGGER = LoggerFactory.getLogger(ekaC.MOD_ID);

    public static final CakeBlock EKAC = registerBlock("ekac", new ekaCBlock(FabricBlockSettings.of(Material.CAKE).hardness(0.5f).sounds(BlockSoundGroup.WOOL)), itemGroup.TAB);

    private static CakeBlock registerBlock(String name, CakeBlock block, ItemGroup group) {

        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ekaC.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, CakeBlock block, ItemGroup group) {

        return Registry.register(Registry.ITEM, new Identifier(ekaC.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));

    }

    public static void registerModBlocks() {
        LOGGER.debug("Registering ekac block.");
    }

}
