package me.samkio.mo.items.food.fruits;

import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.food.BaseFood;

public class BananaFruit extends BaseFood {
	
	public BananaFruit(MoarStuph plugin) {
		super(plugin, "Banana", "http://cloud.github.com/downloads/mbsuperstar1/MoarStuph/Banana.png");
		healingAmount = 2;
	}
	
	@Override
	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block,	BlockFace face) {
		//player.setHealth(healingAmount);
		if (player.getFoodLevel() == 20) {
			return false;
		}
		player.setFoodLevel(player.getFoodLevel()+healingAmount);
		if (player.getFoodLevel() > 20) {
			player.setFoodLevel(20);
		}
		consume(player);
		return true;
	}

}
