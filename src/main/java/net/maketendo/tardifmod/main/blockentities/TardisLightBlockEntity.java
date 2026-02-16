package net.maketendo.tardifmod.main.blockentities;


import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.maketendo.tardifmod.main.blocks.TardisLightBlock;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.utils.TardisWorldUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TardisLightBlockEntity extends BlockEntity {

    public TardisLightBlockEntity(BlockPos pos, BlockState state) {
        super(TARDIFBlockEntities.TARDIS_LIGHT_BLOCK, pos, state);
    }

    public static void tick(World world, BlockPos pos, BlockState state, TardisLightBlockEntity be) {
        if (world.isClient()) return;

        TardisData data = TardisWorldUtil.getTardisData(world, pos);
        if (data == null) return;

        int targetLight;

        if (!data.powered) {
            targetLight = 0;
        } else {
            targetLight = Math.max(0, Math.min(15, data.roundelLight));
        }

        if (state.get(TardisLightBlock.LEVEL) != targetLight) {
            world.setBlockState(
                    pos,
                    state.with(TardisLightBlock.LEVEL, targetLight),
                    Block.NOTIFY_LISTENERS
            );
        }
    }

    
}

