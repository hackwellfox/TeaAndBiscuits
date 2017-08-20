package com.stc.teaandbiscuits.init;

import com.stc.teaandbiscuits.items.ItemBase;
import com.stc.teaandbiscuits.items.ItemBiscuits;
import com.stc.teaandbiscuits.items.ItemDrinkable;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 09/08/2017.
 */
public class ModFood {

    public static Item jd = new ItemBiscuits("jd", 2, 0.1F, false);
    public static Item jd_dipped = new ItemBiscuits("jd_dipped", 4, 0.2F, false);
    public static Item cb = new ItemBiscuits("cb", 2, 0.1F, false);
    public static Item cb_dipped = new ItemBiscuits("cb_dipped", 4, 0.2F, false);
    public static Item digestive = new ItemBiscuits("digestive", 2, 0.1F, false);
    public static Item digestive_dipped = new ItemBiscuits("digestive_dipped", 4, 0.2F, false);
    public static Item digestive_chocolate = new ItemBiscuits("digestive_chocolate", 2, 0.1F, false);
    public static Item digestive_chocolate_dipped = new ItemBiscuits("digestive_chocolate_dipped", 4, 0.2F, false);
    public static Item ginger_nut = new ItemBiscuits("ginger_nut", 2, 0.1F, false);
    public static Item ginger_nut_dipped = new ItemBiscuits("ginger_nut_dipped", 4, 0.2F, false);
    public static Item mm = new ItemBiscuits("mm", 2, 0.1F, false);
    public static Item mm_dipped = new ItemBiscuits("mm_dipped", 4, 0.2F, false);
    public static Item nice = new ItemBiscuits("nice", 2, 0.1F, false);
    public static Item nice_dipped = new ItemBiscuits("nice_dipped", 4, 0.2F, false);
    public static Item pick_up = new ItemBiscuits("pick_up", 2, 0.1F, false);
    public static Item pick_up_dipped = new ItemBiscuits("pick_up_dipped", 4, 0.2F, false);
    public static Item rich_tea = new ItemBiscuits("rich_tea", 2, 0.1F, false);
    public static Item rich_tea_dipped = new ItemBiscuits("rich_tea_dipped", 4, 0.2F, false);
    public static Item strawberry = new ItemBase("strawberry").setCreativeTab(ModTabs.tabOther);
    public static Item ginger = new ItemBase("ginger").setCreativeTab(ModTabs.tabOther);

    public static Item cup_tea = new ItemDrinkable("cup_tea");
    public static Item cup_tea_hot = new ItemDrinkable("cup_tea_hot");
    public static Item cup_green_tea = new ItemDrinkable("cup_green_tea");
    public static Item cup_green_tea_hot = new ItemDrinkable("cup_green_tea_hot");
    public static Item chocolate_bucket = new ItemDrinkable("chocolate_bucket");

    public static void register(IForgeRegistry<Item> registry) {

        registry.registerAll(
            jd, jd_dipped, cb, cb_dipped, digestive, digestive_dipped, digestive_chocolate, digestive_chocolate_dipped,
                ginger_nut, ginger_nut_dipped, mm, mm_dipped, nice, nice_dipped, pick_up, pick_up_dipped, rich_tea,
                rich_tea_dipped, strawberry, ginger, cup_tea.setContainerItem(cup_tea), cup_tea_hot.setContainerItem(cup_tea_hot),
                cup_green_tea.setContainerItem(cup_green_tea), cup_green_tea_hot.setContainerItem(cup_green_tea_hot), chocolate_bucket
        );
    }
}
