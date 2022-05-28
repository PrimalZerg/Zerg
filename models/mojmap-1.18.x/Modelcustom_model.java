// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart leftupperarm;
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart rightleg;
	private final ModelPart rightupperarm;
	private final ModelPart leftleg;
	private final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.leftupperarm = root.getChild("leftupperarm");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.rightleg = root.getChild("rightleg");
		this.rightupperarm = root.getChild("rightupperarm");
		this.leftleg = root.getChild("leftleg");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftupperarm = partdefinition.addOrReplaceChild("leftupperarm",
				CubeListBuilder.create().texOffs(38, 48)
						.addBox(0.0F, -11.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 19)
						.addBox(-0.5F, -12.0F, -10.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 13.0F, -5.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r1 = leftupperarm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(53, 4).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -9.5753F, -4.2153F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftupperarm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 49).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -9.5105F, -7.4162F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftupperarm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(49, 26).addBox(-1.0F, -0.25F, -3.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -11.0F, -11.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(39, 37)
						.addBox(-2.0F, -2.0F, -9.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(13, 32)
						.addBox(-2.0F, 0.0F, -9.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 52)
						.addBox(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 0)
						.addBox(-4.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, -8.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(16, 42).addBox(-0.7F, -1.0F, -4.8F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, -2.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(43, 6).addBox(-1.3F, -1.0F, -4.8F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, -2.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(43, 14)
						.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 42)
						.addBox(-2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(22, 32).addBox(-2.0F, -2.3912F, -0.7934F, 4.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 4.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(16, 51).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.8995F, 15.0987F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(37, 26).addBox(-1.5F, -1.0F, 0.25F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.2444F, 9.9984F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.8912F, 5.7066F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(16, 57)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 44)
						.addBox(1.0F, -5.0F, -1.0F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 48)
						.addBox(-1.0F, 8.0F, -4.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 15.0F, -5.0F));

		PartDefinition cube_r9 = leftarm
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -3.0F, -0.25F, 2.0F, 9.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 3.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(25, 56)
						.addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -5.0F, -1.0F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 44)
						.addBox(-3.0F, 8.0F, -4.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 15.0F, -5.0F));

		PartDefinition cube_r10 = rightarm.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(30, 48).addBox(0.0F, -3.0F, -0.25F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(56, 11)
						.addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 17)
						.addBox(-2.0F, -5.0F, -1.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 36)
						.addBox(-3.0F, 8.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 15.0F, 3.0F));

		PartDefinition cube_r11 = rightleg.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(42, 56).addBox(0.0F, 0.0F, 3.75F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r12 = rightleg.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(30, 12).addBox(-1.0F, -2.0F, -4.5F, 2.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.0F, 3.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightupperarm = partdefinition.addOrReplaceChild("rightupperarm",
				CubeListBuilder.create().texOffs(8, 0)
						.addBox(-1.0F, -11.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.5F, -12.0F, -10.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 13.0F, -5.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r13 = rightupperarm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(11, 41).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -9.5753F, -4.2153F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r14 = rightupperarm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(30, 23).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -9.5105F, -7.4162F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r15 = rightupperarm.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(48, 20).addBox(-1.0F, -0.25F, -3.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -11.0F, -11.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(8, 55)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(1.0F, -5.0F, -1.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 32)
						.addBox(-1.0F, 8.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 15.0F, 3.0F));

		PartDefinition cube_r16 = leftleg
				.addOrReplaceChild("cube_r16",
						CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, 0.0F, 3.75F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 3.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftleg
				.addOrReplaceChild("cube_r17",
						CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -2.0F, -4.5F, 2.0F, 2.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 5.0F, 3.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.5F, -12.5F, -8.0F, 5.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(-3.0F, -13.0F, -7.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftupperarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightupperarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.tail.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftupperarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightupperarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}