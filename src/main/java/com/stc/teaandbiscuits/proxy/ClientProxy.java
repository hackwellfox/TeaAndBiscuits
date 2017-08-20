package com.stc.teaandbiscuits.proxy;

import com.stc.teaandbiscuits.init.ModModelRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by patrick on 09/08/2017.
 */
public class ClientProxy extends CommonProxy {

    public void registerRenders() {

        ModModelRegistry.registerBlockModels();
        ModModelRegistry.registerItemModels();

    }

    @Override
    public EntityPlayer getClientPlayer()
    {
        return Minecraft.getMinecraft().player;
    }

    @Override
    public boolean isSinglePlayer()
    {
        return Minecraft.getMinecraft().isSingleplayer();
    }

    @Override
    public boolean isDedicatedServer()
    {
        return false;
    }
}
