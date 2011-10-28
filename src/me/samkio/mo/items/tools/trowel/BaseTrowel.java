package me.samkio.mo.items.tools.trowel;

import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

import me.samkio.mo.items.tools.BaseTool;

public class BaseTrowel extends BaseTool {

	public BaseTrowel(Plugin plugin, String name, String texture) {
		super(plugin, name, texture);
	}
	
	@Override
	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block,	BlockFace face) {
		//if (block.getTypeId() == ) {
			//return false;
		//}
		return true;
	}

}