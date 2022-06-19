package com.custom.myminecraft.mainmenu.buttons;

import com.custom.myminecraft.mainmenu.buttons.extend.CustomButton;
import com.custom.myminecraft.mainmenu.buttons.interfaces.CustomButtonInterface;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;

public class MultiPlayButton extends CustomButton {

    private int leftAndRightPosition, upAndDownPosition, width, height;
    private Component buttonName;
    private OnPress clickEvent;
    private OnTooltip onTooltip;

    public MultiPlayButton(int leftAndRightPosition, int upAndDownPosition, int width, int height, Component buttonName, OnPress clickEvent, OnTooltip onTooltip){
        this.leftAndRightPosition = leftAndRightPosition;
        this.upAndDownPosition = upAndDownPosition;
        this.width = width;
        this.height = height;
        this.buttonName = buttonName;
        this.clickEvent = clickEvent;
        this.onTooltip = onTooltip;
    }

    public MultiPlayButton(int leftAndRightPosition, int upAndDownPosition, int width, int height, Component buttonName, OnPress clickEvent, OnTooltip onTooltip, String message){
        super(leftAndRightPosition, upAndDownPosition, width, height, buttonName, clickEvent, onTooltip);
        System.out.println(message);
    }

    public MultiPlayButton getRealButton(){
        return new MultiPlayButton(this.leftAndRightPosition, this.upAndDownPosition, this.width, this.height, this.buttonName, this.clickEvent, this.onTooltip, "Setting MultiPlayButton");
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
