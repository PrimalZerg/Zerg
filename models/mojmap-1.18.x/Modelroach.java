// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelroach<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "roach"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart leftforeleg;
	private final ModelPart rightforeleg;
	private final ModelPart rightmidleg;
	private final ModelPart leftmidleg;
	private final ModelPart righthindleg;
	private final ModelPart lefthindleg;
	private final ModelPart rightarm;
	private final ModelPart leftarm;

	public Modelroach(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leftforeleg = root.getChild("leftforeleg");
		this.rightforeleg = root.getChild("rightforeleg");
		this.rightmidleg = root.getChild("rightmidleg");
		this.leftmidleg = root.getChild("leftmidleg");
		this.righthindleg = root.getChild("righthindleg");
		this.lefthindleg = root.getChild("lefthindleg");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -4.0F, -4.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 11.0F, -7.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -1.0F, -7.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -2.0F, -8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -2.0F, -8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -10.0F, -5.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -11.0F, 5.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -8.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -8.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, -6.0F, 6.5F, -0.0873F, 0.0F, -0.2618F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(1.0F, -1.0F, -9.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, -6.0F, 6.5F, -0.0436F, 0.0F, -0.2618F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -1.0F, -9.5F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -6.0F, 6.5F, -0.0436F, 0.0F, 0.2618F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -6.0F, 6.5F, -0.0873F, 0.0F, 0.2618F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -0.25F, -3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -0.25F, -3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 3.0F, -9.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -0.25F, -3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 3.0F, -9.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-4.0F, -2.0F, -14.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2214F, -0.1704F, 0.0381F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -2.0F, -14.0F, 3.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2214F, 0.1704F, -0.0381F));

		PartDefinition cube_r9 = body
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.25F, -5.0F, 10.0F, 8.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-4.0F, -4.5F, -8.0F, 7.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.3574F, 0.0F, 2.4522F, 0.113F, 0.259F, 0.1908F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.5F, -2.0F, -3.75F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.4964F, -2.3105F, 12.6299F, 0.2154F, 1.0358F, 0.3479F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -2.0F, -3.75F, 6.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4964F, -2.3105F, 12.6299F, 0.2154F, -1.0358F, -0.3479F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, 1.5F, 2.0F, 5.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3574F, 0.0F, 2.4522F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.5F, -8.0F, 7.0F, 8.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3574F, 0.0F, 2.4522F, 0.113F, -0.259F, -0.1908F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 11.0F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.5F, -3.5F, -3.5F, 3.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, 1.5F, 1.5F, 0.2618F, 0.2618F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.5F, -3.5F, 3.0F, 5.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 1.5F, 1.5F, 0.2618F, -0.2618F, 0.0F));

		PartDefinition cube_r17 = tail.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(1.0F, -4.25F, -3.5F, 3.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, 1.5F, 1.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftforeleg = partdefinition.addOrReplaceChild("leftforeleg", CubeListBuilder.create(),
				PartPose.offset(4.0F, 12.0F, -2.75F));

		PartDefinition cube_r18 = leftforeleg.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(4.0626F, 3.9251F, -0.8275F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.1388F, 0.8108F, -0.5341F));

		PartDefinition cube_r19 = leftforeleg.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.1808F, -2.547F, -0.8275F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.6873F, 0.4891F, 0.7073F));

		PartDefinition leftlowerforearm = leftforeleg.addOrReplaceChild("leftlowerforearm", CubeListBuilder.create(),
				PartPose.offset(5.2457F, 2.0F, -5.7296F));

		PartDefinition cube_r20 = leftlowerforearm.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -7.0F, -1.5F, 2.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 4.0F, -1.0F, -0.4452F, 1.1821F, -0.476F));

		PartDefinition rightforeleg = partdefinition.addOrReplaceChild("rightforeleg", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 12.0F, -2.75F));

		PartDefinition cube_r21 = rightforeleg.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0626F, 3.9251F, -0.8275F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.1388F, -0.8108F, 0.5341F));

		PartDefinition cube_r22 = rightforeleg.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.8192F, -2.547F, -0.8275F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.6873F, -0.4891F, -0.7073F));

		PartDefinition rightlowerforearm = rightforeleg.addOrReplaceChild("rightlowerforearm", CubeListBuilder.create(),
				PartPose.offset(-5.2457F, 2.0F, -5.7296F));

		PartDefinition cube_r23 = rightlowerforearm.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.0F, -1.5F, 2.0F, 14.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 4.0F, -1.0F, -0.4452F, -1.1821F, 0.476F));

		PartDefinition rightmidleg = partdefinition.addOrReplaceChild("rightmidleg", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 11.0F, 1.0F));

		PartDefinition cube_r24 = rightmidleg.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.3651F, 3.3791F, -0.4134F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.2465F, -0.0525F, 0.3588F));

		PartDefinition cube_r25 = rightmidleg.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.4466F, -1.4087F, -0.4134F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.179F, 0.1782F, -0.6222F));

		PartDefinition rightlowermidleg = rightmidleg.addOrReplaceChild("rightlowermidleg", CubeListBuilder.create(),
				PartPose.offset(-6.25F, 2.0F, 0.25F));

		PartDefinition cube_r26 = rightlowermidleg.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.0F, -1.5F, 2.0F, 14.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8112F, 4.0F, -0.0972F, 0.0076F, 0.043F, 0.1747F));

		PartDefinition leftmidleg = partdefinition.addOrReplaceChild("leftmidleg", CubeListBuilder.create(),
				PartPose.offset(5.0F, 11.0F, 1.0F));

		PartDefinition cube_r27 = leftmidleg.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(2.3651F, 3.3791F, -0.4134F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.2465F, 0.0525F, -0.3588F));

		PartDefinition cube_r28 = leftmidleg.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.5534F, -1.4087F, -0.4134F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.179F, -0.1782F, 0.6222F));

		PartDefinition leftlowermidleg = leftmidleg.addOrReplaceChild("leftlowermidleg", CubeListBuilder.create(),
				PartPose.offset(6.5F, 2.0F, 0.25F));

		PartDefinition cube_r29 = leftlowermidleg.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -7.0F, -1.5F, 2.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5612F, 4.0F, -0.0972F, 0.0076F, -0.043F, -0.1747F));

		PartDefinition righthindleg = partdefinition.addOrReplaceChild("righthindleg", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 11.0F, 9.0F));

		PartDefinition cube_r30 = righthindleg.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.678F, 2.4859F, -1.3863F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9203F, 0.3264F, 0.1238F, 0.4414F, 0.4357F, 0.3972F));

		PartDefinition cube_r31 = righthindleg.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.3242F, -1.3092F, -1.3863F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9203F, 0.3264F, 0.1238F, -0.1785F, 0.5865F, -0.7596F));

		PartDefinition rightlowerhindleg = righthindleg.addOrReplaceChild("rightlowerhindleg", CubeListBuilder.create(),
				PartPose.offset(-5.6703F, 2.3264F, 2.8738F));

		PartDefinition cube_r32 = rightlowerhindleg.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0418F, -0.1735F, -1.7826F, 2.0F, 14.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.75F, -2.0F, -2.75F, 0.1102F, 0.5576F, 0.2061F));

		PartDefinition lefthindleg = partdefinition.addOrReplaceChild("lefthindleg", CubeListBuilder.create(),
				PartPose.offset(5.0F, 11.0F, 9.0F));

		PartDefinition cube_r33 = lefthindleg.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(1.678F, 2.4859F, -1.3863F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9203F, 0.3264F, 0.1238F, 0.4414F, -0.4357F, -0.3972F));

		PartDefinition cube_r34 = lefthindleg.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.6758F, -1.3092F, -1.3863F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.9203F, 0.3264F, 0.1238F, -0.1785F, -0.5865F, 0.7596F));

		PartDefinition leftlowerhindleg = lefthindleg.addOrReplaceChild("leftlowerhindleg", CubeListBuilder.create(),
				PartPose.offset(5.6703F, 2.3264F, 2.8738F));

		PartDefinition cube_r35 = leftlowerhindleg.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(5.0418F, -0.1735F, -1.7826F, 2.0F, 14.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-4.75F, -2.0F, -2.75F, 0.1102F, -0.5576F, -0.2061F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 6.0F, -4.0F));

		PartDefinition cube_r36 = rightarm.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5F, 0.75F, 2.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4279F, -8.6604F, -3.5F, -0.2182F, 0.0F, -0.6981F));

		PartDefinition cube_r37 = rightarm.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -8.5F, 2.0F, 4.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4279F, -8.6604F, -3.5F, 0.3927F, 0.0F, -0.6981F));

		PartDefinition cube_r38 = rightarm.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -11.0F, -6.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -10.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 6.0F, -4.0F));

		PartDefinition cube_r39 = leftarm.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -4.5F, 0.75F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.4279F, -8.6604F, -3.5F, -0.2182F, 0.0F, 0.6981F));

		PartDefinition cube_r40 = leftarm.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -3.0F, -8.5F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.4279F, -8.6604F, -3.5F, 0.3927F, 0.0F, 0.6981F));

		PartDefinition cube_r41 = leftarm.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-1.0F, -11.0F, -6.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(-1.0F, -10.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftforeleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightforeleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightmidleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftmidleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		righthindleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lefthindleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightforeleg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftmidleg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightmidleg.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.lefthindleg.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftforeleg.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.righthindleg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}