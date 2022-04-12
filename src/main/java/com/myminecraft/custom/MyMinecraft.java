package com.myminecraft.custom;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("myMinecraft")
public class MyMinecraft{

    public static final String MOD_ID = "myMinecraft";

    public MyMinecraft(){
        MinecraftForge.EVENT_BUS.register(this);
    }

}
