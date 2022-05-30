
package net.primal.zerg.client.renderer;

import net.primal.zerg.entity.FeralRoachEntity;
import net.primal.zerg.client.model.Modelroach;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class FeralRoachRenderer extends MobRenderer<FeralRoachEntity, Modelroach<FeralRoachEntity>> {
	public FeralRoachRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelroach(context.bakeLayer(Modelroach.LAYER_LOCATION)), 0.7f);
		this.addLayer(new EyesLayer<FeralRoachEntity, Modelroach<FeralRoachEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("zerg:textures/wild_roach_eyes.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FeralRoachEntity entity) {
		return new ResourceLocation("zerg:textures/feral_roach.png");
	}
}
