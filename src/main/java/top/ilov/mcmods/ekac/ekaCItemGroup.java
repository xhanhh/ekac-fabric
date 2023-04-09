package top.ilov.mcmods.ekac;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import top.ilov.mcmods.ekac.blocks.ekaCBlocksRegistry;

public class ekaCItemGroup {

    public static final ItemGroup itemgroup = FabricItemGroupBuilder.build(new Identifier(ekaCMod.MOD_ID, "tab"), () -> new ItemStack(ekaCBlocksRegistry.EKAC));

}
