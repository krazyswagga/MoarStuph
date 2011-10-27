package me.samkio.mo;

import me.samkio.mo.blocks.misc.microwave.MicrowaveBlock;
import me.samkio.mo.blocks.misc.nuclear.NuclearBomb;
import me.samkio.mo.blocks.ores.BaseOre;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.getspout.spoutapi.SpoutManager;

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
		for (BaseOre b : ItemMaps.ores) {
			plr.getInventory().addItem(
					SpoutManager.getMaterialManager()
					.getCustomItemStack(b, 64));
		}
		plr.getInventory().addItem(
				SpoutManager.getMaterialManager().getCustomItemStack(
						new NuclearBomb(plugin), 64));
		//plr.getInventory().addItem(
			//	SpoutManager.getMaterialManager().getCustomItemStack(
			//			new WillowLog(plugin), 64)); 
		plr.getInventory().addItem(
				SpoutManager.getMaterialManager().getCustomItemStack(
						new MicrowaveBlock(plugin), 64));
		return true;
	}
}