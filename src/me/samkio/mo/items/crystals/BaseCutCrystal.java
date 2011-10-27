package me.samkio.mo.items.crystals;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class BaseCutCrystal extends GenericCustomItem {
	MoarStuph plugin;
	
	public BaseCutCrystal(MoarStuph plugin, String name, String image) {
		super(plugin, name, image);
		this.plugin = plugin;
	}
	
}