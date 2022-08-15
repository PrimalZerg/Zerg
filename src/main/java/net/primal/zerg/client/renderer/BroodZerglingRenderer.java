
package net.primal.zerg.client.renderer;

import net.primal.zerg.entity.BroodZerglingEntity;
import net.primal.zerg.client.model.Modelzergling;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class BroodZerglingRenderer extends MobRenderer<BroodZerglingEntity, Modelzergling<BroodZerglingEntity>> {
	public BroodZerglingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzergling(context.bakeLayer(Modelzergling.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BroodZerglingEntity, Modelzergling<BroodZerglingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("zerg:textures/zergling_eyes.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BroodZerglingEntity entity) {
		return new ResourceLocation("zerg:textures/brood_zergling.png");
	}
}
