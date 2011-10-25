package me.samkio.mo.items.food.fruits;

import org.bukkit.GameMode;
import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.food.BaseFood;

public class PearFruit extends BaseFood {
	
	public PearFruit(MoarStuph plugin) {
		super(plugin, "Pear", "http://cloud.github.com/downloads/mbsuperstar1/MoarStuph/Pear.png");
		healingAmount = 1;
		foodAmount = 1;
	}
	
	@Override
	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block,	BlockFace face) {
		//player.setHealth(healingAmount);
		if (player.getGameMode() == GameMode.CREATIVE) {
			return false;
		}
		player.setFoodLevel(player.getFoodLevel()-foodAmount);
		if (player.getFoodLevel() < 0) {
			player.setFoodLevel(0);
		}
		player.setHealth(player.getHealth()+healingAmount);
		if (player.getHealth() > 20) {
			player.setHealth(20);
		}
		consume(player);
		return true;
	}

}