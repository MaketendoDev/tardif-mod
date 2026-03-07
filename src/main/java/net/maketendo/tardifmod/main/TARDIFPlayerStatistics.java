package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;

public class TARDIFPlayerStatistics {

    public static final Identifier INTERACT_WITH_TARDIS = registerStatistic("interact_with_tardis");
    public static final Identifier LOCKED_TARDIS = registerStatistic("locked_tardis");
    public static final Identifier DEMAT_TARDIS = registerStatistic("demat_tardis");

    public static void register() {
        Stats.CUSTOM.get(INTERACT_WITH_TARDIS, StatFormatter.DEFAULT);
        Stats.CUSTOM.get(LOCKED_TARDIS, StatFormatter.DEFAULT);
        Stats.CUSTOM.get(DEMAT_TARDIS, StatFormatter.DEFAULT);
    }

    private static Identifier registerStatistic(String id) {
        Identifier identifier = Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, id);
        Registry.register(BuiltInRegistries.CUSTOM_STAT, id, identifier);
        return identifier;
    }
}
