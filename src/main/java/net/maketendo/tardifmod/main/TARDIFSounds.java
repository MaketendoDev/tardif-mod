package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.List;

public class TARDIFSounds {

    public static final SoundEvent DEMATERIALISATION = registerSound("tardis/tardis_demat");
    public static final SoundEvent MATERIALISATION = registerSound("tardis/tardis_mat");
    public static final SoundEvent FLIGHT_LOOP = registerSound("tardis/flight_loop");

    public static void register() {
    }

    private static SoundEvent registerSound(String id) {
        Identifier identifier = Identifier.of(TARDIFMod.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static List<SoundEvent> getSounds(String modid) {
        return Registries.SOUND_EVENT.stream().filter(sound -> sound.id().getNamespace().equals(modid)).toList();
    }
}