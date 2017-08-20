package com.stc.teaandbiscuits.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

/**
 * Created by patrick on 10/08/2017.
 */
public class ItemCustomSeeds extends ItemSeeds {

    public ItemCustomSeeds(String name, Block crops, Block soil) {
        super(crops, soil);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
