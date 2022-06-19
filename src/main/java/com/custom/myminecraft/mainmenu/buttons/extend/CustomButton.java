package com.custom.myminecraft.mainmenu.buttons.extend;

import com.custom.myminecraft.mainmenu.buttons.interfaces.CustomButtonInterface;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public abstract class CustomButton extends Button implements CustomButtonInterface {

    private int leftAndRightPosition, upAndDownPosition, width, height;
    private Component buttonName;
    private Button.OnPress clickEvent;

    public CustomButton(){
        super(0, 0, 0, 0, null, null);
    }

    public CustomButton(int leftAndRightPosition, int upAndDownPosition, int width, int height, Component buttonName, Button.OnPress clickEvent){
        super(leftAndRightPosition, upAndDownPosition, width, height, buttonName, clickEvent);
    }

    public CustomButton(int leftAndRightPosition, int upAndDownPosition, int width, int height, Component buttonName, OnPress clickEvent, OnTooltip onTooltip){
        super(leftAndRightPosition, upAndDownPosition, width, height, buttonName, clickEvent, onTooltip);
    }

}
