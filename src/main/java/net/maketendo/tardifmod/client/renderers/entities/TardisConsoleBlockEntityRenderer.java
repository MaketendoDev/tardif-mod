package net.maketendo.tardifmod.client.renderers.entities;

import net.maketendo.tardifmod.client.models.console.CopperConsoleModel;
import net.maketendo.tardifmod.client.models.console.CrystalConsoleModel;
import net.maketendo.tardifmod.client.models.entities.panel.PowerPanelModel;
import net.maketendo.tardifmod.main.blockentities.TardisConsoleBlockEntity;
import net.maketendo.tardifmod.main.blockentities.panels.PowerPanelBlockEntity;
import net.maketendo.tardifmod.main.blocks.TardisConsoleBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;
import software.bernie.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;

public class TardisConsoleBlockEntityRenderer<
        R extends BlockEntityRenderState & GeoRenderState
        > extends GeoBlockRenderer<TardisConsoleBlockEntity, R> {

    // Cache models (IMPORTANT for performance)
    private static final CrystalConsoleModel CRYSTAL_MODEL = new CrystalConsoleModel();
    private static final CopperConsoleModel COPPER_MODEL = new CopperConsoleModel();

    public TardisConsoleBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        super(CRYSTAL_MODEL);
        withRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
