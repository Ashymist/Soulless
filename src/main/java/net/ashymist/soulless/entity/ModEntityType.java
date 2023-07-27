package net.ashymist.soulless.entity;

import net.ashymist.soulless.Soulless;
import net.ashymist.soulless.entity.custom.SoulEntity;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Soulless.MOD_ID);

    public static final RegistryObject<EntityType<SoulEntity>> Soul = ENTITY_TYPES.register("soul", () -> EntityType.Builder.of(SoulEntity::new, MobCategory.MONSTER)
            .sized(0.4f, 1.5f)
            .build(new ResourceLocation(Soulless.MOD_ID, "soul").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
