package com.custom.myminecraft.init;

import com.custom.myminecraft.MyMinecraft;
import com.custom.myminecraft.item.CustomItem;
import com.custom.myminecraft.tiers.ToolsTiers;
import net.minecraft.client.gui.components.toasts.TutorialToast;
import net.minecraft.client.renderer.entity.layers.CapeLayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyMinecraft.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new CustomItem(new Item.Properties().tab(MyMinecraft.TUTORIAL_TAB)));

    //4는 고기 2개 만큼
    //리젠 200은 10초, 0은 1레베ㄹ, 1은 2레벨, 1f는 100%를 뜻함(효과 걸리는 확률)
    public static final RegistryObject<Item> EXAMPLE_FUEL = register("example_fuel", () -> new CustomItem(
            new Item.Properties().tab(MyMinecraft.TUTORIAL_TAB).food(new FoodProperties.Builder().nutrition(4)
                    .saturationMod(2.0f)
                    .effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1f).build())));

    public static final RegistryObject<Item> EXAMPLE_SWORD = register("example_sword", () -> new SwordItem(
            ToolsTiers.EXAMPLE_TIER, 2, 10f,
            new Item.Properties().tab(MyMinecraft.TUTORIAL_TAB)));

    //2번째 인자는 공격력, 3번째 인자는 스피드
    public static final RegistryObject<Item> EXAMPLE_PICKAXE = register("example_pickaxe", () -> new PickaxeItem(
            ToolsTiers.EXAMPLE_TIER, 1, 1f,
            new Item.Properties().tab(MyMinecraft.TUTORIAL_TAB)));
//    public static final RegistryObject<Item> EXAMPLE_SHOVEL = register("example_shovel", () -> new ShovelItem(
//            ToolsTiers.EXAMPLE_TIER, 0, 1f,
//            new Item.Properties().tab(MyMinecraft.TUTORIAL_TAB)));
//    public static final RegistryObject<Item> EXAMPLE_AXE = register("example_axe", () -> new AxeItem(
//            ToolsTiers.EXAMPLE_TIER, 4, 0f,
//            new Item.Properties().tab(MyMinecraft.TUTORIAL_TAB)));
//    public static final RegistryObject<Item> EXAMPLE_HOE = register("example_hoe", () -> new HoeItem(
//            ToolsTiers.EXAMPLE_TIER, 0, 0f,
//            new Item.Properties().tab(MyMinecraft.TUTORIAL_TAB)));

    private static <T extends Item>RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name, item);
    }
}
