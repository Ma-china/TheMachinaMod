package net.machina.themachinamod.items;

import net.machina.themachinamod.TutorialMod;
import net.machina.themachinamod.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> HAMMERANDSICKLE = ITEMS.register("hammerandsickle",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SOVIETMUSICDISC = ITEMS.register("sovietmusicdisc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SOVIET_ANTHEM_KEY).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
