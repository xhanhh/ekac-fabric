package top.ilov.mcmods.ekac.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.ilov.mcmods.ekac.ekaC;

public class ekacModBlocks {

    public static final Logger LOGGER = LoggerFactory.getLogger(ekaC.MOD_ID);

    public static final CakeBlock ekac = registerCakeBlock("ekac", new ekacBlock(FabricBlockSettings.of(Material.CAKE).hardness(0.5F)
            .sounds(BlockSoundGroup.WOOL)));

    private static CakeBlock registerCakeBlock(String name, CakeBlock block) {

        registerCakeBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ekaC.MOD_ID, name), block);

    }

    private static Item registerCakeBlockItem(String name, CakeBlock block) {

        return Registry.register(Registries.ITEM, new Identifier(ekaC.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {
        LOGGER.debug("Registering ekac block.");
    }
}
