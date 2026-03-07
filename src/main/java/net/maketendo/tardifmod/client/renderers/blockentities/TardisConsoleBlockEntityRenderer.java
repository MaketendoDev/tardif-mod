package net.maketendo.tardifmod.client.renderers.blockentities;

import com.mojang.blaze3d.vertex.PoseStack;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.client.models.console.CrystallineConsoleModel;
import net.maketendo.tardifmod.client.renderers.blockentities.renderstates.TardisConsoleBlockEntityRenderState;
import net.maketendo.tardifmod.main.blockentities.TardisConsoleBlockEntity;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class TardisConsoleBlockEntityRenderer implements BlockEntityRenderer<TardisConsoleBlockEntity, TardisConsoleBlockEntityRenderState> {

    public static final Identifier TEXTURE = TARDIFMod.id("textures/entity/consoles/crystal.png");

    public TardisConsoleBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        super();
    }



    @Override
    public boolean shouldRenderOffScreen() {
        return true;
    }

    @Override
    public TardisConsoleBlockEntityRenderState createRenderState() {
        return new TardisConsoleBlockEntityRenderState();
    }

    @Override
    public void extractRenderState(TardisConsoleBlockEntity blockEntity, TardisConsoleBlockEntityRenderState state, float tickProgress, Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
    }

    @Override
    public void submit(TardisConsoleBlockEntityRenderState blockEntityRenderState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState cameraRenderState) {
        poseStack.pushPose();


        submitNodeCollector.submitModel(
                new CrystallineConsoleModel(CrystallineConsoleModel.createBodyLayer().bakeRoot()),
                13f,
                poseStack,
                RenderTypes.entityCutout(TEXTURE),
                0,
                OverlayTexture.NO_OVERLAY,
                2,
                null
        );

        poseStack.popPose();
    }
}
