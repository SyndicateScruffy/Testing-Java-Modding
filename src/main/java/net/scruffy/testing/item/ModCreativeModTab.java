package net.scruffy.testing.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab TERRI = new CreativeModeTab("territab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemsTerri.TERRI.get());
        }
    };
    public static final CreativeModeTab PETRI = new CreativeModeTab("petritab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemsPetri.PETRI.get());
        }
    };
}
