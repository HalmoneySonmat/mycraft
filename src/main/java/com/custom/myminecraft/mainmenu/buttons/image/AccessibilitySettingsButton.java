package com.custom.myminecraft.mainmenu.buttons.image;

import com.custom.myminecraft.mainmenu.buttons.ModsButton;
import com.custom.myminecraft.mainmenu.buttons.extend.CustomImageButton;
import com.custom.myminecraft.mainmenu.buttons.interfaces.CustomButtonInterface;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;

public class AccessibilitySettingsButton extends CustomImageButton {

    private int leftAndRightPosition, upAndDownPosition, width, height;
    private Component buttonName;
    private OnPress clickEvent;

    private int imageXPoint, imageYPoint, mouseOverYPoint, imageWidth, imageHeight;
    private ResourceLocation imageFileLocation;

    public AccessibilitySettingsButton(int leftAndRightPosition, int upAndDownPosition, int width, int height,
                                       int imageXPoint, //이미지의 맨 왼쪽부터 0px
                                       int imageYPoint, //이미지의 맨 위부터 0px
                                       int mouseOverYPoint, //마우스가 올라갔을때 이동하는 y축 px
                                       ResourceLocation imageFileLocation, int imageWidth, int imageHeight,
                                       OnPress clickEvent, Component buttonName){
        this.leftAndRightPosition = leftAndRightPosition;
        this.upAndDownPosition = upAndDownPosition;
        this.width = width;
        this.height = height;
        this.buttonName = buttonName;
        this.clickEvent = clickEvent;
        this.imageXPoint = imageXPoint;
        this.imageYPoint = imageYPoint;
        this.mouseOverYPoint = mouseOverYPoint;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.imageFileLocation = imageFileLocation;
    }

    public AccessibilitySettingsButton(int leftAndRightPosition, int upAndDownPosition, int width, int height,
                                       int imageXPoint, //이미지의 맨 왼쪽부터 0px
                                       int imageYPoint, //이미지의 맨 위부터 0px
                                       int mouseOverYPoint, //마우스가 올라갔을때 이동하는 y축 px
                                       ResourceLocation imageFileLocation, int imageWidth, int imageHeight,
                                       OnPress clickEvent, Component buttonName, String setting_modsButton) {
        super(leftAndRightPosition, upAndDownPosition, width, height,
                imageXPoint, imageYPoint, mouseOverYPoint,
                imageFileLocation, imageWidth, imageHeight,
                clickEvent, buttonName);
        System.out.println(setting_modsButton);
    }

    public AccessibilitySettingsButton getRealButton(){
        return new AccessibilitySettingsButton(this.leftAndRightPosition, this.upAndDownPosition, this.width, this.height,
                this.imageXPoint, this.imageYPoint, this.mouseOverYPoint,
                this.imageFileLocation, this.imageWidth, this.imageHeight,
                this.clickEvent, this.buttonName, "Setting AccessibilitySettingsButton");
    }

    @Override
    public void changeWidth(int width) {
        this.width = (this.width + width);
    }

    @Override
    public void changeHeight(int height) {
        this.height = (this.height + height);
    }

    @Override
    public void changeLeftAndRightPosition(int position) {
        this.leftAndRightPosition = (this.leftAndRightPosition + position);
    }

    @Override
    public void changeUpAndDownPosition(int position) {
        this.upAndDownPosition = (this.upAndDownPosition + position);
    }

    @Override
    public void changeButtonName(String nameTag) {
        this.buttonName = new TranslatableComponent(nameTag);
    }
}
