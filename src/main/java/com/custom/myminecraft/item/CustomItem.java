package com.custom.myminecraft.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CustomItem extends Item {

    public CustomItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand){
        if(!world.isClientSide()){
            System.out.println(player.getName().getString() + "님의 손 이릅은 " + hand.name() + "입니다.");
        }
        return super.use(world, player, hand);
    }

}
