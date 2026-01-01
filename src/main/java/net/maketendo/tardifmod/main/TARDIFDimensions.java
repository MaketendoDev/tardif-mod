package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class TARDIFDimensions {

    public static final Identifier TARDIS_DIM_ID =
            Identifier.of(TARDIFMod.MOD_ID, "tardis");

    public static final RegistryKey<World> TARDIS_WORLD =
            RegistryKey.of(RegistryKeys.WORLD, TARDIS_DIM_ID);

}
