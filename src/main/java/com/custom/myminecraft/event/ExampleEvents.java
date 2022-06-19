package com.custom.myminecraft.event;

import com.custom.myminecraft.MyMinecraft;
import com.custom.myminecraft.init.BlockInit;
import com.custom.myminecraft.init.ItemInit;
import com.custom.myminecraft.mainmenu.ExampleTitleScreen;
import com.mojang.blaze3d.platform.ScreenManager;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ScreenOpenEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MyMinecraft.MOD_ID)
public class ExampleEvents {

    @SubscribeEvent
    public static void customAttackEvent(LivingAttackEvent iceAttack){

        LivingEntity mob = iceAttack.getEntityLiving(); //데미지 주는사람
        Entity player = iceAttack.getEntity();//
        mob.setItemInHand(InteractionHand.MAIN_HAND, ItemStack.EMPTY);

//        LivingEntity player = useItemEvent.getEntityLiving();
//        System.out.println("he held fuel");
//        System.out.println("ItemInit.EXAMPLE_FUEL.get() -> " + ItemInit.EXAMPLE_FUEL.get().getDescriptionId());
//        System.out.println("player.getMainHandItem() ->" + player.getMainHandItem().getItem().getDescriptionId());
//        System.out.println("he held fuel");
//        if(ItemInit.EXAMPLE_FUEL.get().getDescriptionId().equalsIgnoreCase(player.getMainHandItem().getItem().getDescriptionId())){
//            System.out.println("he held fuel");
//            Level playersLevel = player.getLevel();
//            BlockPos position = player.getOnPos();
//            position.atY(1)
//            playersLevel.setBlock(player.getOnPos(), Blocks.POWDER_SNOW.defaultBlockState(), 2);
//        }
    }

}
