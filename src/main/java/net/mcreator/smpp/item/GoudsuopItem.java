
package net.mcreator.smpp.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.smpp.init.SmppModSounds;

public class GoudsuopItem extends RecordItem {
	public GoudsuopItem() {
		super(0, SmppModSounds.REGISTRY.get(new ResourceLocation("smpp:musiconno")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
