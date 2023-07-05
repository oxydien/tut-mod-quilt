package dev.oxydien.tut_mod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutModInit implements ModInitializer {
	public static final String MOD_ID = "tut_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static void Log(String message, Object... objects) {
		LOGGER.info("<TUT_MOD>: " + message,objects);
	}

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}
}
