package me.samkio.mo.items.food;

import me.samkio.mo.MoarStuph;

import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
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
	
	@Override
	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block,	BlockFace face) {
		
		if (player.getFoodLevel() != 20 || player.getHealth() != 20) {
			
			if (player.getFoodLevel() != 20 && foodAmount != 0) {
				
				player.setFoodLevel(player.getFoodLevel() + foodAmount);
				
				if (player.getFoodLevel() > 20) {
					
					player.setFoodLevel(20);
				}
			}
			else if (player.getHealth() != 20 && healingAmount != 0) {
				
				player.setHealth(player.getHealth() + healingAmount);
				
				if (player.getHealth() > 20) {
					
					player.setHealth(20);
				}
			}
			consume(player);
			return true;
		}
		
		else {
			return false;
		}
	}
}