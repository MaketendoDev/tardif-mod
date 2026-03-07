package net.maketendo.tardifmod.client.models.console;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;


public class CrystallineConsoleModel<T extends Entity> extends EntityModel<EntityRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "crystalline_console"), "main");
	private final ModelPart console;
	private final ModelPart rotor;
	private final ModelPart pannels;
	private final ModelPart pannel;
	private final ModelPart slope;
	private final ModelPart controls;
	private final ModelPart switches;
	private final ModelPart switch1;
	private final ModelPart switch3;
	private final ModelPart switch2;
	private final ModelPart tap;
	private final ModelPart pannel2;
	private final ModelPart slope2;
	private final ModelPart controls2;
	private final ModelPart tap2;
	private final ModelPart topofbell;
	private final ModelPart pannel3;
	private final ModelPart slope3;
	private final ModelPart controls3;
	private final ModelPart switches2;
	private final ModelPart switch4;
	private final ModelPart switch5;
	private final ModelPart switch6;
	private final ModelPart pannel4;
	private final ModelPart slope4;
	private final ModelPart controls4;
	private final ModelPart tap3;
	private final ModelPart pannel5;
	private final ModelPart slope5;
	private final ModelPart controls5;
	private final ModelPart switches4;
	private final ModelPart switch11;
	private final ModelPart switch10;
	private final ModelPart switches5;
	private final ModelPart switch12;
	private final ModelPart switch13;
	private final ModelPart switches3;
	private final ModelPart switch7;
	private final ModelPart switch8;
	private final ModelPart switch9;
	private final ModelPart pannel6;
	private final ModelPart slope6;
	private final ModelPart controls6;
	private final ModelPart taps;
	private final ModelPart taps2;
	private final ModelPart taps3;
	private final ModelPart taps4;
	private final ModelPart dividers;
	private final ModelPart dividercontrols5;
	private final ModelPart dividercontrols4;
	private final ModelPart hourglass2;
	private final ModelPart dividercontrols;
	private final ModelPart lever;
	private final ModelPart lever2;
	private final ModelPart dividercontrols2;
	private final ModelPart dividercontrols3;
	private final ModelPart hourglass;
	private final ModelPart scanners;

	public CrystallineConsoleModel(ModelPart root) {
        super(root);
        this.console = root.getChild("console");
		this.rotor = this.console.getChild("rotor");
		this.pannels = this.console.getChild("pannels");
		this.pannel = this.pannels.getChild("pannel");
		this.slope = this.pannel.getChild("slope");
		this.controls = this.slope.getChild("controls");
		this.switches = this.controls.getChild("switches");
		this.switch1 = this.switches.getChild("switch");
		this.switch3 = this.switches.getChild("switch3");
		this.switch2 = this.switches.getChild("switch2");
		this.tap = this.controls.getChild("tap");
		this.pannel2 = this.pannels.getChild("pannel2");
		this.slope2 = this.pannel2.getChild("slope2");
		this.controls2 = this.slope2.getChild("controls2");
		this.tap2 = this.controls2.getChild("tap2");
		this.topofbell = this.controls2.getChild("topofbell");
		this.pannel3 = this.pannels.getChild("pannel3");
		this.slope3 = this.pannel3.getChild("slope3");
		this.controls3 = this.slope3.getChild("controls3");
		this.switches2 = this.controls3.getChild("switches2");
		this.switch4 = this.switches2.getChild("switch4");
		this.switch5 = this.switches2.getChild("switch5");
		this.switch6 = this.switches2.getChild("switch6");
		this.pannel4 = this.pannels.getChild("pannel4");
		this.slope4 = this.pannel4.getChild("slope4");
		this.controls4 = this.slope4.getChild("controls4");
		this.tap3 = this.controls4.getChild("tap3");
		this.pannel5 = this.pannels.getChild("pannel5");
		this.slope5 = this.pannel5.getChild("slope5");
		this.controls5 = this.slope5.getChild("controls5");
		this.switches4 = this.controls5.getChild("switches4");
		this.switch11 = this.switches4.getChild("switch11");
		this.switch10 = this.switches4.getChild("switch10");
		this.switches5 = this.controls5.getChild("switches5");
		this.switch12 = this.switches5.getChild("switch12");
		this.switch13 = this.switches5.getChild("switch13");
		this.switches3 = this.controls5.getChild("switches3");
		this.switch7 = this.switches3.getChild("switch7");
		this.switch8 = this.switches3.getChild("switch8");
		this.switch9 = this.switches3.getChild("switch9");
		this.pannel6 = this.pannels.getChild("pannel6");
		this.slope6 = this.pannel6.getChild("slope6");
		this.controls6 = this.slope6.getChild("controls6");
		this.taps = this.controls6.getChild("taps");
		this.taps2 = this.taps.getChild("taps2");
		this.taps3 = this.taps.getChild("taps3");
		this.taps4 = this.taps.getChild("taps4");
		this.dividers = this.console.getChild("dividers");
		this.dividercontrols5 = this.dividers.getChild("dividercontrols5");
		this.dividercontrols4 = this.dividers.getChild("dividercontrols4");
		this.hourglass2 = this.dividercontrols4.getChild("hourglass2");
		this.dividercontrols = this.dividers.getChild("dividercontrols");
		this.lever = this.dividercontrols.getChild("lever");
		this.lever2 = this.dividercontrols.getChild("lever2");
		this.dividercontrols2 = this.dividers.getChild("dividercontrols2");
		this.dividercontrols3 = this.dividers.getChild("dividercontrols3");
		this.hourglass = this.dividercontrols3.getChild("hourglass");
		this.scanners = this.dividers.getChild("scanners");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition console = partdefinition.addOrReplaceChild("console", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rotor = console.addOrReplaceChild("rotor", CubeListBuilder.create(), PartPose.offset(8.0F, -2.0F, -8.0F));

		PartDefinition cube_r1 = rotor.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 69).addBox(0.0F, -15.5F, -7.0F, 0.0F, 43.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 83).mirror().addBox(-7.0F, -15.5F, 0.0F, 14.0F, 43.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, -26.5F, 8.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition pannels = console.addOrReplaceChild("pannels", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pannel = pannels.addOrReplaceChild("pannel", CubeListBuilder.create().texOffs(44, 12).addBox(-5.0F, -21.998F, -7.6602F, 10.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-3, 56).addBox(-5.0F, -22.001F, -10.6602F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-10.0F, -15.1F, -19.0526F, 20.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = pannel.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(29, 0).addBox(-11.0F, -6.0F, 5.6F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.5708F, 0.0F, 0.0F));

		PartDefinition slope = pannel.addOrReplaceChild("slope", CubeListBuilder.create().texOffs(0, 66).addBox(-11.0F, -6.0F, -0.2F, 22.0F, 14.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(-11.0F, -4.1F, -0.8F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.2654F, 0.0F, 0.0F));

		PartDefinition controls = slope.addOrReplaceChild("controls", CubeListBuilder.create().texOffs(22, 29).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = controls.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(51, 31).addBox(1.3767F, 0.6696F, -1.4021F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3F, -0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r4 = controls.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 31).addBox(1.3767F, 0.6696F, -1.4021F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.0F, -0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition switches = controls.addOrReplaceChild("switches", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, 4.0F, -0.1F, 0.0F, 0.0F, 0.5236F));

		PartDefinition switch1 = switches.addOrReplaceChild("switch", CubeListBuilder.create().texOffs(47, 26).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 2.0F, -0.5F));

		PartDefinition switch3 = switches.addOrReplaceChild("switch3", CubeListBuilder.create().texOffs(47, 26).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -2.0F, -0.5F));

		PartDefinition switch2 = switches.addOrReplaceChild("switch2", CubeListBuilder.create().texOffs(47, 26).mirror().addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5F, 0.0F, -0.5F));

		PartDefinition tap = controls.addOrReplaceChild("tap", CubeListBuilder.create().texOffs(42, 29).addBox(-0.4F, -0.5F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 20).addBox(-0.5F, -0.5F, -2.4F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 3.3F, -0.2F));

		PartDefinition pannel2 = pannels.addOrReplaceChild("pannel2", CubeListBuilder.create().texOffs(44, 12).addBox(-5.0F, -22.0F, -7.6602F, 10.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-3, 56).addBox(-5.0F, -22.002F, -10.6602F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-10.0F, -15.1F, -19.0526F, 20.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r5 = pannel2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(29, 0).addBox(-11.0F, -6.0F, 5.6F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.5708F, 0.0F, 0.0F));

		PartDefinition slope2 = pannel2.addOrReplaceChild("slope2", CubeListBuilder.create().texOffs(0, 66).addBox(-11.0F, -6.0F, -0.2F, 22.0F, 14.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(-11.0F, -4.1F, -0.8F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(84, 24).addBox(-11.0F, -4.1F, -0.9F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.2654F, 0.0F, 0.0F));

		PartDefinition controls2 = slope2.addOrReplaceChild("controls2", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.02F))
		.texOffs(12, 15).mirror().addBox(2.0F, -8.1F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(12, 15).addBox(-3.0F, -8.1F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 5.0F, -0.7F));

		PartDefinition cube_r6 = controls2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 46).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.5F, -7.1F, -2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r7 = controls2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 31).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -4.3F, -0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition tap2 = controls2.addOrReplaceChild("tap2", CubeListBuilder.create().texOffs(53, 24).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-1.4F, 0.0F, -1.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-4.4F, 1.0F, -1.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(53, 24).addBox(-3.5F, 1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -5.3F, -0.5F));

		PartDefinition topofbell = controls2.addOrReplaceChild("topofbell", CubeListBuilder.create().texOffs(51, 34).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.5F, -0.5F, -1.1F));

		PartDefinition pannel3 = pannels.addOrReplaceChild("pannel3", CubeListBuilder.create().texOffs(44, 12).addBox(-5.0F, -21.998F, -7.6602F, 10.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-3, 56).addBox(-5.0F, -22.001F, -10.6602F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-10.0F, -15.1F, -19.0526F, 20.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -1.0472F, 3.1416F));

		PartDefinition cube_r8 = pannel3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(29, 0).addBox(-11.0F, -6.0F, 5.6F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.5708F, 0.0F, 0.0F));

		PartDefinition slope3 = pannel3.addOrReplaceChild("slope3", CubeListBuilder.create().texOffs(0, 66).addBox(-11.0F, -6.0F, -0.2F, 22.0F, 14.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(-11.0F, -4.1F, -0.8F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(66, 12).addBox(-11.0F, -4.1F, -0.9F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.2654F, 0.0F, 0.0F));

		PartDefinition controls3 = slope3.addOrReplaceChild("controls3", CubeListBuilder.create().texOffs(12, 21).addBox(-2.0F, 1.4F, -1.8F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 19).addBox(-1.0F, -4.0F, -1.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = controls3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 32).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0524F));

		PartDefinition switches2 = controls3.addOrReplaceChild("switches2", CubeListBuilder.create().texOffs(22, 21).addBox(-4.0F, -0.5F, 0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 3.9F, -1.3F, 0.0F, 0.0F, 0.5236F));

		PartDefinition switch4 = switches2.addOrReplaceChild("switch4", CubeListBuilder.create().texOffs(47, 26).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 4.5F, 0.5F));

		PartDefinition switch5 = switches2.addOrReplaceChild("switch5", CubeListBuilder.create().texOffs(47, 26).mirror().addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.0F, 2.5F, 0.5F));

		PartDefinition switch6 = switches2.addOrReplaceChild("switch6", CubeListBuilder.create().texOffs(47, 26).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.5F, 0.5F));

		PartDefinition pannel4 = pannels.addOrReplaceChild("pannel4", CubeListBuilder.create().texOffs(44, 12).addBox(-5.0F, -22.0F, -7.6602F, 10.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-3, 56).addBox(-5.0F, -22.002F, -10.6602F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-10.0F, -15.1F, -19.0526F, 20.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r10 = pannel4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 0).addBox(-11.0F, -6.0F, 5.6F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.5708F, 0.0F, 0.0F));

		PartDefinition slope4 = pannel4.addOrReplaceChild("slope4", CubeListBuilder.create().texOffs(0, 66).addBox(-11.0F, -6.0F, -0.2F, 22.0F, 14.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(-11.0F, -4.1F, -0.8F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.2654F, 0.0F, 0.0F));

		PartDefinition controls4 = slope4.addOrReplaceChild("controls4", CubeListBuilder.create().texOffs(12, 15).mirror().addBox(1.5F, -3.1F, -3.7F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 25).addBox(-2.0F, -0.1F, -1.7F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 27).addBox(-0.5F, 2.9F, -2.2F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 15).addBox(-3.5F, -3.1F, -3.7F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = controls4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(44, 46).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.7F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r12 = controls4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 31).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.7F, -1.2F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r13 = controls4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(51, 31).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 3.9F, -1.2F, 0.0F, 0.0F, 0.7854F));

		PartDefinition tap3 = controls4.addOrReplaceChild("tap3", CubeListBuilder.create().texOffs(54, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-1.4F, -0.5F, -0.8F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 3.9F, -3.2F));

		PartDefinition pannel5 = pannels.addOrReplaceChild("pannel5", CubeListBuilder.create().texOffs(44, 12).addBox(-5.0F, -21.998F, -7.6602F, 10.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-3, 56).addBox(-5.0F, -22.001F, -10.6602F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-10.0F, -15.1F, -19.0526F, 20.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 1.0472F, 3.1416F));

		PartDefinition cube_r14 = pannel5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(29, 0).addBox(-11.0F, -6.0F, 5.6F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.5708F, 0.0F, 0.0F));

		PartDefinition slope5 = pannel5.addOrReplaceChild("slope5", CubeListBuilder.create().texOffs(0, 66).addBox(-11.0F, -6.0F, -0.2F, 22.0F, 14.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(-11.0F, -4.1F, -0.8F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.2654F, 0.0F, 0.0F));

		PartDefinition controls5 = slope5.addOrReplaceChild("controls5", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 15).addBox(-2.0F, 2.9F, -1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 15).mirror().addBox(1.0F, 2.9F, -1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 0).addBox(-0.5F, -0.1F, -1.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 29).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition switches4 = controls5.addOrReplaceChild("switches4", CubeListBuilder.create(), PartPose.offset(0.0F, 6.9F, 1.2F));

		PartDefinition switch11 = switches4.addOrReplaceChild("switch11", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -3.0F, -3.0F));

		PartDefinition switch10 = switches4.addOrReplaceChild("switch10", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -1.0F, -3.0F));

		PartDefinition switches5 = controls5.addOrReplaceChild("switches5", CubeListBuilder.create(), PartPose.offset(0.0F, 6.9F, 1.2F));

		PartDefinition switch12 = switches5.addOrReplaceChild("switch12", CubeListBuilder.create().texOffs(44, 48).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, -3.0F, -3.0F));

		PartDefinition switch13 = switches5.addOrReplaceChild("switch13", CubeListBuilder.create().texOffs(44, 48).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, -1.0F, -3.0F));

		PartDefinition switches3 = controls5.addOrReplaceChild("switches3", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 4.0F, -0.1F, 0.0F, 0.0F, -0.5236F));

		PartDefinition switch7 = switches3.addOrReplaceChild("switch7", CubeListBuilder.create().texOffs(47, 26).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 2.0F, -0.5F));

		PartDefinition switch8 = switches3.addOrReplaceChild("switch8", CubeListBuilder.create().texOffs(47, 26).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 0.0F, -0.5F));

		PartDefinition switch9 = switches3.addOrReplaceChild("switch9", CubeListBuilder.create().texOffs(47, 26).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -2.0F, -0.5F));

		PartDefinition pannel6 = pannels.addOrReplaceChild("pannel6", CubeListBuilder.create().texOffs(44, 12).addBox(-5.0F, -22.0F, -7.6602F, 10.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-3, 56).addBox(-5.0F, -22.002F, -10.6602F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-10.0F, -15.1F, -19.0526F, 20.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 61).addBox(5.0F, -15.1F, -23.0526F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 35).addBox(5.0F, -18.1F, -23.0526F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r15 = pannel6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(29, 0).addBox(-11.0F, -6.0F, 5.6F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.5708F, 0.0F, 0.0F));

		PartDefinition slope6 = pannel6.addOrReplaceChild("slope6", CubeListBuilder.create().texOffs(0, 66).addBox(-11.0F, -6.0F, -0.2F, 22.0F, 14.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(-11.0F, -4.1F, -0.8F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(73, 0).addBox(-11.0F, -4.1F, -0.9F, 22.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.9042F, -11.3303F, -1.2654F, 0.0F, 0.0F));

		PartDefinition controls6 = slope6.addOrReplaceChild("controls6", CubeListBuilder.create().texOffs(12, 15).mirror().addBox(1.5F, -3.1F, -3.7F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(12, 15).addBox(-3.5F, -3.1F, -3.7F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r16 = controls6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(44, 46).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.7F, -0.7854F, 0.0F, 0.0F));

		PartDefinition taps = controls6.addOrReplaceChild("taps", CubeListBuilder.create(), PartPose.offset(3.0F, -2.6F, -0.7F));

		PartDefinition taps2 = taps.addOrReplaceChild("taps2", CubeListBuilder.create().texOffs(53, 24).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-0.6F, -0.5F, -1.3F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 7.0F, -0.5F));

		PartDefinition taps3 = taps.addOrReplaceChild("taps3", CubeListBuilder.create().texOffs(53, 24).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(20, 15).addBox(-0.5F, -0.6F, -1.3F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 4.0F, -0.5F));

		PartDefinition taps4 = taps.addOrReplaceChild("taps4", CubeListBuilder.create().texOffs(53, 24).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-1.4F, -0.5F, -1.3F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, 4.0F, -0.5F));

		PartDefinition dividers = console.addOrReplaceChild("dividers", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, 0.0F));

		PartDefinition cube_r17 = dividers.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 55).addBox(-1.0F, -10.7123F, -4.1654F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.745F, 0.866F, -1.8762F, 0.5236F, -3.1416F));

		PartDefinition cube_r18 = dividers.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(54, 54).addBox(-1.0F, -1.0F, -12.4691F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -7.9936F, 0.0F, -3.1416F, 0.5236F, -3.1416F));

		PartDefinition cube_r19 = dividers.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, -4.3262F, 7.0526F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(44, 54).addBox(-1.0F, -11.3251F, 7.0526F, 2.0F, 21.0F, 3.0F, new CubeDeformation(0.002F))
		.texOffs(44, 35).addBox(-1.0F, -4.3262F, -22.0526F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3262F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r20 = dividers.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(29, 12).addBox(-1.0F, 6.4233F, 3.39F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.3016F, 0.0F, 0.0F, 1.5708F, -1.2654F));

		PartDefinition cube_r21 = dividers.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 55).addBox(-1.0F, 9.843F, -7.4559F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3262F, 0.0F, 0.0F, 1.5708F, -1.2654F));

		PartDefinition cube_r22 = dividers.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 55).addBox(-1.0F, -14.6945F, -7.1389F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3262F, 0.0F, 0.0F, 1.5708F, 1.2654F));

		PartDefinition cube_r23 = dividers.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(54, 54).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(9.9691F, -7.9936F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r24 = dividers.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 55).addBox(-1.0F, -14.6945F, -7.1389F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3262F, 0.0F, 0.0F, -1.5708F, -1.2654F));

		PartDefinition cube_r25 = dividers.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(54, 54).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-9.9691F, -7.9936F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r26 = dividers.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(44, 54).addBox(-1.0F, -10.5F, -1.5F, 2.0F, 21.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-8.5526F, 1.501F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r27 = dividers.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 55).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.261F, 12.6459F, 0.0F, 0.0F, -1.5708F, 1.2654F));

		PartDefinition cube_r28 = dividers.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(29, 12).addBox(-1.0F, 6.4233F, -5.39F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.3016F, 0.0F, 0.0F, 1.5708F, 1.2654F));

		PartDefinition cube_r29 = dividers.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 54).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.9845F, -7.9936F, 8.6335F, 3.1416F, -0.5236F, -3.1416F));

		PartDefinition cube_r30 = dividers.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(28, 55).addBox(-1.0F, 1.5F, 0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.574F, -9.829F, 11.3864F, -1.2654F, 0.5236F, 0.0F));

		PartDefinition cube_r31 = dividers.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(44, 54).addBox(-1.0F, -10.499F, -1.5F, 2.0F, 21.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-4.2763F, 1.5F, 7.4067F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r32 = dividers.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(44, 54).addBox(-1.0F, -10.5F, 7.0526F, 2.0F, 21.0F, 3.0F, new CubeDeformation(0.002F))
		.texOffs(66, 61).addBox(-1.0F, 0.499F, 18.0526F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(44, 35).addBox(-1.0F, -3.501F, 7.0526F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(44, 35).addBox(-1.0F, -3.501F, -22.0526F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.501F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r33 = dividers.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(20, 55).addBox(-1.0F, -7.5F, 0.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.074F, 15.129F, 12.2525F, 1.2654F, -0.5236F, 0.0F));

		PartDefinition cube_r34 = dividers.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(20, 55).addBox(-1.0F, -7.5F, 0.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.074F, 15.129F, 12.2525F, 1.2654F, 0.5236F, 0.0F));

		PartDefinition cube_r35 = dividers.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(29, 12).addBox(-1.0F, 6.4233F, 3.39F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.3016F, 0.0F, 1.2654F, 0.5236F, 0.0F));

		PartDefinition cube_r36 = dividers.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(29, 12).addBox(-1.0F, 6.4233F, 3.39F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.3016F, 0.0F, 1.2654F, -0.5236F, 0.0F));

		PartDefinition cube_r37 = dividers.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, -2.0F, 7.0526F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(44, 35).addBox(-1.0F, -2.0F, -22.0526F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(54, 54).addBox(-1.0F, -8.9936F, -12.4691F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r38 = dividers.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(44, 54).addBox(-1.0F, -10.5F, -1.5F, 2.0F, 21.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(4.2763F, 1.501F, -7.4067F, -3.1416F, 0.5236F, 3.1416F));

		PartDefinition cube_r39 = dividers.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(66, 61).addBox(-1.0F, -5.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.2763F, 7.5F, -16.067F, 0.0F, 2.618F, 0.0F));

		PartDefinition cube_r40 = dividers.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(20, 55).addBox(3.0408F, -2.7621F, -9.4769F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(9.8141F, 4.1891F, -8.917F, -1.8762F, 0.5236F, -3.1416F));

		PartDefinition cube_r41 = dividers.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(20, 55).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6305F, 12.6459F, -9.7523F, -1.8762F, -0.5236F, 3.1416F));

		PartDefinition cube_r42 = dividers.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(54, 54).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-4.9845F, -7.9936F, -8.6335F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r43 = dividers.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(28, 55).addBox(-1.0F, -10.7123F, 2.1654F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.745F, -0.866F, 1.8762F, -0.5236F, -3.1416F));

		PartDefinition cube_r44 = dividers.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(28, 55).addBox(-1.0F, 1.5F, -2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.574F, -9.829F, -11.3864F, 1.2654F, -0.5236F, 0.0F));

		PartDefinition cube_r45 = dividers.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(29, 12).addBox(-1.0F, 6.4233F, -5.39F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.3016F, 0.0F, -1.2654F, -0.5236F, 0.0F));

		PartDefinition cube_r46 = dividers.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 9.677F, -4.7853F, 1.0F, 11.0F, 0.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -4.1453F, 0.0F, 0.0F, -1.5708F, -1.2654F));

		PartDefinition cube_r47 = dividers.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 9.677F, -4.7853F, 1.0F, 11.0F, 0.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.1453F, 0.0F, 0.0F, 1.5708F, 1.2654F));

		PartDefinition cube_r48 = dividers.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 9.677F, -4.7853F, 1.0F, 11.0F, 0.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -4.1453F, 0.0F, -1.2654F, -0.5236F, 0.0F));

		PartDefinition cube_r49 = dividers.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 9.677F, -4.7853F, 1.0F, 11.0F, 0.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.1453F, 0.0F, 1.8762F, 0.5236F, -3.1416F));

		PartDefinition cube_r50 = dividers.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -5.5F, 0.0F, 1.0F, 11.0F, 0.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(7.9568F, -4.1453F, 13.7815F, 1.8762F, -0.5236F, -3.1416F));

		PartDefinition cube_r51 = dividers.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 9.4233F, -5.59F, 1.0F, 11.0F, 0.0F, new CubeDeformation(-0.001F))
		.texOffs(29, 12).addBox(-1.0F, 6.4233F, -5.39F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.3016F, 0.0F, -1.2654F, 0.5236F, 0.0F));

		PartDefinition cube_r52 = dividers.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(44, 54).addBox(-1.0F, -10.5F, -1.5F, 2.0F, 21.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-4.2763F, 1.501F, -7.4067F, -3.1416F, -0.5236F, 3.1416F));

		PartDefinition dividercontrols5 = dividers.addOrReplaceChild("dividercontrols5", CubeListBuilder.create().texOffs(44, 41).addBox(-1.0113F, -25.9936F, -10.4465F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r53 = dividercontrols5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0113F, -23.8937F, -8.9465F, 0.2182F, 0.0F, 0.0F));

		PartDefinition dividercontrols4 = dividers.addOrReplaceChild("dividercontrols4", CubeListBuilder.create().texOffs(37, 24).addBox(-2.5113F, -26.9936F, -8.9465F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

		PartDefinition hourglass2 = dividercontrols4.addOrReplaceChild("hourglass2", CubeListBuilder.create().texOffs(46, 37).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 10).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(46, 37).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0113F, -25.4936F, -9.0F));

		PartDefinition dividercontrols = dividers.addOrReplaceChild("dividercontrols", CubeListBuilder.create().texOffs(0, 29).addBox(-2.0F, -3.5F, -9.4732F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 29).addBox(-2.0F, -3.5F, 8.4733F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0113F, -9.4936F, 0.0267F, 0.0F, 1.5708F, 0.0F));

		PartDefinition lever = dividercontrols.addOrReplaceChild("lever", CubeListBuilder.create().texOffs(2, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.5F, -8.4732F, 0.0F, 3.1416F, 0.0F));

		PartDefinition lever2 = dividercontrols.addOrReplaceChild("lever2", CubeListBuilder.create().texOffs(2, 0).addBox(-2.0F, -5.0F, -1.5F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offset(0.0F, 1.5F, 9.9733F));

		PartDefinition dividercontrols2 = dividers.addOrReplaceChild("dividercontrols2", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -1.5F, 7.3733F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0113F, -9.4936F, 0.0267F, 0.0F, -2.618F, 0.0F));

		PartDefinition cube_r54 = dividercontrols2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(2, 8).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.9493F, 10.0089F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dividercontrols3 = dividers.addOrReplaceChild("dividercontrols3", CubeListBuilder.create().texOffs(37, 24).addBox(-2.5F, -4.5F, 9.9733F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0113F, -9.4936F, 0.0267F, 0.0F, 2.618F, 0.0F));

		PartDefinition hourglass = dividercontrols3.addOrReplaceChild("hourglass", CubeListBuilder.create().texOffs(46, 37).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 10).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -3.0F, 9.9733F));

		PartDefinition cube_r55 = hourglass.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(46, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition scanners = dividers.addOrReplaceChild("scanners", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.2436F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r56 = scanners.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(57, 28).addBox(-0.5F, -3.0F, -20.9691F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(0.0F, -3.0F, -16.4691F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.25F, 0.0F, -3.1416F, 0.5236F, -3.1416F));

		PartDefinition cube_r57 = scanners.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(57, 28).addBox(-0.5F, -1.0F, -11.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(0.0F, -1.0F, -6.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9845F, 0.25F, -8.6335F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r58 = scanners.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(57, 28).addBox(-0.5F, -0.75F, -4.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
		.texOffs(0, 59).addBox(0.0F, -0.75F, -0.25F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.2191F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}