package dev.oxydien.tut_mod.blocks;

import dev.oxydien.tut_mod.TutModInit;
import dev.oxydien.tut_mod.items.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {

	public static final Block URANIUM_BLOCK = registerBlock("uranium_block",
		new Block(QuiltBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).luminance(3).requiresTool()));
	public static final Block RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block",
		new Block(QuiltBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).luminance(1).requiresTool()));

	private static Item registerBlockItem(String name, Block block) {
		Item item = Registry.register(Registries.ITEM, new Identifier(TutModInit.MOD_ID, name),
			new BlockItem(block, new QuiltItemSettings()));
		ModItems.AddItemToGroup(item);
		return item;
	}

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name,block);
		return Registry.register(Registries.BLOCK, new Identifier(TutModInit.MOD_ID, name), block);
	}

	public static void registerModBlocks() {
		TutModInit.Log("Registruji blocky");
	}
}
