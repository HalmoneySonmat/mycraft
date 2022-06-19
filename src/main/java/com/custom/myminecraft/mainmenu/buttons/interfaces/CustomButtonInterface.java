package com.custom.myminecraft.mainmenu.buttons.interfaces;

import net.minecraft.network.chat.Component;

public interface CustomButtonInterface {
    public void changeWidth(int width);
    public void changeHeight(int height);
    public void changeLeftAndRightPosition(int position);
    public void changeUpAndDownPosition(int position);
    public void changeButtonName(String nameTag);
}
