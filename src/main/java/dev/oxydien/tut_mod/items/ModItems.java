package dev.oxydien.tut_mod.items;

import dev.oxydien.tut_mod.TutModInit;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
	public static final Item URANIUM = registerItem("uranium",
		new Item(new QuiltItemSettings()));
	public static final Item RAW_URANIUM = registerItem("raw_uranium",
		new Item(new QuiltItemSettings()));

	private static Item registerItem(String name, Item item) {
		Item NITEM = Registry.register(Registries.ITEM, new Identifier(TutModInit.MOD_ID, name), item);
		AddItemToGroup(NITEM);
		return NITEM;
	}

	public static void AddItemToGroup(Item item) {
		ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP,
			new Identifier(TutModInit.MOD_ID, "tut_mod_group")))
			.register(entries -> {
				entries.addItem(item);
			});
	}

	public static void registerModItems() {
		TutModInit.Log("Registruji itemy");
	}
}
