// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "armor"), "main");
	private final ModelPart Body2;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Head;

	public Modelarmor(ModelPart root) {
		this.Body2 = root.getChild("Body2");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body2 = partdefinition.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(16, 16)
				.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.01F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(55, 2).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 4.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.25F, 5.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body2
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -0.75F, -3.5F, 2.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 6.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body2
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, 0.75F, -2.75F, 1.0F, 1.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(56, 26)
						.addBox(-4.0F, 10.0F, -3.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 26)
						.addBox(0.0F, 10.0F, -3.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(56, 26)
						.addBox(-2.0F, 10.0F, -3.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 26)
						.addBox(2.0F, 10.0F, -3.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(52, 14).addBox(-5.25F, -1.0F, -2.5F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8F, 12.0F, -2.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(52, 14).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 12.0F, -2.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(52, 14).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 12.0F, -2.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(52, 14).addBox(3.25F, -1.0F, -2.5F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8F, 12.0F, -2.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)).texOffs(32, 8)
						.addBox(-7.0F, -4.0F, -3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 8)
						.addBox(5.0F, -4.0F, -3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Head
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(24, 0).addBox(-1.75F, -3.75F, -5.75F, 8.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(24, 0).addBox(-6.0F, -3.75F, -5.75F, 8.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 0.0F, -0.9599F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}