package me.samkio.mo.blocks.misc.nuclear;

import me.samkio.mo.MoarStuph;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class NuclearBomb extends GenericCubeCustomBlock {
	private static int[] id = {3,1,0,2,0,0}; //Using Microwave texture as a place-holder. Waiting on artists.
	private MoarStuph p;

	public NuclearBomb(MoarStuph plugin) {
		super(plugin, "Nuclear Bomb", false, new GenericCubeBlockDesign(plugin, plugin.MiscTextureFile, id), 1000);
		this.p = plugin;
	}

	@Override
	public boolean isIndirectlyProvidingPowerTo(World world, int x, int y,
			int z, BlockFace arg4) {
		return false;
	}

	@Override
	public boolean isProvidingPowerTo(World world, int x, int y, int z,
			BlockFace face) {
		return false;
	}

	@Override
	public void onBlockClicked(World world, int x, int y, int z,
			SpoutPlayer arg4) {
		Location loc = world.getBlockAt(x, y, z).getLocation();
		NuclearTimer timer = new NuclearTimer(loc, world, 10);
		p.getServer().getScheduler().scheduleSyncDelayedTask(p, timer, 40);
	}

	@Override
	public void onBlockDestroyed(World world, int x, int y, int z) {
		Location loc = world.getBlockAt(x, y, z).getLocation();
		NuclearTimer timer = new NuclearTimer(loc, world, 10);
		p.getServer().getScheduler().scheduleSyncDelayedTask(p, timer, 40);
	}

	@Override
	public boolean onBlockInteract(World world, int x, int y, int z,
			SpoutPlayer arg4) {
		Location loc = world.getBlockAt(x, y, z).getLocation();
		NuclearTimer timer = new NuclearTimer(loc, world, 10);
		p.getServer().getScheduler().scheduleSyncDelayedTask(p, timer, 40);
		return false;
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z) {
		Block block = world.getBlockAt(x, y, z);
		if (block.isBlockPowered() || block.isBlockIndirectlyPowered()) {
			Location loc = block.getLocation();
			NuclearTimer timer = new NuclearTimer(loc, world, 10);
			p.getServer().getScheduler().scheduleSyncDelayedTask(p, timer, 40);
			}
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z,
			LivingEntity arg4) {
		Block block = world.getBlockAt(x, y, z);
		if (block.isBlockPowered() || block.isBlockIndirectlyPowered()) {
			Location loc = block.getLocation();
			NuclearTimer timer = new NuclearTimer(loc, world, 10);
			p.getServer().getScheduler().scheduleSyncDelayedTask(p, timer, 40);
			}
	}

	@Override
	public void onEntityMoveAt(World world, int x, int y, int z,
			Entity arg4) {
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z,
			int arg4) {
		Block block = world.getBlockAt(x, y, z);
		if (block.isBlockPowered() || block.isBlockIndirectlyPowered()) {
			Location loc = block.getLocation();
			NuclearTimer timer = new NuclearTimer(loc, world, 10);
			p.getServer().getScheduler().scheduleSyncDelayedTask(p, timer, 40);
		}
	}
}