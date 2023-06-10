package top.ilov.mcmods.ekac;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static top.ilov.mcmods.ekac.ekaCMod.MOD_ID;

public class ekaCItemGroup {

    protected static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "group"));

}
