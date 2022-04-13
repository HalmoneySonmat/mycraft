package com.custom.myminecraft.init;

import com.custom.myminecraft.MyMinecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyMinecraft.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties().tab(MyMinecraft.TUTORIAL_TAB)));

    private static <T extends Item>RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name, item);
    }
}
