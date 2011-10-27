package me.samkio.mo.blocks.misc.nuclear;

import org.bukkit.Location;
import org.bukkit.World;

public class NuclearTimer implements Runnable {
	private Location loc;
	private World world;
	private int i;

	public NuclearTimer(Location loc, World world, int i) {
		this.loc = loc;
		this.world = world;
		this.i = i;
	}

	@Override
	public void run() {
		world.createExplosion(loc, i);
		//world.a(tnt, loc.getX(), loc.getY(), loc.getZ(), i);
	}

}