package me.samkio.mo.items.seeds;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class BaseSeed extends GenericCustomItem {
	MoarStuph plugin;

	public BaseSeed(MoarStuph plugin, String name, String image) {
		super(plugin, name, image);
		this.plugin = plugin;
	}

}
