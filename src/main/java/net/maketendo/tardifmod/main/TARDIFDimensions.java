package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

public class TARDIFDimensions {

    public static final Identifier TARDIS_DIM_ID =
            Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "tardis");

    public static final ResourceKey<Level> TARDIS_WORLD =
            ResourceKey.create(Registries.DIMENSION, TARDIS_DIM_ID);

}
