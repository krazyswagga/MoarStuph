package me.samkio.mo.items.ingots;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class BaseIngot extends GenericCustomItem {
    MoarStuph plugin;

	public BaseIngot(MoarStuph plugin, String name, String image) {
		super(plugin, name, "http://dl.dropbox.com/u/19653570/Items/Ingots/"+image+"Ingot.png");
		this.plugin = plugin;
	}

}