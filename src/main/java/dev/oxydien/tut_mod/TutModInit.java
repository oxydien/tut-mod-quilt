package dev.oxydien.tut_mod;

import dev.oxydien.tut_mod.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutModInit implements ModInitializer {
	public static final String MOD_ID = "tut_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup TutModGroup = FabricItemGroup.builder()
		.name(Text.translatable("itemgroup.tut_mod.group"))
		.icon(() -> new ItemStack(ModItems.URANIUM)).build();
	public static void Log(String message, Object... objects) {
		LOGGER.info("<TUT_MOD>: " + message,objects);
	}

	@Override
	public void onInitialize(ModContainer mod) {
		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID,"tut_mod_group"),TutModGroup);

		ModItems.registerModItems();
	}
}
