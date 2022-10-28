package com.feroov.frv.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModItemGroup
{
    public static final CreativeModeTab FRV_TAB = new CreativeModeTab("frvModTab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.GLADIUS.get());
        }
    };
}
