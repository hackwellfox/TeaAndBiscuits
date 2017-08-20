package com.stc.teaandbiscuits.init;

import com.stc.teaandbiscuits.items.ItemBase;
import com.stc.teaandbiscuits.items.ItemCustomSeeds;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 09/08/2017.
 */
public class ModItems {

    public static Item cup = new ItemBase("cup").setCreativeTab(ModTabs.tabTea);
    public static Item cup_water = new ItemBase("cup_water").setCreativeTab(ModTabs.tabTea);
    public static Item cup_water_boiled = new ItemBase("cup_water_boiled").setCreativeTab(ModTabs.tabTea);

    public static Item strawberry_seeds = new ItemCustomSeeds("strawberry_seeds", ModBlocks.strawberry_crop, Blocks.FARMLAND).setCreativeTab(ModTabs.tabOther);
    public static Item ginger_seeds = new ItemCustomSeeds("ginger_seeds", ModBlocks.ginger_crop, Blocks.FARMLAND).setCreativeTab(ModTabs.tabOther);
    public static Item tea_seeds = new ItemCustomSeeds("tea_seeds", ModBlocks.tea_crop, Blocks.FARMLAND).setCreativeTab(ModTabs.tabOther);
    public static Item teabag = new ItemBase("teabag").setCreativeTab(ModTabs.tabOther);
    public static Item tea_grain = new ItemBase("tea_grain").setCreativeTab(ModTabs.tabOther);
    public static Item tea_leaf = new ItemBase("tea_leaf").setCreativeTab(ModTabs.tabOther);
    public static Item flour = new ItemBase("flour").setCreativeTab(ModTabs.tabOther);
    public static Item cf = new ItemBase("cf").setCreativeTab(ModTabs.tabOther);
    public static Item jar = new ItemBase("jar").setCreativeTab(ModTabs.tabOther);
    public static Item jam_jar = new ItemBase("jam_jar").setCreativeTab(ModTabs.tabOther);
    public static Item kettle = new ItemBase("kettle").setCreativeTab(ModTabs.tabOther);
    public static Item kettle_cold = new ItemBase("kettle_cold").setCreativeTab(ModTabs.tabOther);
    public static Item kettle_hot = new ItemBase("kettle_hot").setCreativeTab(ModTabs.tabOther);

    public static void register(IForgeRegistry<Item> registry) {

        registry.registerAll(
            cup, cup_water, cup_water_boiled, strawberry_seeds, ginger_seeds, tea_seeds, teabag, tea_grain, tea_leaf, flour, cf, jar, jam_jar,
                kettle, kettle_cold, kettle_hot
        );
    }
}
