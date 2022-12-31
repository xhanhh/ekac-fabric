package top.ilov.mcmods.ekac;

import top.ilov.mcmods.ekac.blocks.Blocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class itemGroup {

    public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier(ekaC.MOD_ID, "tab"), () -> new ItemStack(Blocks.EKAC));

}
