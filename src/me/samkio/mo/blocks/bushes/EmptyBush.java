package me.samkio.mo.blocks.bushes;

import java.util.Random;

import org.bukkit.World;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.Material;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.player.SpoutPlayer;

import me.samkio.mo.ItemMaps;
import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.seeds.BlueBerrySeed;
import me.samkio.mo.items.seeds.BushSeed;

public class EmptyBush extends BaseBush {
	@SuppressWarnings("unused")
	private MoarStuph p;
	public BushWatcher watcher;
	public boolean isGrown;
	int growCount = 0;
	
	public EmptyBush(MoarStuph p) {
		super(p, "Bush", new EmptyBushDesign(p));
		this.p = p;
		Random r = new Random();
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new BushSeed(p), r.nextInt(2) + 1));
		watcher = new BushWatcher(p, this);
	}
	
	public boolean grow() {
		// TODO Return true if there is more to grow, false if there is no more to grow.
		if (growCount > 10) {
			return false;
		}
		else {
			growCount = growCount + 2;
			watcher.run();
			return true;
		}
		
		// TODO Make the growCount expand the bush's quads.
	}
	
	@Override
	public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
		
		//Check if item in hand is a berry seed.
		Material item = MaterialData.getMaterial(player.getItemInHand().getTypeId(), player.getItemInHand().getDurability());
		if (SpoutManager.getMaterialManager().isCustomItem(player.getItemInHand())) {
			if (item instanceof BlueBerrySeed) {
				mm.overrideBlock(world.getBlockAt(x, y, z), ItemMaps.b1);
				if (player.getItemInHand().getAmount() == 1) {
					player.setItemInHand(null);
				} else {
					player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
				}
			}
		}
		
		return false;
	}

}
