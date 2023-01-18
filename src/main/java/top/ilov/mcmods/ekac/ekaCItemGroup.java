package top.ilov.mcmods.ekac;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import top.ilov.mcmods.ekac.blocks.ekacModBlocks;

public class ekaCItemGroup{

    public static final ItemGroup itemGroup = FabricItemGroup.builder(new Identifier(ekaC.MOD_ID, "tab"))
            .icon(() -> new ItemStack(ekacModBlocks.ekac)).build();

    static {

        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(ekaCItemGroup::setItemGroup);

    }

    protected static void setItemGroup(FabricItemGroupEntries entries) {

        entries.add(ekacModBlocks.ekac);

    }

    public static void register() {}

}
