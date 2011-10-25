package me.samkio.mo;

import me.samkio.mo.blocks.logs.WillowLog;
import me.samkio.mo.blocks.misc.microwave.MicrowaveBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class DebugMan implements CommandExecutor {
	private MoarStuph plugin;

	public DebugMan(MoarStuph p) {
		plugin = p;
	}

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String arg2,
			String[] arg3) {
		Player plr = (Player) cs;
		//This may be less depended upon once SpoutDev correctly register custom items in the creative inventory.
		/*for (MoarCubeCustomBlockSimple b : plugin.ores) {
			plr.getInventory()
					.addItem(
							SpoutManager.getMaterialManager()
									.getCustomItemStack(b, 64));
		}*/
		for (GenericCustomItem b : plugin.food) {
			plr.getInventory().addItem(
					SpoutManager.getMaterialManager()
					.getCustomItemStack(b, 64));
		}
		plr.getInventory().addItem(
				SpoutManager.getMaterialManager().getCustomItemStack(
						new WillowLog(plugin), 64)); 
		plr.getInventory().addItem(
				SpoutManager.getMaterialManager().getCustomItemStack(
						new MicrowaveBlock(plugin), 64));
		return true;
	}
}