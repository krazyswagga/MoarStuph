package me.samkio.mo.listeners;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.blocks.misc.microwave.MicrowaveBlock;

import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

public class MoarPlayerListener extends PlayerListener{
	MoarStuph plugin;
	public MoarPlayerListener(MoarStuph p){
		this.plugin = p;
	}

	public void onPlayerInteract(PlayerInteractEvent e) {
		if (e.getAction()!= Action.RIGHT_CLICK_BLOCK) {
			return;
		}
		e.getPlayer().sendMessage("Clicked a block!");
		SpoutBlock sb = (SpoutBlock) e.getClickedBlock();
		if (sb instanceof GenericCustomBlock) {
			e.getPlayer().sendMessage("It is a custom block");
		}
		if (sb instanceof MicrowaveBlock) {
			e.getPlayer().sendMessage("It is a microwave block");
		}
	}
}
