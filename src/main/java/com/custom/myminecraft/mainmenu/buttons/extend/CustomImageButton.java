package com.custom.myminecraft.mainmenu.buttons.extend;

import com.custom.myminecraft.mainmenu.buttons.interfaces.CustomButtonInterface;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public abstract class CustomImageButton extends ImageButton implements CustomButtonInterface {

    private int leftAndRightPosition, upAndDownPosition, width, height;
    private Component buttonName;
    private OnPress clickEvent;

    public CustomImageButton(){
        super(0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, null);
    }

    public CustomImageButton(int leftAndRightPosition, int upAndDownPosition, int width, int height,
                                       int imageXPoint, //이미지의 맨 왼쪽부터 0px
                                       int imageYPoint, //이미지의 맨 위부터 0px
                                       int mouseOverYPoint, //마우스가 올라갔을때 이동하는 y축 px
                                       ResourceLocation imageFileLocation, int imageWidth, int imageHeight,
                                       OnPress clickEvent, Component buttonName){


        super(leftAndRightPosition, upAndDownPosition, width, height,
                imageXPoint, imageYPoint, mouseOverYPoint,
                imageFileLocation, imageWidth, imageHeight,
                clickEvent, buttonName);
    }

}
