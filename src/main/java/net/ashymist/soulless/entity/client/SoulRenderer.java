package net.ashymist.soulless.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ashymist.soulless.Soulless;
import net.ashymist.soulless.entity.client.SoulModel;
import net.ashymist.soulless.entity.custom.SoulEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SoulRenderer extends GeoEntityRenderer<SoulEntity> {
    public SoulRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SoulModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SoulEntity instance) {
        return new ResourceLocation(Soulless.MOD_ID, "soulless/textures/texture.png");
    }

    @Override
    public RenderType getRenderType(SoulEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder,
                                    int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
