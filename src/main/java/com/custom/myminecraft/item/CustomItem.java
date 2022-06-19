package com.custom.myminecraft.item;

import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

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

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 600;
    }

}
