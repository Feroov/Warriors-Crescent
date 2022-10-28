package com.feroov.frv.item;

import com.feroov.frv.block.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;


public class ModTiers
{
    public static final Tier DAGGER = TierSortingRegistry.registerTier(
            new ForgeTier(1, 170, 4.9f, 0.9f, 10, ModBlocks.Tags.NEEDS_DAGGER_TOOL,
                    () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation("frv:needs_dagger_tool"),
            List.of(Tiers.NETHERITE), List.of());

    public static final ForgeTier GLADIUS = new ForgeTier(1,300,4.9f,1.2f,10,
            Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

//
//    public static final Tier FUNGHONITE = TierSortingRegistry.registerTier(
//            new ForgeTier(6, 3863, 14.5f, 9.5f, 15, ModBlocks.Tags.NEEDS_FUNGHONITE_TOOL,
//                    () -> Ingredient.of(ModItems.METEORITE_INGOT.get())),
//            new ResourceLocation("frv:needs_funghonite_tool"),
//            List.of(ModTiers.METEORITE), List.of());
    /**
     *    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
     *       return Ingredient.of(ItemTags.PLANKS);
     *    }),
     *    STONE(1, 131, 4.0F, 1.0F, 5, () -> {
     *       return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
     *    }),
     *    IRON(2, 250, 6.0F, 2.0F, 14, () -> {
     *       return Ingredient.of(Items.IRON_INGOT);
     *    }),
     *    DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
     *       return Ingredient.of(Items.DIAMOND);
     *    }),
     *    GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
     *       return Ingredient.of(Items.GOLD_INGOT);
     *    }),
     *    NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
     *       return Ingredient.of(Items.NETHERITE_INGOT);
     *    });
     */
}
