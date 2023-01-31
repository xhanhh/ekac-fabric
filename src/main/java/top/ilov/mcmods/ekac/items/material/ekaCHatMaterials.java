package top.ilov.mcmods.ekac.items.material;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.Util;
import top.ilov.mcmods.ekac.items.ekaCItemsRegistry;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ekaCHatMaterials implements ArmorMaterial {

    ekaCHat("ekac_hat", 5, Util.make(new EnumMap(ArmorItem.Type.class),
            (map) -> map.put(ArmorItem.Type.HELMET, 1)), 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            0.0F, 0.0F, () -> Ingredient.ofItems(ekaCItemsRegistry.ekac_hat),
            true);

    private static final EnumMap BASE_DURABILITY = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> map.put(ArmorItem.Type.HELMET, 11));
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;
    private final boolean trimmable;

    private ekaCHatMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier, boolean trimmable) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<>(repairIngredientSupplier);
        this.trimmable = trimmable;
    }

    public int getDurability(ArmorItem.Type type) {
        return (Integer)BASE_DURABILITY.get(type) * this.durabilityMultiplier;
    }

    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts.get(type);
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public boolean isTrimmable() {
        return this.trimmable;
    }

}
