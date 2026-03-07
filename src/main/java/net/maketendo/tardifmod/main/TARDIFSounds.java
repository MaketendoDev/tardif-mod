package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import java.util.List;

public class TARDIFSounds {

    public static final SoundEvent DEMATERIALISATION = registerSound("tardis/tardis_demat");
    public static final SoundEvent MATERIALISATION = registerSound("tardis/tardis_mat");
    public static final SoundEvent FLIGHT_LOOP = registerSound("tardis/flight_loop");
    public static final SoundEvent ADVANCEMENT_EARN = registerSound("ui/advancement_earn");

    public static void register() {
    }

    private static SoundEvent registerSound(String id) {
        Identifier identifier = Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, id);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, identifier, SoundEvent.createVariableRangeEvent(identifier));
    }

    public static List<SoundEvent> getSounds(String modid) {
        return BuiltInRegistries.SOUND_EVENT.stream().filter(sound -> sound.location().getNamespace().equals(modid)).toList();
    }
}