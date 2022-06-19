package com.custom.myminecraft.tiers;

import com.custom.myminecraft.init.ItemInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolsTiers {
    /* level
    - 0 : 나무
    - 1 : 돌
    - 2 : 철 등
    */

    // uses : 내구도


    public static final ForgeTier EXAMPLE_TIER = new ForgeTier(0, 1400, 1.5f,2f
            ,22, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ItemInit.EXAMPLE_ITEM.get()));
}
