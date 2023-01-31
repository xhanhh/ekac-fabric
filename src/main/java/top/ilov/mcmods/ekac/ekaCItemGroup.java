package top.ilov.mcmods.ekac;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import top.ilov.mcmods.ekac.blocks.ekaCBlocksRegistry;
import top.ilov.mcmods.ekac.items.ekaCItemsRegistry;

public class ekaCItemGroup {

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier(ekaCMod.MOD_ID, "tab"))
            .icon(() -> new ItemStack(ekaCBlocksRegistry.ekac)).build();

    static {

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(ekaCItemGroup::setItemGroup);

    }

    protected static void setItemGroup(FabricItemGroupEntries entries) {

        entries.add(ekaCBlocksRegistry.ekac);
        entries.add(ekaCItemsRegistry.ekac_hat);

    }

    public static void register() {}

}
