package com.custom.myminecraft;

import com.custom.myminecraft.init.BlockInit;
import com.custom.myminecraft.init.ItemInit;
import com.custom.myminecraft.mainmenu.ExampleTitleScreen;
import com.mojang.blaze3d.platform.ScreenManager;
import net.minecraft.SharedConstants;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.client.gui.screens.LoadingOverlay;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.worldselection.SelectWorldScreen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.resolver.ServerAddress;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ConfigGuiHandler;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.client.event.ScreenOpenEvent;
import net.minecraftforge.client.gui.ForgeIngameGui;
import net.minecraftforge.client.loading.ClientModLoader;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forgespi.language.IModInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Mod("myminecraft")
public class MyMinecraft{

    Minecraft minecraft = Minecraft.getInstance();

    public static final String MOD_ID = "myminecraft";

    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {

        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
        }
    };


    public MyMinecraft(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

//      스크린의 버튼 이름정도는 변경할 수 있지만, 이 프로젝트로는 안된다.

//        MenuScreens.register(MenuType);
        ExampleTitleScreen customScreen = new ExampleTitleScreen();
        List<GuiEventListener> guiEventListenerList = new ArrayList<>();
        guiEventListenerList.add(customScreen.getFocused());

        Consumer<GuiEventListener> eventListenerConsumerStart = guiEventListener -> System.out.println("시작");
        Consumer<GuiEventListener> eventListenerConsumerEnd = guiEventListener -> System.out.println("종료");

        System.out.println("haha");
//
//        Minecraft.getInstance().screen
//
//        MinecraftForge.EVENT_BUS.

        MinecraftForge.EVENT_BUS.post(new ScreenEvent.InitScreenEvent.Post(customScreen, guiEventListenerList, eventListenerConsumerStart, eventListenerConsumerEnd));

        MinecraftForge.EVENT_BUS.register(this);
    }

}