package net.ashymist.soulless.event;

import net.ashymist.soulless.Soulless;
import net.ashymist.soulless.entity.ModEntityType;
import net.ashymist.soulless.entity.custom.SoulEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = Soulless.MOD_ID)
    public static class ForgeEvents{

    }
    @Mod.EventBusSubscriber(modid = Soulless.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents{
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event){
            event.put(ModEntityType.Soul.get(), SoulEntity.setAttributes());
        }
    }
}
