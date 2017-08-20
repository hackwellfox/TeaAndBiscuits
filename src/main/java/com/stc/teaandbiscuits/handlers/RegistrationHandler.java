package com.stc.teaandbiscuits.handlers;

import com.stc.teaandbiscuits.init.ModBlocks;
import com.stc.teaandbiscuits.init.ModFood;
import com.stc.teaandbiscuits.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by patrick on 09/08/2017.
 */
@Mod.EventBusSubscriber
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        // Items
        ModItems.register(event.getRegistry());
        //Food
        ModFood.register(event.getRegistry());
        //Blocks
        ModBlocks.registerItemBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        //Blocks
        ModBlocks.registerBlocks(event.getRegistry());
    }

}


    /*@SubscribeEvent
    public static void blockDrop(BlockEvent.HarvestDropsEvent event) {

        if(event.getState().getBlock() == Blocks.DIRT) {

            Random random = new Random();

            if(random.nextFloat() < 0.7F || event.getDropChance() < 0.7F) {
                event.getDrops().clear();
                event.getDrops().add(new ItemStack(Items.GOLD_INGOT, 1));
            }

            if (random.nextFloat() < 0.6F || event.getDropChance() < 0.6F) {
                event.getDrops().clear();
                event.getDrops().add(new ItemStack(Items.IRON_INGOT,1));

            }

            if (random.nextFloat() < 0.8F || event.getDropChance() < 0.8F) {
                event.getDrops().clear();
                event.getDrops().add(new ItemStack(Items.REDSTONE, 1));
            }

            if (random.nextFloat() < 0.5F || event.getDropChance() < 0.5F) {
                event.getDrops().clear();
                event.getDrops().add(new ItemStack(Items.DYE, 1, 4));
            }
        }
    }
}*/
