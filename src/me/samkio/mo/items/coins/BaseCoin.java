package me.samkio.mo.items.coins;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class BaseCoin extends GenericCustomItem {
	MoarStuph plugin;
	
	public BaseCoin(MoarStuph plugin, String name, String image) {
		super(plugin, name, image);
		this.plugin = plugin;
	}
	
}