package net.ashymist.soulless.entity.client;

import net.ashymist.soulless.Soulless;
import net.ashymist.soulless.entity.custom.SoulEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SoulModel extends AnimatedGeoModel<SoulEntity> {
    @Override
    public ResourceLocation getModelResource(SoulEntity object) {
        return new ResourceLocation(Soulless.MOD_ID, "geo/soul.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SoulEntity object) {
        return new ResourceLocation(Soulless.MOD_ID, "textures/texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SoulEntity animatable) {
        return new ResourceLocation(Soulless.MOD_ID, "animations/soul.animation.json");
    }
}
