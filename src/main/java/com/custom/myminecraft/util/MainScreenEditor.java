package com.custom.myminecraft.util;

import com.custom.myminecraft.mainmenu.buttons.*;
import com.custom.myminecraft.mainmenu.buttons.image.AccessibilitySettingsButton;
import com.custom.myminecraft.mainmenu.buttons.image.LanguageButton;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;

public class MainScreenEditor {


    public static SinglePlayButton customButton(SinglePlayButton modsButton) {
        modsButton.changeButtonName("menu.singleplayer");

        //1 이상은 버튼을 위로 옮김, -1 이하는 버튼을 아래로 옮김
        modsButton.changeUpAndDownPosition(0);

        //1 이상은 버튼을 오른쪽으로 옮김, -1 이하는 버튼을 왼쪽으로 옮김
        modsButton.changeLeftAndRightPosition(-30);

        //1 이상은 버튼의 위아래 크기가 커짐, -1 이하는 버튼의 위아래 크기가 작아짐
        modsButton.changeHeight(0);

        //1 이상은 버튼의 좌우 크기가 커짐, -1 이하는 버튼의 좌우 크기가 작아짐
        modsButton.changeWidth(0);
        return modsButton.getRealButton();
    }
    public static MultiPlayButton customButton(MultiPlayButton multiPlayButton) {
        multiPlayButton.changeButtonName("menu.multiplayer");
        multiPlayButton.changeUpAndDownPosition(0);
        multiPlayButton.changeLeftAndRightPosition(-30);
        multiPlayButton.changeHeight(0);
        multiPlayButton.changeWidth(0);
        return multiPlayButton.getRealButton();
    }
    public static OptionsButton customButton(OptionsButton optionsButton) {
        optionsButton.changeButtonName("menu.options");
        optionsButton.changeUpAndDownPosition(0);
        optionsButton.changeLeftAndRightPosition(0);
        optionsButton.changeHeight(0);
        optionsButton.changeWidth(0);
        return optionsButton.getRealButton();
    }
    public static QuitButton customButton(QuitButton quitButton) {
        quitButton.changeButtonName("menu.quit");
        quitButton.changeUpAndDownPosition(0);
        quitButton.changeLeftAndRightPosition(0);
        quitButton.changeHeight(0);
        quitButton.changeWidth(0);
        return quitButton.getRealButton();
    }
    public static RealmsButton customButton(RealmsButton realmsButton) {
        realmsButton.changeButtonName("menu.online");
        realmsButton.changeUpAndDownPosition(0);
        realmsButton.changeLeftAndRightPosition(0);
        realmsButton.changeHeight(0);
        realmsButton.changeWidth(0);
        return realmsButton.getRealButton();
    }

    public static ModsButton customButton(ModsButton modsButton) {
        modsButton.changeButtonName("fml.menu.mods");
        modsButton.changeUpAndDownPosition(0);
        modsButton.changeLeftAndRightPosition(0);
        modsButton.changeHeight(0);
        modsButton.changeWidth(0);
        return modsButton.getRealButton();
    }


    public static AccessibilitySettingsButton customButton(AccessibilitySettingsButton accessibilitySettingsButton) {
        accessibilitySettingsButton.changeButtonName("narrator.button.accessibility");
        accessibilitySettingsButton.changeUpAndDownPosition(0);
        accessibilitySettingsButton.changeLeftAndRightPosition(0);
        accessibilitySettingsButton.changeHeight(0);
        accessibilitySettingsButton.changeWidth(0);
        return accessibilitySettingsButton.getRealButton();
    }

    public static LanguageButton customButton(LanguageButton languageButton) {
        languageButton.changeButtonName("narrator.button.language");
        languageButton.changeUpAndDownPosition(0);
        languageButton.changeLeftAndRightPosition(0);
        languageButton.changeHeight(0);
        languageButton.changeWidth(0);
        return languageButton.getRealButton();
    }

    public static ResourceLocation customPanoramaFolder(){
        return new ResourceLocation("textures/gui/title/background/panorama");
    }
    public static ResourceLocation customAccessibilityButtonImage(){
        return new ResourceLocation("textures/gui/accessibility.png");
    }
    public static ResourceLocation customMinecraftLogo(){
        return new ResourceLocation("textures/gui/title/minecraft.png");
    }
    public static ResourceLocation customMinecraftEditionLogo(){
        return new ResourceLocation("textures/gui/title/edition.png");
    }
}
