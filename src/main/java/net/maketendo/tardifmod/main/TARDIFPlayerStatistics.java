package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;

public class TARDIFPlayerStatistics {

    public static final Identifier INTERACT_WITH_TARDIS = registerStatistic("interact_with_tardis");
    public static final Identifier LOCKED_TARDIS = registerStatistic("locked_tardis");
    public static final Identifier DEMAT_TARDIS = registerStatistic("demat_tardis");

    public static void register() {
        Stats.CUSTOM.getOrCreateStat(INTERACT_WITH_TARDIS, StatFormatter.DEFAULT);
        Stats.CUSTOM.getOrCreateStat(LOCKED_TARDIS, StatFormatter.DEFAULT);
        Stats.CUSTOM.getOrCreateStat(DEMAT_TARDIS, StatFormatter.DEFAULT);
    }

    private static Identifier registerStatistic(String id) {
        Identifier identifier = Identifier.of(TARDIFMod.MOD_ID, id);
        Registry.register(Registries.CUSTOM_STAT, id, identifier);
        return identifier;
    }
}
