package me.samkio.mo;

import me.samkio.mo.blocks.misc.microwave.MicrowaveItem;

import org.bukkit.Location;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;

public class MoarBlockListener extends BlockListener {
	MoarStuph plugin;

	public MoarBlockListener(MoarStuph p) {
		this.plugin = p;
	}

	public void onBlockBreak(BlockBreakEvent e) {
		//Not the best.
		//Microwaves turn to glass on destruction, D:
		for (MicrowaveItem item : MoarStuph.instance.microwavedFood) {
			Location temp = item.getLocation().getBlock().getLocation();
			e.getPlayer().sendMessage(
					"Destroyed Somin @" + e.getBlock().getLocation());
			e.getPlayer().sendMessage("Destroyed temp @" + temp);
			if (e.getBlock().getLocation().equals(temp)) {
				e.getPlayer().sendMessage(
						"No it's an Oven! It has stuph in. Bad Player!!!");
				e.setCancelled(true);
				return;
			} else if (e.getBlock().getLocation().equals(temp.add(0, -1, 0))) {
				e.getPlayer()
						.sendMessage(
								"No it's an Oven! It has stuph in. Bad Player!!! Block Below. -.-");
				e.setCancelled(true);
				return;
			} else if (e.getBlock().getLocation().equals(temp.add(1, 0, 0))) {
				e.getPlayer()
						.sendMessage(
								"No it's an Oven! It has stuph in. Bad Player!!! Block X. -.-");
				e.setCancelled(true);
				return;
			} else if (e.getBlock().getLocation().equals(temp.add(-2, 0, 0))) {
				e.getPlayer()
						.sendMessage(
								"No it's an Oven! It has stuph in. Bad Player!!! Block X. -.-");
				e.setCancelled(true);
				return;
			} else if (e.getBlock().getLocation().equals(temp.add(2, 0, 1))) {
				e.getPlayer()
						.sendMessage(
								"No it's an Oven! It has stuph in. Bad Player!!! Block X. -.-");
				e.setCancelled(true);
				return;
			} else if (e.getBlock().getLocation().equals(temp.add(0, 0, -2))) {
				e.getPlayer()
						.sendMessage(
								"No it's an Oven! It has stuph in. Bad Player!!! Block X. -.-");
				e.setCancelled(true);
				return;
			}
		}
	}

}
