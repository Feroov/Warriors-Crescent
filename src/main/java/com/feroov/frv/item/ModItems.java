package com.feroov.frv.item;


import com.feroov.frv.FRV;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FRV.MOD_ID);


    public static final RegistryObject<Item> DAGGER = ITEMS.register("dagger", () -> new AxeItem(ModTiers.DAGGER, 3, -1.4f, new Item.Properties().tab(ModItemGroup.FRV_TAB)));
    public static final RegistryObject<Item> GLADIUS = ITEMS.register("gladius", () -> new SwordItem(ModTiers.GLADIUS, 4, -2.4f, new Item.Properties().tab(ModItemGroup.FRV_TAB)));


//    @Override
//    public boolean hurtEnemy(ItemStack p_41395_, LivingEntity p_41396_, LivingEntity p_41397_)
//    {
//        if(!p_41397_.level.isClientSide())
//        {
//            p_41396_.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 1));
//        }
//        return super.hurtEnemy(p_41395_, p_41396_, p_41397_);
//    }

//@Override
//public boolean hurtEnemy(ItemStack itemStack, LivingEntity livingEntity, LivingEntity livingEntity1)
//{
//    livingEntity.setSecondsOnFire(30);
//    if(!livingEntity.level.isClientSide())
//    {
//        ServerLevel world = (ServerLevel) livingEntity.level;
//        BlockPos position = livingEntity.blockPosition();
//
//        EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
//                MobSpawnType.TRIGGERED, true, true);
//
//        EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
//                MobSpawnType.TRIGGERED, true, true);
//
//        EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
//                MobSpawnType.TRIGGERED, true, true);
//
//        ModEntityTypes.ELECTRICITY.get().spawn(world, null, null, position,
//                MobSpawnType.TRIGGERED, true, true);
//
//    }
//    return super.hurtEnemy(itemStack, livingEntity, livingEntity1);
//}
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
