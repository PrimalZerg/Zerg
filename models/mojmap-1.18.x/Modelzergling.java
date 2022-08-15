// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelzergling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "zergling"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart rightforeleg;
	private final ModelPart leftforeleg;
	private final ModelPart righthindleg;
	private final ModelPart lefthindleg;
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	private final ModelPart rightupperwing;
	private final ModelPart rightlowerwing;
	private final ModelPart leftupperwing;
	private final ModelPart leftlowerwing;

	public Modelzergling(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
		this.rightforeleg = root.getChild("rightforeleg");
		this.leftforeleg = root.getChild("leftforeleg");
		this.righthindleg = root.getChild("righthindleg");
		this.lefthindleg = root.getChild("lefthindleg");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.rightupperwing = root.getChild("rightupperwing");
		this.rightlowerwing = root.getChild("rightlowerwing");
		this.leftupperwing = root.getChild("leftupperwing");
		this.leftlowerwing = root.getChild("leftlowerwing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(40, 17).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.0F, -4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, 0.25F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(52, 38).addBox(9.0F, 0.25F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(55, 32).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, -4.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(57, 6).addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -4.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 11).addBox(-2.5F, -1.6F, 1.25F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(45, 45).addBox(-2.0F, -1.19F, -0.7706F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 44).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.25F, -5.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(17, 25).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -3.75F));

		PartDefinition cube_r7 = jaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(26, 26).addBox(-3.0F, -2.0F, -6.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 0).addBox(-2.5F, -2.8F, -3.0F, 5.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 36).addBox(-3.0F, 0.5F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -3.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 16.5F, 5.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 36).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 4.0F));

		PartDefinition cube_r11 = tail2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 50).addBox(-1.5F, -1.0F, -1.06F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 1.25F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0F, 3.0F));

		PartDefinition cube_r12 = tail3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 8).addBox(-0.5F, 0.0F, -1.31F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 1.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(47, 32).addBox(-0.5F, -0.5F, -0.06F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.75F, 3.5F));

		PartDefinition rightforeleg = partdefinition.addOrReplaceChild("rightforeleg", CubeListBuilder.create(), PartPose.offset(-3.0F, 16.0F, -3.0F));

		PartDefinition cube_r13 = rightforeleg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -0.5F, -1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.6627F, 1.1875F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r14 = rightforeleg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 50).addBox(-1.0F, -5.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition righthand = rightforeleg.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(0, 7).addBox(-0.75F, 0.5F, -4.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.25F, 2.0F));

		PartDefinition cube_r15 = righthand.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -1.5F, -2.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -2.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftforeleg = partdefinition.addOrReplaceChild("leftforeleg", CubeListBuilder.create(), PartPose.offset(3.0F, 16.0F, -3.0F));

		PartDefinition cube_r16 = leftforeleg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(29, 36).addBox(-0.5F, -0.5F, -1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6627F, 1.1875F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftforeleg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -5.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition lefthand = leftforeleg.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, 0.5F, -4.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.25F, 2.0F));

		PartDefinition cube_r18 = lefthand.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, -2.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -2.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition righthindleg = partdefinition.addOrReplaceChild("righthindleg", CubeListBuilder.create().texOffs(28, 42).addBox(-1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.25F, 16.0F, 2.0F));

		PartDefinition cube_r19 = righthindleg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -2.0F, -1.75F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0F, 0.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r20 = righthindleg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(38, 49).addBox(-0.5F, -4.0F, -1.5F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0F, 0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightfoot = righthindleg.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(46, 56).addBox(-1.25F, -2.75F, -0.25F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.75F, 4.0F));

		PartDefinition cube_r21 = rightfoot.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(10, 43).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.75F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition lefthindleg = partdefinition.addOrReplaceChild("lefthindleg", CubeListBuilder.create().texOffs(34, 22).addBox(0.0F, 3.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 16.0F, 2.0F));

		PartDefinition cube_r22 = lefthindleg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(55, 53).addBox(-0.5F, -2.0F, -1.75F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, 0.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r23 = lefthindleg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 49).addBox(-0.5F, -4.0F, -1.5F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition leftfoot = lefthindleg.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(21, 50).addBox(-0.75F, -2.75F, -0.25F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.75F, 4.0F));

		PartDefinition cube_r24 = leftfoot.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(12, 32).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.75F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 15.0F, -3.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r25 = rightarm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(20, 59).addBox(-0.5F, -7.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightupperarm = rightarm.addOrReplaceChild("rightupperarm", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 1.25F));

		PartDefinition cube_r26 = rightupperarm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(10, 16).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3788F, -2.7915F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightupperarm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(9, 7).addBox(-0.5F, -1.0F, -1.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -4.5F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightupperarm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(56, 22).addBox(-1.0F, -2.5F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightupperarm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(43, 0).addBox(-1.5F, -3.0F, -8.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightupperarm.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(44, 24).addBox(-1.0F, -1.75F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 15.0F, -3.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r31 = leftarm.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(8, 57).addBox(-0.5F, -7.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftupperarm = leftarm.addOrReplaceChild("leftupperarm", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 1.25F));

		PartDefinition cube_r32 = leftupperarm.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3788F, -2.7915F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftupperarm.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, -1.0F, -1.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.5F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftupperarm.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(53, 14).addBox(-1.0F, -2.5F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftupperarm.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(17, 42).addBox(-1.5F, -3.0F, -8.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftupperarm.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -1.75F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightupperwing = partdefinition.addOrReplaceChild("rightupperwing", CubeListBuilder.create(), PartPose.offset(-2.0F, 13.0F, 0.0F));

		PartDefinition cube_r37 = rightupperwing.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -2.0F, -1.75F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(17, 5).addBox(0.0F, -1.0F, -1.0F, 0.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightlowerwing = partdefinition.addOrReplaceChild("rightlowerwing", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 14.0F, 1.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r38 = rightlowerwing.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -1.25F, -1.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(17, 12).addBox(-0.25F, -1.25F, -1.0F, 0.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftupperwing = partdefinition.addOrReplaceChild("leftupperwing", CubeListBuilder.create(), PartPose.offset(2.0F, 13.0F, 0.0F));

		PartDefinition cube_r39 = leftupperwing.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.75F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(17, 2).addBox(0.0F, -1.0F, -1.0F, 0.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftlowerwing = partdefinition.addOrReplaceChild("leftlowerwing", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 14.0F, 1.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r40 = leftlowerwing.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, -1.25F, -1.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(17, 1).addBox(0.25F, -1.25F, -1.0F, 0.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightforeleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftforeleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		righthindleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lefthindleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightupperwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightlowerwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftupperwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftlowerwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.lefthindleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftlowerwing.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.tail.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.righthindleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightforeleg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftforeleg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rightupperwing.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightlowerwing.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftupperwing.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}