package cn.emotime.ekac.blocks;

import cn.emotime.ekac.itemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import cn.emotime.ekac.ekaC;

public class Blocks {

    public static final CakeBlock EKAC = registerBlock("ekac", new ekaCBlock(FabricBlockSettings.of(Material.CAKE).hardness(1.5f)), itemGroup.TAB);

    private static CakeBlock registerBlock(String name, CakeBlock block, ItemGroup group) {

        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ekaC.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, CakeBlock block, ItemGroup group) {

        return Registry.register(Registry.ITEM, new Identifier(ekaC.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));

    }

    public static void registerModBlocks() {
        ekaC.LOGGER.debug("Registering ekac block.");
    }

}
