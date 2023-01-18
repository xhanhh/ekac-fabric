package top.ilov.mcmods.ekac.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.ilov.mcmods.ekac.ekaC;
import top.ilov.mcmods.ekac.ekaCItemGroup;

public class ekacModBlocks {

    public static final CakeBlock EKAC = registerCakeBlock("ekac", new ekaCBlock(FabricBlockSettings.of(Material.CAKE).hardness(0.5f).sounds(BlockSoundGroup.WOOL)),
            ekaCItemGroup.itemgroup);

    private static CakeBlock registerCakeBlock(String name, CakeBlock block, ItemGroup group) {

        registerCakeBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ekaC.MOD_ID, name), block);

    }

    private static Item registerCakeBlockItem(String name, CakeBlock block, ItemGroup group) {

        return Registry.register(Registry.ITEM, new Identifier(ekaC.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));

    }

    public static void registerModBlocks() {
        ekaC.LOGGER.debug("Registering ekac block.");
    }

}
