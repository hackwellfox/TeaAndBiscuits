package com.stc.teaandbiscuits.items;

import com.stc.teaandbiscuits.init.ModTabs;
import net.minecraft.item.Item;

/**
 * Created by patrick on 10/08/2017.
 */
public class ItemBase extends Item {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);

    }
}
