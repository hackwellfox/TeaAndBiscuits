package com.stc.teaandbiscuits.blocks;

import com.stc.teaandbiscuits.init.ModFood;
import com.stc.teaandbiscuits.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by patrick on 10/08/2017.
 */
public class BlockGingerCrop extends BlockCrops {

    public BlockGingerCrop (String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    protected Item getSeed() {
        return ModItems.ginger_seeds;
    }

    @Override
    protected Item getCrop() {
        return ModFood.ginger;
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
