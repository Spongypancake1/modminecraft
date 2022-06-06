
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.smpp.item.StoneArmorItem;
import net.mcreator.smpp.item.RedsaberItem;
import net.mcreator.smpp.item.PurplesaberItem;
import net.mcreator.smpp.item.LightessenceItem;
import net.mcreator.smpp.item.KatanaItem;
import net.mcreator.smpp.item.HandleItem;
import net.mcreator.smpp.item.GreensaberItem;
import net.mcreator.smpp.item.GoudsuopItem;
import net.mcreator.smpp.item.EmptytorchItem;
import net.mcreator.smpp.item.BluesaberItem;
import net.mcreator.smpp.item.BladeItem;
import net.mcreator.smpp.SmppMod;

public class SmppModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SmppMod.MODID);
	public static final RegistryObject<Item> BLADE = REGISTRY.register("blade", () -> new BladeItem());
	public static final RegistryObject<Item> KATANA = REGISTRY.register("katana", () -> new KatanaItem());
	public static final RegistryObject<Item> STONE_ARMOR_HELMET = REGISTRY.register("stone_armor_helmet", () -> new StoneArmorItem.Helmet());
	public static final RegistryObject<Item> STONE_ARMOR_CHESTPLATE = REGISTRY.register("stone_armor_chestplate",
			() -> new StoneArmorItem.Chestplate());
	public static final RegistryObject<Item> STONE_ARMOR_LEGGINGS = REGISTRY.register("stone_armor_leggings", () -> new StoneArmorItem.Leggings());
	public static final RegistryObject<Item> STONE_ARMOR_BOOTS = REGISTRY.register("stone_armor_boots", () -> new StoneArmorItem.Boots());
	public static final RegistryObject<Item> GOUDSUOP = REGISTRY.register("goudsuop", () -> new GoudsuopItem());
	public static final RegistryObject<Item> LIGHTESSENCE = REGISTRY.register("lightessence", () -> new LightessenceItem());
	public static final RegistryObject<Item> BLUESABER = REGISTRY.register("bluesaber", () -> new BluesaberItem());
	public static final RegistryObject<Item> GREENSABER = REGISTRY.register("greensaber", () -> new GreensaberItem());
	public static final RegistryObject<Item> REDSABER = REGISTRY.register("redsaber", () -> new RedsaberItem());
	public static final RegistryObject<Item> PURPLESABER = REGISTRY.register("purplesaber", () -> new PurplesaberItem());
	public static final RegistryObject<Item> LIGHTBLOCK = block(SmppModBlocks.LIGHTBLOCK, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> KING = REGISTRY.register("king_spawn_egg",
			() -> new ForgeSpawnEggItem(SmppModEntities.KING, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> EMPTYTORCH = REGISTRY.register("emptytorch", () -> new EmptytorchItem());
	public static final RegistryObject<Item> FIREFLY = REGISTRY.register("firefly_spawn_egg",
			() -> new ForgeSpawnEggItem(SmppModEntities.FIREFLY, -16777216, -256, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HANDLE = REGISTRY.register("handle", () -> new HandleItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
