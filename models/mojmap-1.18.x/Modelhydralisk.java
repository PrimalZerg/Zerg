// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhydralisk<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hydralisk"), "main");
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart bb_main;

	public Modelhydralisk(ModelPart root) {
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(47, 0)
						.addBox(-5.0F, 5.0F, -10.75F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-5.0F, 6.0F, -5.0F, 5.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(62, 8)
						.addBox(-8.0F, 5.0F, -6.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-0.5F, 5.0F, -6.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -18.0F, -6.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(10, 55)
						.addBox(-1.25F, -5.0F, -2.25F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-1.75F, 0.0F, -1.25F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9595F, 7.0107F, -9.2671F, 0.4943F, -0.2316F, -0.1231F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(60, 33)
						.addBox(-1.0F, -6.25F, -3.5F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 96)
						.addBox(-1.5F, -1.25F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 7.5F, -7.5F, 0.4943F, 0.2316F, 0.1231F));

		PartDefinition cube_r3 = head
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -2.0F, -4.25F, 5.0F, 6.0F, 23.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(72, 98).addBox(-5.0F, -3.0F, -11.0F, 5.0F, 4.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(50, 33).addBox(-6.0F, -3.0F, -2.0F, 7.0F, 2.0F, 17.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(24, 35).addBox(4.0F, -1.0F, -4.0F, 3.0F, 4.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 3.0F, 0.0F, 0.3193F, 0.2909F, 0.0945F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(36, 9).addBox(-7.0F, -1.0F, -4.0F, 3.0F, 4.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.3193F, -0.2909F, -0.0945F));

		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(62, 19)
						.addBox(-2.0F, 5.5778F, -8.3941F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(93, 0)
						.addBox(-2.0F, 4.5778F, -8.3941F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, -4.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(101, 69)
						.addBox(-9.0F, 1.0F, -2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(94, 100)
						.addBox(5.0F, 1.0F, -2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 73)
						.addBox(-4.0F, 0.0F, -5.0F, 9.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(25, 92)
						.addBox(-2.0F, -3.0F, -5.0F, 5.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, -2.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 96)
						.addBox(-2.5F, -5.0F, -0.75F, 5.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
						.addBox(-4.5F, -3.0F, -0.75F, 9.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.0F, 7.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(78, 19)
						.addBox(7.5F, -1.5F, 8.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 69)
						.addBox(-0.5F, -1.5F, -3.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 4.5F, 10.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(24, 80)
						.addBox(-5.5F, -1.5F, 10.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(93, 7)
						.addBox(-3.5F, -1.5F, -1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 4.5F, 10.5F, 0.0F, 0.4363F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(81, 20)
						.addBox(-4.0F, -1.0F, 0.0F, 9.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(48, 95)
						.addBox(-2.0F, -3.0F, 0.0F, 5.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 2.0F, 18.0F));

		PartDefinition cube_r11 = tail2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -9.0F, 11.0F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3065F, -0.0832F, 0.0263F));

		PartDefinition cube_r12 = tail2
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(31, 33).addBox(-1.0F, -7.0F, 1.0F, 3.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(25, 59).addBox(-2.0F, -2.5F, 1.75F, 4.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0398F, 2.0F, 21.0459F, 0.3491F, -0.3927F, 0.0F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(98, 85)
						.addBox(-2.0F, -3.0F, -1.25F, 4.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(78, 52)
						.addBox(-3.75F, -1.0F, -1.25F, 7.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 1.0F, 12.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(33, 0)
						.addBox(-1.0F, -2.0F, -1.0F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 12)
						.addBox(2.0F, -3.0F, -2.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-0.25F, 10.0F, -16.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(78, 52)
						.addBox(0.5F, 14.0F, -11.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 59)
						.addBox(0.5F, 14.0F, -7.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -5.723F, -1.4406F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r15 = leftarm.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 55).addBox(-2.5F, 1.0F, -3.0F, 2.0F, 11.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 13.0F, -12.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -2.0F, -1.0F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 12)
						.addBox(-4.0F, -3.0F, -2.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 52)
						.addBox(-3.75F, 10.0F, -16.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-2.5F, 14.0F, -11.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 59)
						.addBox(-2.5F, 14.0F, -7.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -5.723F, -1.4406F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r16 = rightarm.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(50, 33).addBox(0.5F, 1.0F, -3.0F, 2.0F, 11.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 13.0F, -12.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(-4.0F, -34.0F, -7.0F, 9.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(73, 73)
						.addBox(-4.0F, -21.0F, -8.0F, 9.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.0F, -31.0F, 6.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(95, 41)
						.addBox(-1.0F, -26.0F, 6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r17 = bb_main.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(60, 73).addBox(-2.0F, -0.5F, -3.5F, 3.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -33.723F, 5.5594F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bb_main.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(81, 38).addBox(-2.25F, -1.5F, -3.5F, 3.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -19.5F, 5.0F, -0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.tail.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}