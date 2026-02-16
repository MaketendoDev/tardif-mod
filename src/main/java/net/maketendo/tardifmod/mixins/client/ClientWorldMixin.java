package net.maketendo.tardifmod.mixins.client;

import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashSet;
import java.util.Set;

@Mixin(ClientWorld.class)
public abstract class ClientWorldMixin {

    @Shadow
    @Final
    @Mutable
    private static Set<Item> BLOCK_MARKER_ITEMS;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void addCustomBlockMarkerItem(CallbackInfo ci) {
        Set<Item> newSet = new HashSet<>(BLOCK_MARKER_ITEMS);
        newSet.add(TARDIFBlocks.TARDIS_LIGHT_BLOCK.asItem());
        BLOCK_MARKER_ITEMS = Set.copyOf(newSet);
    }
}
