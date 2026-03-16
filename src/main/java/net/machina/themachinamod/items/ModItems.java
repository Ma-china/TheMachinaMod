package net.machina.themachinamod.items;

import net.machina.themachinamod.TutorialMod;
import net.machina.themachinamod.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {

    // Single DeferredRegister for all items (including RecordItem)
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    // Normal item
    public static final RegistryObject<Item> HAMMERANDSICKLE = ITEMS.register("hammerandsickle",
            () -> new Item(new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(1)));

    // Food item
    public static final RegistryObject<Item> SOVIETCORE = ITEMS.register("sovietcore",
            () -> new Item(new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .food(ModFoodProperties.SOVIETCORE)
                    .stacksTo(1)));

    // Music disc as RecordItem
    public static final RegistryObject<Item> SOVIETMUSICDISC = ITEMS.register("sovietmusicdisc",
            () -> new RecordItem(
                    100, // comparator output
                    (Supplier) ModSounds.SOVIET_ANTHEM, // sound supplier
                    new RecordItem.Properties()
                            .rarity(Rarity.EPIC)
                            .stacksTo(1),
                    0 // delay
            ));


    // Register items
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}