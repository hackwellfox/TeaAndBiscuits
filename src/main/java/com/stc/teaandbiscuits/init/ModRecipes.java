package com.stc.teaandbiscuits.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by patrick on 10/08/2017.
 */
public class ModRecipes {

    public static void registerFurnaceRecipes() {
        GameRegistry.addSmelting(ModItems.tea_leaf, new ItemStack(ModItems.tea_grain), 0.7F);
        GameRegistry.addSmelting(ModItems.kettle_cold, new ItemStack(ModItems.kettle_hot), 0.7F);
    }
}
