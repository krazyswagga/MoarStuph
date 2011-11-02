package me.samkio.mo.items.food.berries;

import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

import me.samkio.mo.MoarStuph;

public class BlueBerry extends BaseBerry {

	public BlueBerry(MoarStuph plugin) {
		super(plugin, "Blueberry", "");
		healingAmount = 1;
		foodAmount = 1;
	}
	
	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block,	BlockFace face) {
		player.getServer().broadcastMessage(face.toString());
		return true;
	}
}
