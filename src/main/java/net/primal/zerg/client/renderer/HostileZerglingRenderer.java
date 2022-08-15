
package net.primal.zerg.client.renderer;

import net.primal.zerg.entity.HostileZerglingEntity;
import net.primal.zerg.client.model.Modelzergling;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class HostileZerglingRenderer extends MobRenderer<HostileZerglingEntity, Modelzergling<HostileZerglingEntity>> {
	public HostileZerglingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzergling(context.bakeLayer(Modelzergling.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<HostileZerglingEntity, Modelzergling<HostileZerglingEntity>>(this) {
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
