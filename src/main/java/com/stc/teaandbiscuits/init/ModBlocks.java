package com.stc.teaandbiscuits.init;


import com.stc.teaandbiscuits.blocks.BlockGingerCrop;
import com.stc.teaandbiscuits.blocks.BlockStrawberryCrop;
import com.stc.teaandbiscuits.blocks.BlockTeaCrop;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 09/08/2017.
 */
public class ModBlocks {

    public static BlockStrawberryCrop strawberry_crop = new BlockStrawberryCrop("strawberry_crop");
    public static BlockGingerCrop ginger_crop = new BlockGingerCrop("ginger_crop");
    public static BlockTeaCrop tea_crop = new BlockTeaCrop("tea_crop");

    public static void registerBlocks(final IForgeRegistry<Block> event) {
        final Block[] blocks = {
            strawberry_crop, ginger_crop, tea_crop
        };

        event.registerAll(blocks);
    }


    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
            strawberry_crop.createItemBlock(),
            ginger_crop.createItemBlock(),
            tea_crop.createItemBlock()
        );
    }

}
