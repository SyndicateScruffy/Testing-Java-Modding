package net.scruffy.testing.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scruffy.testing.Testing;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Testing.MOD_ID);

    public static final RegistryObject<Item> TERRI = ITEMS.register("terri",
                    () -> new Item(new Item.Properties().tab(ModCreativeModTab.TERRI)));
    public static final RegistryObject<Item> PETRI = ITEMS.register("petri",
                    () -> new Item(new Item.Properties().tab(ModCreativeModTab.PETRI)));

            public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
            }
}
