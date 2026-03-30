package com.example.examplemod.forge;

import com.example.examplemod.common.ExampleMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();
        ExampleMod.initialize();
    }
}