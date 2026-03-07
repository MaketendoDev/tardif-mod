package net.maketendo.tardifmod.client.models.entities;


import net.maketendo.tardifmod.client.renderers.entities.renderstates.TARDISEntityRenderState;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class PoliceBoxModel extends EntityModel<TARDISEntityRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("tardif_mod", "police_box"), "main");
	private final ModelPart TARDIF;
	private final ModelPart doors;
	private final ModelPart RightDoor;
	private final ModelPart window;
	private final ModelPart LeftDoor;
	private final ModelPart phone;
	private final ModelPart phone2;
	private final ModelPart button1;
	private final ModelPart button2;
	private final ModelPart window2;
	private final ModelPart lamplid;
	private final ModelPart window3;
	private final ModelPart window4;
	private final ModelPart window5;
	private final ModelPart window6;
	private final ModelPart window7;
	private final ModelPart window8;

	public PoliceBoxModel(ModelPart root) {
		super(root);
		this.TARDIF = root.getChild("TARDIF");
		this.doors = this.TARDIF.getChild("doors");
		this.RightDoor = this.doors.getChild("RightDoor");
		this.window = this.RightDoor.getChild("window");
		this.LeftDoor = this.doors.getChild("LeftDoor");
		this.phone = this.LeftDoor.getChild("phone");
		this.phone2 = this.phone.getChild("phone2");
		this.button1 = this.phone.getChild("button1");
		this.button2 = this.phone.getChild("button2");
		this.window2 = this.LeftDoor.getChild("window2");
		this.lamplid = this.TARDIF.getChild("lamplid");
		this.window3 = this.TARDIF.getChild("window3");
		this.window4 = this.TARDIF.getChild("window4");
		this.window5 = this.TARDIF.getChild("window5");
		this.window6 = this.TARDIF.getChild("window6");
		this.window7 = this.TARDIF.getChild("window7");
		this.window8 = this.TARDIF.getChild("window8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition TARDIF = partdefinition.addOrReplaceChild("TARDIF", CubeListBuilder.create().texOffs(0, 0).addBox(-11.5F, -1.0F, -11.5F, 23.0F, 1.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-9.5F, -41.0F, -9.5F, 19.0F, 8.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(52, 97).addBox(-9.5F, -43.0F, -9.5F, 19.0F, 2.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(84, 25).addBox(-2.5F, -45.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.001F))
		.texOffs(61, 24).addBox(-1.0F, -45.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.001F))
		.texOffs(0, 24).addBox(-9.5F, -37.0F, -11.5F, 19.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(67, 90).addBox(-9.5F, -38.0F, -11.5F, 19.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(67, 90).addBox(-9.5F, -38.0F, 9.5F, 19.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition snow_r1 = TARDIF.addOrReplaceChild("snow_r1", CubeListBuilder.create().texOffs(67, 90).mirror().addBox(-9.5F, 1.0F, -11.5F, 19.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -39.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition snow_r2 = TARDIF.addOrReplaceChild("snow_r2", CubeListBuilder.create().texOffs(67, 90).addBox(-9.5F, 1.0F, -11.5F, 19.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-9.5F, 2.0F, -11.5F, 19.0F, 4.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -39.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition snow_r3 = TARDIF.addOrReplaceChild("snow_r3", CubeListBuilder.create().texOffs(0, 123).addBox(8.0F, -22.0F, 8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -19.0F, -0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition snow_r4 = TARDIF.addOrReplaceChild("snow_r4", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(8.0F, -22.0F, -11.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(104, 0).mirror().addBox(8.0F, -20.0F, -11.0F, 3.0F, 38.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -19.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition snow_r5 = TARDIF.addOrReplaceChild("snow_r5", CubeListBuilder.create().texOffs(0, 123).addBox(-11.0F, -22.0F, 8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -19.0F, -0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition snow_r6 = TARDIF.addOrReplaceChild("snow_r6", CubeListBuilder.create().texOffs(0, 123).addBox(-11.0F, -23.0F, -11.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(104, 0).addBox(-11.0F, -21.0F, -11.0F, 3.0F, 38.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -18.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r1 = TARDIF.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(104, 0).addBox(-1.5F, -19.0F, -1.5F, 3.0F, 38.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -20.0F, 9.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r2 = TARDIF.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(104, 0).addBox(-1.5F, -19.0F, -1.5F, 3.0F, 38.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -20.0F, 9.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = TARDIF.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 52).addBox(-11.5F, -16.0F, -9.5F, 15.0F, 32.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -17.0F, 4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = TARDIF.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(77, 52).addBox(-7.5F, -16.0F, -5.5F, 15.0F, 32.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -17.0F, 4.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r5 = TARDIF.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(77, 52).addBox(-3.5F, -16.0F, -9.5F, 15.0F, 32.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -17.0F, 4.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition doors = TARDIF.addOrReplaceChild("doors", CubeListBuilder.create(), PartPose.offset(0.5F, -1.0F, -8.5F));

		PartDefinition RightDoor = doors.addOrReplaceChild("RightDoor", CubeListBuilder.create().texOffs(1, 79).addBox(-8.0F, -16.0F, -1.5F, 8.0F, 32.0F, 2.0F, new CubeDeformation(-0.001F))
		.texOffs(0, 0).addBox(-4.5F, -4.0F, -1.6F, 2.0F, 2.0F, 0.0F, new CubeDeformation(-0.001F))
		.texOffs(0, 64).addBox(-7.0F, -5.0F, -3.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -16.0F, 0.5F));

		PartDefinition cube_r6 = RightDoor.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -3.0F, 1.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition window = RightDoor.addOrReplaceChild("window", CubeListBuilder.create().texOffs(6, 15).addBox(-2.5F, -6.0F, 0.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offset(-3.5F, -7.0F, -1.5F));

		PartDefinition LeftDoor = doors.addOrReplaceChild("LeftDoor", CubeListBuilder.create().texOffs(23, 79).addBox(0.0F, -16.0F, -1.5F, 7.0F, 32.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offset(-8.0F, -16.0F, 0.5F));

		PartDefinition phone = LeftDoor.addOrReplaceChild("phone", CubeListBuilder.create().texOffs(0, 54).addBox(0.0F, -3.0F, -0.25F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 6).addBox(0.0F, 0.0F, 1.75F, 2.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(1, 65).addBox(4.5F, -2.0F, -1.25F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, -1.25F));

		PartDefinition phone2 = phone.addOrReplaceChild("phone2", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -2.5F, -1.0333F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F))
		.texOffs(8, 6).addBox(-1.0F, -2.5F, -0.5333F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-1.0F, 0.5F, -1.0333F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offset(1.0F, 0.0F, 2.5833F));

		PartDefinition button1 = phone.addOrReplaceChild("button1", CubeListBuilder.create(), PartPose.offset(3.5F, -1.5F, 3.25F));

		PartDefinition cube_r7 = button1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 12).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition button2 = phone.addOrReplaceChild("button2", CubeListBuilder.create(), PartPose.offset(3.5F, 1.5F, 3.25F));

		PartDefinition cube_r8 = button2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 12).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition window2 = LeftDoor.addOrReplaceChild("window2", CubeListBuilder.create().texOffs(6, 15).mirror().addBox(-2.5F, -6.0F, 0.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offset(3.5F, -7.0F, -1.5F));

		PartDefinition lamplid = TARDIF.addOrReplaceChild("lamplid", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -45.0F, 0.0F));

		PartDefinition window3 = TARDIF.addOrReplaceChild("window3", CubeListBuilder.create(), PartPose.offset(4.0F, -24.0F, 9.5F));

		PartDefinition cube_r9 = window3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(6, 15).addBox(-2.5F, -6.0F, -2.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition window4 = TARDIF.addOrReplaceChild("window4", CubeListBuilder.create(), PartPose.offset(-4.0F, -24.0F, 9.5F));

		PartDefinition cube_r10 = window4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(6, 15).mirror().addBox(-2.5F, -6.0F, -2.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition window5 = TARDIF.addOrReplaceChild("window5", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.5F, -24.0F, -4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r11 = window5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(6, 15).mirror().addBox(-2.5F, -3.0F, -1.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition window6 = TARDIF.addOrReplaceChild("window6", CubeListBuilder.create().texOffs(6, 15).mirror().addBox(-2.5F, -6.0F, 0.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-9.5F, -24.0F, 4.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition window7 = TARDIF.addOrReplaceChild("window7", CubeListBuilder.create().texOffs(6, 15).addBox(-2.5F, -6.0F, 0.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(9.5F, -24.0F, 4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition window8 = TARDIF.addOrReplaceChild("window8", CubeListBuilder.create(), PartPose.offsetAndRotation(9.5F, -24.0F, -4.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r12 = window8.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(6, 15).addBox(-2.5F, -3.0F, -1.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}


}