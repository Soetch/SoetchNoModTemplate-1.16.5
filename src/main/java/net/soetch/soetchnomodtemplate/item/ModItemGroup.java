package net.soetch.soetchnomodtemplate.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup SOETCHNOMODTEMPLATE_GROUP = new ItemGroup("snmtModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };
}
