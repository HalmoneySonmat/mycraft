package com.custom.myminecraft.event;


import com.custom.myminecraft.MyMinecraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MyMinecraft.MOD_ID)
public class SplashEvent {


    @SubscribeEvent
    public static void customSplashEvent(LivingEvent.LivingUpdateEvent updateEvent){
        if(updateEvent.getEntity() != null){
            String name = updateEvent.getEntity().getName().getString();
            if(name.contains("Dev")){
                System.out.println("moveDist -> " + updateEvent.getEntity().moveDist);
                System.out.println("fallDistance -> " + updateEvent.getEntity().fallDistance);
                System.out.println("blockPosition -> " + updateEvent.getEntity().blockPosition().toShortString());
                System.out.println("FeetBlockState().getBlock().getName() -> " + updateEvent.getEntity().getFeetBlockState().getBlock().getName());
            }
        }

    }

    @SubscribeEvent
    public static void customFallEvent(LivingFallEvent fallEvent){
        //얘는 땅에 떨어졌을때만임
//        System.out.println("fallEvent.getEntityLiving() -> " + fallEvent.getEntityLiving().getDisplayName().getString() + ", ");
//        if(playerEntity != null){
//            System.out.println("playerEntity.getDisplayName().equals(fallEvent.getEntityLiving().getDisplayName()) -> " + playerEntity.getDisplayName().equals(fallEvent.getEntityLiving().getDisplayName()));
//            if(playerEntity.getDisplayName().equals(fallEvent.getEntityLiving().getDisplayName())){
//                System.out.println("fallEvent.getDamageMultiplier() -> " + fallEvent.getDamageMultiplier());
//                System.out.println("fallEvent.getDistance() -> " + fallEvent.getDistance());
//            }
//        }
    }

}
