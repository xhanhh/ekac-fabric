package top.ilov.mcmods.ekac.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CakeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import top.ilov.mcmods.ekac.ekaCMod;

public class ekaCBlocksRegistry {

    public static final CakeBlock ekac = registerCakeBlock("ekac", new ekaCBlock(FabricBlockSettings.create().hardness(0.5F)
            .sounds(BlockSoundGroup.WOOL)));

    protected static CakeBlock registerCakeBlock(String name, CakeBlock block) {

        registerCakeBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ekaCMod.MOD_ID, name), block);

    }

    protected static Item registerCakeBlockItem(String name, CakeBlock block) {

        return Registry.register(Registries.ITEM, new Identifier(ekaCMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {

        ekaCMod.LOGGER.debug("Registering ekaCMod blocks.");

    }

}
