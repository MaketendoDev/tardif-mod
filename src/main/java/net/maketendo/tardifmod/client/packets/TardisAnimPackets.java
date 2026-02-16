package net.maketendo.tardifmod.client.packets;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.entity.Entity;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;

public class TardisAnimPackets {

    public static void register() {
        PayloadTypeRegistry.playS2C().register(
                TardisAnimPackets.TardisAnimPayload.ID,
                TardisAnimPackets.TardisAnimPayload.CODEC
        );

    }

    public static void send(ServerWorld world, Entity entity, int animId) {
        TardisAnimPayload payload =
                new TardisAnimPayload(entity.getId(), animId);

        for (ServerPlayerEntity player : PlayerLookup.tracking(entity)) {
            ServerPlayNetworking.send(player, payload);
        }
    }

    public record TardisAnimPayload(int entityId, int animId) implements CustomPayload {

        public static final Id<TardisAnimPayload> ID =
                new Id<>(Identifier.of(TARDIFMod.MOD_ID, "tardis_anim"));

        public static final PacketCodec<RegistryByteBuf, TardisAnimPayload> CODEC =
                PacketCodec.tuple(
                        PacketCodecs.INTEGER, TardisAnimPayload::entityId,
                        PacketCodecs.INTEGER, TardisAnimPayload::animId,
                        TardisAnimPayload::new
                );

        @Override
        public Id<? extends CustomPayload> getId() {
            return ID;
        }
    }
}
