package com.custom.myminecraft.init;

import com.custom.myminecraft.MyMinecraft;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MyMinecraft.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

    public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
                    .strength(2.0f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(MyMinecraft.TUTORIAL_TAB)));

    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block){
        return BLOCKS.register(name, block);
    }

    private static <T extends Block>RegistryObject<T> register(final String name, final Supplier<? extends T> block,
                                                                   Function<RegistryObject<T>, Supplier<? extends Item>> item){
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}

