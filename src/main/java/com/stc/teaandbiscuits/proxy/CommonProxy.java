package com.stc.teaandbiscuits.proxy;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by patrick on 09/08/2017.
 */
public class CommonProxy {

    public void registerRenders() {

    }

    public EntityPlayer getClientPlayer()
    {
        return null;
    }

    public boolean isSinglePlayer()
    {
        return false;
    }

    public boolean isDedicatedServer()
    {
        return true;
    }
}
