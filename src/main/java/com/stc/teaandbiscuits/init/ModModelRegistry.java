package com.stc.teaandbiscuits.init;

import com.stc.teaandbiscuits.lib.References;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by patrick on 09/08/2017.
 */
public class ModModelRegistry {

    public static void registerBlockModels() {
        registerBlockRender(ModBlocks.strawberry_crop);
        registerBlockRender(ModBlocks.ginger_crop);
        registerBlockRender(ModBlocks.tea_crop);
    }

    public static void registerItemModels() {

        registerItemRender(ModFood.jd);
        registerItemRender(ModFood.jd_dipped);
        registerItemRender(ModFood.cb);
        registerItemRender(ModFood.cb_dipped);
        registerItemRender(ModFood.digestive);
        registerItemRender(ModFood.digestive_dipped);
        registerItemRender(ModFood.digestive_chocolate);
        registerItemRender(ModFood.digestive_chocolate_dipped);
        registerItemRender(ModFood.ginger_nut);
        registerItemRender(ModFood.ginger_nut_dipped);
        registerItemRender(ModFood.mm);
        registerItemRender(ModFood.mm_dipped);
        registerItemRender(ModFood.nice);
        registerItemRender(ModFood.nice_dipped);
        registerItemRender(ModFood.pick_up);
        registerItemRender(ModFood.pick_up_dipped);
        registerItemRender(ModFood.rich_tea);
        registerItemRender(ModFood.rich_tea_dipped);
        registerItemRender(ModFood.strawberry);
        registerItemRender(ModFood.ginger);
        registerItemRender(ModItems.tea_leaf);
        registerItemRender(ModItems.tea_grain);

        registerItemRender(ModFood.cup_tea);
        registerItemRender(ModFood.cup_tea_hot);
        registerItemRender(ModFood.cup_green_tea);
        registerItemRender(ModFood.cup_green_tea_hot);
        registerItemRender(ModFood.chocolate_bucket);

        registerItemRender(ModItems.cup);
        registerItemRender(ModItems.cup_water);
        registerItemRender(ModItems.cup_water_boiled);
        registerItemRender(ModItems.strawberry_seeds);
        registerItemRender(ModItems.ginger_seeds);
        registerItemRender(ModItems.tea_seeds);
        registerItemRender(ModItems.teabag);
        registerItemRender(ModItems.flour);
        registerItemRender(ModItems.cf);
        registerItemRender(ModItems.jar);
        registerItemRender(ModItems.jam_jar);
        registerItemRender(ModItems.kettle);
        registerItemRender(ModItems.kettle_cold);
        registerItemRender(ModItems.kettle_hot);


    }

    public static void registerBlockRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
