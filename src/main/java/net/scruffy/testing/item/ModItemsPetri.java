package net.scruffy.testing.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scruffy.testing.Testing;

public class ModItemsPetri {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Testing.MOD_ID);
    public static final RegistryObject<Item> PETRI = ITEMS.register("petri",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.PETRI)));
    public static final RegistryObject<Item> RAW_PETRI = ITEMS.register("raw_petri",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.PETRI)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
