package top.ilov.mcmods.ekac.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.ilov.mcmods.ekac.ekaCItemGroup;
import top.ilov.mcmods.ekac.ekaCMod;
import top.ilov.mcmods.ekac.items.foods.ekaCFoodComponents;
import top.ilov.mcmods.ekac.items.materials.ekaCHatMaterials;

public class ekaCItemsRegistry {

    public static final Item portable_ekac = registerItem("portable_ekac", new Item(new FabricItemSettings().food(ekaCFoodComponents.portable_ekac).group(ekaCItemGroup.itemgroup)));

    public static final Item ekac_hat = registerItem("ekac_hat", new ArmorItem(ekaCHatMaterials.ekaCHat, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ekaCItemGroup.itemgroup)));

    protected static Item registerItem(String name, Item item) {

        return Registry.register(Registry.ITEM, new Identifier(ekaCMod.MOD_ID, name), item);

    }

    public static void registerModItems() {

        ekaCMod.LOGGER.debug("Registering ekaCMod items.");

    }


}
