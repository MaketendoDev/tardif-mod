package net.maketendo.tardifmod.mixins.client;

import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashSet;
import java.util.Set;

@Mixin(ClientLevel.class)
public abstract class ClientWorldMixin {

    @Shadow
    @Final
    @Mutable
    private static Set<Item> MARKER_PARTICLE_ITEMS;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void addCustomBlockMarkerItem(CallbackInfo ci) {
        Set<Item> newSet = new HashSet<>(MARKER_PARTICLE_ITEMS);
        newSet.add(TARDIFBlocks.TARDIS_LIGHT_BLOCK.asItem());
        MARKER_PARTICLE_ITEMS = Set.copyOf(newSet);
    }
}
