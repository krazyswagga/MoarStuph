package me.samkio.mo.items.seeds;

import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.blocks.bushes.EmptyBush;

public class BushSeed extends BaseSeed {
	private MoarStuph p;
	
	public BushSeed(MoarStuph p) {
		super(p, "Bush Seed", "");
		this.p = p;
	}
	
	@Override
	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block,	BlockFace face) {
		EmptyBush bush = new EmptyBush(p);
		
		if (face.toString() == "UP") {
			if (block.getType().toString() == "DIRT" || block.getType().toString() == "GRASS") {
				mm.overrideBlock(block.getLocation().add(new Location(player.getWorld(), 0, 1, 0)).getBlock(), bush);
				if (player.getItemInHand().getAmount() == 1) {
					player.setItemInHand(null);
				} else {
					player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
				}
				bush.watcher.run();
			}
		}
		return true;
	}

}
