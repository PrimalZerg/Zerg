
package net.primal.zerg.client.renderer;

import net.primal.zerg.entity.HostileZerglingEntity;
import net.primal.zerg.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class HostileZerglingRenderer extends MobRenderer<HostileZerglingEntity, Modelcustom_model<HostileZerglingEntity>> {
	public HostileZerglingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<HostileZerglingEntity, Modelcustom_model<HostileZerglingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("zerg:textures/zergling_eyes.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HostileZerglingEntity entity) {
		return new ResourceLocation("zerg:textures/feral_zergling.png");
	}
}
