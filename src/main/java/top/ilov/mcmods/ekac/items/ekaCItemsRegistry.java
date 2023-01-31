package top.ilov.mcmods.ekac.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.ilov.mcmods.ekac.ekaCMod;
import top.ilov.mcmods.ekac.items.material.ekaCHatMaterials;

public class ekaCItemsRegistry {

    public static final Item ekac_hat = registerItem("ekac_hat", new ArmorItem(ekaCHatMaterials.ekaCHat, ArmorItem.Type.HELMET,
            new FabricItemSettings().maxCount(16)));

    protected static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(ekaCMod.MOD_ID, name), item);

    }

    public static void registerModItems() {

        ekaCMod.LOGGER.debug("Registering ekaCMod items.");

    }

}
