package com.example.examplemod.fabric;

import com.example.examplemod.common.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.initialize();
    }
}
