package dev.asyncbanana.divine_origins;

import net.fabricmc.api.ModInitializer;
import dev.asyncbanana.divine_origins.actions.Entity_Actions;

public class divine_origins implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	// public static final Logger LOGGER = LogManager.getLogger("Divine_Origins");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Entity_Actions.register();
	}
}
