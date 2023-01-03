package com.nikkolaka.lostcraft;

import com.nikkolaka.lostcraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class LostCraft implements ModInitializer {

    public static final String MOD_ID = "lostcraft";


    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
