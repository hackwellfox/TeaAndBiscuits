package com.stc.teaandbiscuits.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by patrick on 10/08/2017.
 */
public class ModTabs {

    public static CreativeTabs tabBiscuits;
    public static CreativeTabs tabTea;
    public static CreativeTabs tabOther;

    public static void registerTabs () {

        tabBiscuits = new CreativeTabs(CreativeTabs.getNextID(), "Biscuits") {
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ModFood.jd);
            }

            @Override
            public String getTranslatedTabLabel() {
                return "Biscuits";
            }
        };

        tabTea = new CreativeTabs(CreativeTabs.getNextID(), "Tea") {
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ModFood.cup_tea);
            }

            @Override
            public String getTranslatedTabLabel() {
                return "Tea";
            }
        };

        tabOther = new CreativeTabs(CreativeTabs.getNextID(), "Misc") {
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ModItems.flour);
            }

            @Override
            public String getTranslatedTabLabel() {
                return "Misc Items";
            }
        };
    }
}
