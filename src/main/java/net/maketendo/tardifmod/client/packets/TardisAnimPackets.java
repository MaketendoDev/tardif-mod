package net.maketendo.tardifmod.client.packets;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;

public class TardisAnimPackets {

    public static void register() {
        PayloadTypeRegistry.playS2C().register(
                TardisAnimPackets.TardisAnimPayload.ID,
                TardisAnimPackets.TardisAnimPayload.CODEC
        );

    }

    public static void send(ServerLevel world, Entity entity, int animId) {
        TardisAnimPayload payload =
                new TardisAnimPayload(entity.getId(), animId);

        for (ServerPlayer player : PlayerLookup.tracking(entity)) {
            ServerPlayNetworking.send(player, payload);
        }
    }

    public record TardisAnimPayload(int entityId, int animId) implements CustomPacketPayload {

        public static final Type<TardisAnimPayload> ID =
                new Type<>(Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "tardis_anim"));

        public static final StreamCodec<RegistryFriendlyByteBuf, TardisAnimPayload> CODEC =
                StreamCodec.composite(
                        ByteBufCodecs.INT, TardisAnimPayload::entityId,
                        ByteBufCodecs.INT, TardisAnimPayload::animId,
                        TardisAnimPayload::new
                );

        @Override
        public Type<? extends CustomPacketPayload> type() {
            return ID;
        }
    }
}
