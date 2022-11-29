package red.moid.luaj;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.event.lifecycle.v1.*;

import org.luaj.vm2.Globals;
import org.luaj.vm2.lib.jse.JsePlatform;

public class LuajMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("luaj");
	//public static final Globals globals = JsePlatform.standardGlobals();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("至高神降临!");
		/*
		globals.load("a=7;print('77777777777')").call();
		
		ServerWorldEvents.LOAD.register((server, world) -> {
			LOGGER.info("god!");
			globals.load("print(a)").call();
		});
		*/
		
		/*
		ServerTickEvents.END_WORLD_TICK.register((world) -> {
			LOGGER.info("a22222+\n");
		});
		*/
	}
	
	public void reload() {
		
	}
}
