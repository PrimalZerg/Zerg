// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldehaka<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dehaka"), "main");
	private final ModelPart head;
	private final ModelPart rightupperarm;
	private final ModelPart leftupperarm;
	private final ModelPart tail;
	private final ModelPart rightlowerarm;
	private final ModelPart leftlowerarm;
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart bb_main;

	public Modeldehaka(ModelPart root) {
		this.head = root.getChild("head");
		this.rightupperarm = root.getChild("rightupperarm");
		this.leftupperarm = root.getChild("leftupperarm");
		this.tail = root.getChild("tail");
		this.rightlowerarm = root.getChild("rightlowerarm");
		this.leftlowerarm = root.getChild("leftlowerarm");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-3.2057F, -12.5602F, -18.1599F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-3.2057F, -10.5602F, -18.1599F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-5.0F, -11.0F, -13.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(0.5886F, -11.0F, -13.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.2057F, -4.4398F, -1.8401F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-0.5F, -5.5F, -5.75F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(-1.0F, -0.5F, -4.75F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5886F, -9.5F, -12.5F, 0.061F, -0.6082F, -0.1064F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5F, -5.5F, -5.75F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -0.5F, -4.75F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -9.5F, -12.5F, 0.061F, 0.6082F, 0.1064F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 7.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -10.75F, -5.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2057F, -13.0602F, -13.6599F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -0.5F, 6.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0813F, -12.7903F, -17.1264F, -0.2833F, 0.2383F, 0.6981F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -4.5F, 0.0F, 7.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9482F, -14.6048F, -12.1969F, -0.5645F, 0.4784F, 0.6981F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -0.5F, 6.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0681F, -14.2449F, -14.9691F, -0.4363F, 0.4363F, 0.6981F));

		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -6.2107F, -15.0899F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -5.2107F, -15.0899F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -6.2107F, -11.0899F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2057F, -7.0602F, -1.6599F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightupperarm = partdefinition.addOrReplaceChild("rightupperarm",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.366F, 0.1699F, -3.0F, 3.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7943F, -6.4398F, -3.8401F, 0.0F, 0.0F, 0.5236F));

		PartDefinition rightupperforearm = rightupperarm.addOrReplaceChild("rightupperforearm", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-5.366F, -2.6529F, -10.8483F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-6.366F, -3.6529F, -9.8483F, 1.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 11.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightupperforearm.addOrReplaceChild("righthand", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 2.0F, -11.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r8 = righthand.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.1384F, -4.8004F, 3.4192F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.1384F, -4.3004F, -7.5808F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, -5.0F, -0.0447F, 0.1298F, -0.0172F));

		PartDefinition cube_r9 = righthand.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(3.0475F, -1.9659F, 3.4942F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6894F, -2.4845F, -1.1166F, -0.5102F, 0.3518F, -1.054F));

		PartDefinition cube_r10 = righthand.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.3577F, -4.4001F, 2.9864F, 6.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6894F, -2.4845F, -1.1166F, -0.342F, 0.5164F, -0.6598F));

		PartDefinition cube_r11 = righthand.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.1384F, -0.2438F, 3.5731F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.1384F, 0.2562F, -7.4269F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, -5.0F, 0.3043F, 0.1298F, -0.0172F));

		PartDefinition leftupperarm = partdefinition.addOrReplaceChild("leftupperarm",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(2.634F, -0.8301F, -3.0F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.7943F, -6.4398F, -3.8401F, 0.0F, 0.0F, -0.5236F));

		PartDefinition leftupperforearm = leftupperarm.addOrReplaceChild("leftupperforearm",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.634F, -3.6066F, -10.5476F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror()
						.addBox(3.634F, -4.6066F, -9.5476F, 1.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 11.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftupperforearm.addOrReplaceChild("lefthand", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 2.0F, -11.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r12 = lefthand.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.4478F, -5.7018F, 2.8455F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror()
				.addBox(-0.5522F, -5.2018F, -8.1545F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.0F, -5.0F, -0.0447F, -0.1298F, 0.0172F));

		PartDefinition cube_r13 = lefthand.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-6.8215F, -1.0991F, 3.8134F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.6894F, -2.4845F, -1.1166F, -0.5102F, -0.3518F, 1.054F));

		PartDefinition cube_r14 = lefthand.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-5.6129F, -4.2782F, 3.3056F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.6894F, -2.4845F, -1.1166F, -0.342F, -0.5164F, 0.6598F));

		PartDefinition cube_r15 = lefthand.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.4478F, -1.2871F, 3.3423F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror()
				.addBox(-0.5522F, -0.7871F, -7.6577F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.0F, -5.0F, 0.3043F, -0.1298F, 0.0172F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.6985F, -3.7101F, 8.0F, 8.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2057F, 14.7414F, 8.0332F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.5F, -2.5F, 1.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9875F, -11.0325F, -3.5321F, 0.7821F, 0.0167F, -0.3924F));

		PartDefinition cube_r17 = tail.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9875F, -9.5325F, 4.9679F, -0.6981F, 0.0F, -0.2618F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.5F, -2.5F, 1.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0125F, -11.0325F, 0.4679F, 0.7854F, 0.0F, 0.2182F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -15.0098F, 0.996F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -5.0F, 25.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -12.0883F, 0.6548F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -5.0F, 25.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -7.3874F, 1.7475F, 3.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -5.0F, 25.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -9.7268F, 1.4077F, 4.0F, 6.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 16.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail
				.addOrReplaceChild("cube_r23",
						CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.9572F, -1.6526F, 6.0F, 7.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.0F, 0.0F, 8.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightlowerarm = partdefinition.addOrReplaceChild("rightlowerarm",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.26F, -8.5708F, 0.0F, 2.0F, 9.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7943F, -1.6898F, -7.8401F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r24 = rightlowerarm.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.6097F, -6.549F, -6.6816F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 6.0F, 1.0F, 0.958F, -0.0909F, 0.2575F));

		PartDefinition cube_r25 = rightlowerarm.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.4244F, -6.4127F, -5.2993F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 6.0F, 1.0F, 1.0976F, -0.4147F, -0.2808F));

		PartDefinition cube_r26 = rightlowerarm.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.183F, -5.2095F, -5.0218F, 2.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 6.0F, 1.0F, 0.48F, -0.2618F, 0.0F));

		PartDefinition leftlowerarm = partdefinition.addOrReplaceChild("leftlowerarm",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.3282F, -9.0884F, 0.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.7943F, -1.6898F, -7.8401F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r27 = leftlowerarm.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.1194F, -7.2488F, -5.9603F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 6.0F, 1.0F, 0.958F, 0.0909F, -0.2575F));

		PartDefinition cube_r28 = leftlowerarm.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.4058F, -7.1125F, -5.7003F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.0F, 6.0F, 1.0F, 1.0976F, 0.4147F, 0.2808F));

		PartDefinition cube_r29 = leftlowerarm.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.683F, -5.8996F, -5.2263F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.0F, 6.0F, 1.0F, 0.48F, 0.2618F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.0F, -2.0F, -5.0F, 5.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(0.25F, 10.5F, 2.0F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.7943F, 3.5602F, -0.8401F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftleg.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-3.979F, 0.0F, -6.1338F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 18.5F, 2.5F, 0.3257F, 0.6286F, 0.196F));

		PartDefinition cube_r31 = leftleg.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, 0.0F, -4.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 18.5F, 2.5F, 0.3257F, -0.6286F, -0.196F));

		PartDefinition cube_r32 = leftleg.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-3.0F, 0.0F, -5.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 18.5F, 2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftleg.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.5F, -2.75F, -6.75F, 5.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 11.0F, 1.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftleg.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -4.5F, -5.0F, 2.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 1.5F, -0.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -2.0F, -5.0F, 5.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.25F, 10.5F, 2.0F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7943F, 3.5602F, -0.8401F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightleg.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.979F, 0.0F, -6.1338F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 18.5F, 2.5F, 0.3257F, -0.6286F, -0.196F));

		PartDefinition cube_r36 = rightleg.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -4.5F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 18.5F, 2.5F, 0.3257F, 0.6286F, 0.196F));

		PartDefinition cube_r37 = rightleg.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, 0.0F, -5.5F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 18.5F, 2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightleg.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.75F, -6.75F, 5.0F, 4.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 11.0F, 1.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightleg.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5F, -5.0F, 2.0F, 9.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 1.5F, -0.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r40 = bb_main.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.5F, -2.5F, 1.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7818F, -29.2912F, 4.5011F, -0.7799F, -0.3169F, -0.3052F));

		PartDefinition cube_r41 = bb_main.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -3.5F, -1.5F, 1.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2182F, -31.2912F, 3.5011F, -0.5195F, -0.0467F, 0.2381F));

		PartDefinition cube_r42 = bb_main.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -4.0F, -4.5F, 1.0F, 7.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -34.7848F, 3.8529F, -0.3899F, -0.0433F, -0.1195F));

		PartDefinition cube_r43 = bb_main.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -4.0F, -6.5F, 1.0F, 8.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -40.0F, 4.3038F, 0.0044F, 0.1664F, 0.053F));

		PartDefinition cube_r44 = bb_main.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -4.5F, 1.0F, 8.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -42.0F, -0.6962F, 0.4674F, -0.3542F, -0.1733F));

		PartDefinition cube_r45 = bb_main.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, 1.5F, -3.0F, 5.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0904F, -42.8065F, -0.6829F, -0.3185F, -0.3035F, -0.7363F));

		PartDefinition cube_r46 = bb_main.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.5F, 1.5F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0904F, -42.8065F, -0.6829F, -0.3185F, 0.3035F, 0.7363F));

		PartDefinition cube_r47 = bb_main.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.5F, 0.0F, -0.5F, 5.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.5F, -39.5F, 0.5F, -1.1774F, 0.9128F, 0.3541F));

		PartDefinition cube_r48 = bb_main.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.25F, -0.5F, 5.0F, 1.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -39.5F, 0.5F, -1.1998F, -0.8731F, -0.3253F));

		PartDefinition cube_r49 = bb_main.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -2.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.7943F, -35.4398F, -3.8401F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r50 = bb_main.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -3.0F, 6.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7943F, -35.4398F, -3.8401F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r51 = bb_main.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -7.0F, 8.0F, 8.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2057F, -18.8733F, 5.211F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bb_main.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.5F, -6.0F, 8.0F, 21.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2057F, -28.2586F, -0.9668F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bb_main.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -5.0F, -5.5F, 10.0F, 10.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2057F, -33.6898F, -4.8401F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightupperarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftupperarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightlowerarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftlowerarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}