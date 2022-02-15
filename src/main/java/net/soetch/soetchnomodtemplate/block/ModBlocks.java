package net.soetch.soetchnomodtemplate.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.soetch.soetchnomodtemplate.item.ModItemGroup;
import net.soetch.soetchnomodtemplate.item.ModItems;
import net.soetch.soetchnomodtemplate.util.Reference;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    // Register blocks here
    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)));
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(0).hardnessAndResistance(5f)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.SOETCHNOMODTEMPLATE_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
