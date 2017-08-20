package com.stc.teaandbiscuits.items;

import com.stc.teaandbiscuits.init.ModTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by patrick on 10/08/2017.
 */
public class ItemBiscuits extends ItemFood {

    public ItemBiscuits(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModTabs.tabBiscuits);
    }
}
