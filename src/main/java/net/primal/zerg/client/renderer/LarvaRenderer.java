
package net.primal.zerg.client.renderer;

import net.primal.zerg.entity.LarvaEntity;
import net.primal.zerg.client.model.Modellarva;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class LarvaRenderer extends MobRenderer<LarvaEntity, Modellarva<LarvaEntity>> {
	public LarvaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellarva(context.bakeLayer(Modellarva.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(LarvaEntity entity) {
		return new ResourceLocation("zerg:textures/larve.png");
	}
}
