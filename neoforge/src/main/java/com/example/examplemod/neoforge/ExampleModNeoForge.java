package com.example.examplemod.neoforge;

import com.example.examplemod.common.ExampleMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ExampleMod.MOD_ID)
public class ExampleModNeoForge {
    public ExampleModNeoForge(IEventBus modEventBus) {
        ExampleMod.initialize();
    }
}