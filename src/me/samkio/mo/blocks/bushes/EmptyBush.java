package me.samkio.mo.blocks.bushes;

import java.util.Random;

import org.bukkit.World;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.seeds.BushSeed;

public class EmptyBush extends BaseBush {
	private MoarStuph p;
	private static int[] ids = {17,1,1,1,1,17};
	
	public EmptyBush(MoarStuph p) {
		super(p, "Bush", ids);
		this.p = p;
		Random r = new Random();
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new BushSeed(p), r.nextInt(2) + 1));
	}
	
	@Override
	public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
		
		//Check if item in hand is a berry seed.
		
		return false;
	}

}
