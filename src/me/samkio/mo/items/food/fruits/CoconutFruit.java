package me.samkio.mo.items.food.fruits;

import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.food.BaseFood;

public class CoconutFruit extends BaseFood {
	
	public CoconutFruit(MoarStuph plugin) {
		super(plugin, "Coconut", "Coconut");
	}
	
	@Override
	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block,	BlockFace face) {
		return true;
	}

}