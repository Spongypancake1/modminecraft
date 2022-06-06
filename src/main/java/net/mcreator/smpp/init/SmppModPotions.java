
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.smpp.SmppMod;

public class SmppModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, SmppMod.MODID);
	public static final RegistryObject<Potion> POTIONCHAOS = REGISTRY.register("potionchaos", () -> new Potion(
			new MobEffectInstance(MobEffects.CONFUSION, 3600, 10, false, true),
			new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 10, false, true),
			new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 10, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 3600, 10, false, true),
			new MobEffectInstance(MobEffects.HUNGER, 3600, 10, false, true), new MobEffectInstance(MobEffects.WEAKNESS, 3600, 10, false, true),
			new MobEffectInstance(MobEffects.GLOWING, 3600, 1, false, true), new MobEffectInstance(MobEffects.LEVITATION, 3600, 10, false, true),
			new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 10, false, true)));
}
