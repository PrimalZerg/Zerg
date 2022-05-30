package net.primal.zerg.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelroach<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("zerg", "modelroach"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart leftleg2;
	public final ModelPart leftleg3;
	public final ModelPart leftleg1;
	public final ModelPart rightleg3;
	public final ModelPart rightleg2;
	public final ModelPart rightleg1;
	public final ModelPart leftarm;
	public final ModelPart rightarm;

	public Modelroach(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leftleg2 = root.getChild("leftleg2");
		this.leftleg3 = root.getChild("leftleg3");
		this.leftleg1 = root.getChild("leftleg1");
		this.rightleg3 = root.getChild("rightleg3");
		this.rightleg2 = root.getChild("rightleg2");
		this.rightleg1 = root.getChild("rightleg1");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild(
				"head", CubeListBuilder.create().texOffs(64, 25).addBox(-2.0F, -2.5F, -5.375F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
						.texOffs(55, 72).addBox(-2.0F, 0.5F, -5.125F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.25F, -6.625F));
		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(56, 13).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(10, 1)
						.addBox(-2.75F, -0.5F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0).addBox(1.75F, -0.5F, -4.25F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.75F, -1.375F, 0.3054F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 23).addBox(-4.0F, -5.0F, -5.0F, 8.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(50, 48).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -9.91F, 4.4944F, -0.2578F, -0.0262F, -0.3043F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(31, 29).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6105F, -6.1219F, -2.7708F, -0.2496F, -0.0701F, -0.4735F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6105F, -6.1219F, -2.7708F, -0.2496F, 0.0701F, 0.4735F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(34, 55).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -9.91F, 4.4944F, -0.2578F, 0.0262F, 0.3043F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(56, 4).addBox(-0.75F, -2.5F, -1.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -9.3901F, 4.6998F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(56, 13).addBox(-0.75F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -7.0F, -3.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(23, 48).addBox(-3.0F, -0.75F, -2.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(55, 61).addBox(-1.5F, -1.5F, -3.25F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.8576F, -8.7749F, -0.1571F, 0.0F, 0.0F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 63).addBox(-1.0F, -0.5F, -4.25F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, -3.8938F, -8.401F, -0.3753F, -0.3678F, 0.1407F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(13, 64).addBox(-1.0F, -0.5F, -4.25F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, -3.8938F, -8.401F, -0.3753F, 0.3678F, -0.1407F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(50, 48).addBox(-1.75F, -2.75F, -5.5F, 3.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -6.0251F, 6.3205F, 0.3956F, -0.1811F, -0.2573F));
		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.25F, -2.75F, -5.5F, 3.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -6.0251F, 6.3205F, 0.3956F, 0.1811F, 0.2573F));
		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.5F, -3.5F, 12.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 46).addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 10.5F, 0.6545F, 0.0F, 0.0F));
		PartDefinition leftleg2 = partdefinition.addOrReplaceChild("leftleg2",
				CubeListBuilder.create().texOffs(70, 65).addBox(0.0F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 16.0F, 3.0F));
		PartDefinition cube_r15 = leftleg2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0115F, 6.3116F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r16 = leftleg2.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(67, 41).addBox(0.0F, -5.5F, -1.5F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition leftleg3 = partdefinition.addOrReplaceChild("leftleg3",
				CubeListBuilder.create().texOffs(70, 61).addBox(0.0F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 16.0F, 9.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition cube_r17 = leftleg3.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(71, 72).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0115F, 6.3116F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r18 = leftleg3.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(45, 64).addBox(0.0F, -5.5F, -1.5F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition leftleg1 = partdefinition.addOrReplaceChild("leftleg1",
				CubeListBuilder.create().texOffs(64, 35).addBox(0.0F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 16.0F, -3.25F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r19 = leftleg1.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(55, 64).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0115F, 6.3116F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r20 = leftleg1.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(35, 64).addBox(0.0F, -5.5F, -1.5F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition rightleg3 = partdefinition.addOrReplaceChild("rightleg3",
				CubeListBuilder.create().texOffs(49, 0).addBox(-7.0F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 16.0F, 9.0F, 0.0F, 0.6545F, 0.0F));
		PartDefinition cube_r21 = rightleg3.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(26, 63).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0115F, 6.3116F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r22 = rightleg3.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(39, 0).addBox(-2.0F, -5.5F, -1.5F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition rightleg2 = partdefinition.addOrReplaceChild("rightleg2",
				CubeListBuilder.create().texOffs(48, 41).addBox(-7.0F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 16.0F, 3.0F));
		PartDefinition cube_r23 = rightleg2.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(13, 63).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0115F, 6.3116F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r24 = rightleg2.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -5.5F, -1.5F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition rightleg1 = partdefinition.addOrReplaceChild("rightleg1",
				CubeListBuilder.create().texOffs(31, 25).addBox(-7.0F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 16.0F, -3.25F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r25 = rightleg1.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 63).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0115F, 6.3116F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r26 = rightleg1.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -5.5F, -1.5F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(55, 25).addBox(-1.0F, -11.0F, -1.0F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 48)
						.addBox(-1.0F, -13.0F, -8.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 11.0F, -1.25F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r27 = leftarm.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(37, 6).addBox(-0.5F, 0.0F, -10.5F, 1.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -14.0F, -2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(49, 25).addBox(0.0F, -11.0F, -1.0F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(0.0F, -13.0F, -8.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 11.0F, -1.25F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r28 = rightarm.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(29, 29).addBox(-0.5F, 0.0F, -10.5F, 1.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -14.0F, -2.0F, 0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg3.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightleg2.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg3.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftleg2.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rightleg1.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg1.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
