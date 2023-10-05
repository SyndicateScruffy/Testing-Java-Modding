package net.scruffy.testing.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.units.qual.C;

public class ModCreativeModTab {
    public static final CreativeModeTab TERRI = new CreativeModeTab("territab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TERRI.get());
        }
    };
    public static final CreativeModeTab PETRI = new CreativeModeTab("petritab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PETRI.get());
        }
    };
}
