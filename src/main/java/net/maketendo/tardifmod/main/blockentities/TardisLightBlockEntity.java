package net.maketendo.tardifmod.main.blockentities;


import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.maketendo.tardifmod.main.blocks.TardisLightBlock;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class TardisLightBlockEntity extends BlockEntity {

    public TardisLightBlockEntity(BlockPos pos, BlockState state) {
        super(TARDIFBlockEntities.TARDIS_LIGHT_BLOCK, pos, state);
    }

    public static void tick(Level world, BlockPos pos, BlockState state, TardisLightBlockEntity be) {
        if (world.isClientSide()) return;

        TardisData data = TardisManager.getTardisData(world, pos);
        if (data == null) return;

        int targetLight;

        if (!data.powered) {
            targetLight = 0;
        } else {
            targetLight = Math.max(0, Math.min(15, data.roundelLight));
        }

        if (state.getValue(TardisLightBlock.LEVEL) != targetLight) {
            world.setBlock(
                    pos,
                    state.setValue(TardisLightBlock.LEVEL, targetLight),
                    Block.UPDATE_CLIENTS
            );
        }
    }

    
}

