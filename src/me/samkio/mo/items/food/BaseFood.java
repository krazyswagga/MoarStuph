package me.samkio.mo.items.food;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

public class BaseFood extends GenericCustomItem {
	MoarStuph plugin;
	protected int foodAmount;
	protected int healingAmount;
	
	public BaseFood(MoarStuph plugin, String name, String image) {
		super(plugin, name, image);
		this.plugin = plugin;
	}
	
	public void consume(SpoutPlayer player) {
		player.getItemInHand().setAmount(player.getItemInHand().getAmount()-1);
	}
}