
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.entity.PenguinEntity;
import net.mcreator.childrenofsilence.entity.LichOfTheDarknessEntity;
import net.mcreator.childrenofsilence.entity.FireBallProjectileEntity;
import net.mcreator.childrenofsilence.entity.FireBallEntity;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChildrenOfSilenceModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChildrenOfSilenceMod.MODID);
	public static final RegistryObject<EntityType<FireBallProjectileEntity>> FIRE_BALL_PROJECTILE = register("fire_ball_projectile", EntityType.Builder.<FireBallProjectileEntity>of(FireBallProjectileEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireBallProjectileEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<FireBallEntity>> FIRE_BALL = register("fire_ball",
			EntityType.Builder.<FireBallEntity>of(FireBallEntity::new, MobCategory.MISC).setCustomClientFactory(FireBallEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LichOfTheDarknessEntity>> LICH_OF_THE_DARKNESS = register("lich_of_the_darkness",
			EntityType.Builder.<LichOfTheDarknessEntity>of(LichOfTheDarknessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LichOfTheDarknessEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PenguinEntity>> PENGUIN = register("penguin",
			EntityType.Builder.<PenguinEntity>of(PenguinEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PenguinEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FireBallProjectileEntity.init();
			LichOfTheDarknessEntity.init();
			PenguinEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FIRE_BALL_PROJECTILE.get(), FireBallProjectileEntity.createAttributes().build());
		event.put(LICH_OF_THE_DARKNESS.get(), LichOfTheDarknessEntity.createAttributes().build());
		event.put(PENGUIN.get(), PenguinEntity.createAttributes().build());
	}
}
