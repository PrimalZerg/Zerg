
package net.primal.zerg.client.renderer;

import net.primal.zerg.entity.BroodHydraliskEntity;
import net.primal.zerg.client.model.Modelhydralisk;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class BroodHydraliskRenderer extends MobRenderer<BroodHydraliskEntity, Modelhydralisk<BroodHydraliskEntity>> {
	public BroodHydraliskRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhydralisk(context.bakeLayer(Modelhydralisk.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BroodHydraliskEntity, Modelhydralisk<BroodHydraliskEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("zerg:textures/hydralisk_eyes.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BroodHydraliskEntity entity) {
		return new ResourceLocation("zerg:textures/brood_hydralisk.png");
	}
}
