package com.stc.teaandbiscuits;

import com.stc.teaandbiscuits.init.ModItems;
import com.stc.teaandbiscuits.init.ModRecipes;
import com.stc.teaandbiscuits.init.ModTabs;
import com.stc.teaandbiscuits.lib.References;
import com.stc.teaandbiscuits.proxy.CommonProxy;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by patrick on 09/08/2017.
 */
@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MC_VERSION)
public class TeaAndBiscuits {

    @Mod.Instance("teaandbiscuits")
    public static TeaAndBiscuits instance;

    @SidedProxy(
            clientSide = "com.stc.teaandbiscuits.proxy.ClientProxy",
            serverSide = "com.stc.teaandbiscuits.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

        ModTabs.registerTabs();
        ModRecipes.registerFurnaceRecipes();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {

        proxy.registerRenders();
        MinecraftForge.EVENT_BUS.register(instance);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.strawberry_seeds), 10);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.ginger_seeds), 10);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.tea_seeds), 10);
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }


}
