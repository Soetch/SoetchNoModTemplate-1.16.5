package net.soetch.soetchnomodtemplate.item;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.soetch.soetchnomodtemplate.util.Reference;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties().group(ModItemGroup.SOETCHNOMODTEMPLATE_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
