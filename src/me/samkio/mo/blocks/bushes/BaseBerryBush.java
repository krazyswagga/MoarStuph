package me.samkio.mo.blocks.bushes;

import me.samkio.mo.ItemMaps;
import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.food.berries.BlueBerry;
import me.samkio.mo.items.seeds.BlueBerrySeed;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.player.SpoutPlayer;
import java.util.Random;

public class BaseBerryBush extends BaseBush {
	MoarStuph p;

	public BaseBerryBush(MoarStuph p, String name, int[] ids, String berryType) {
		super(p, name, new GenericCubeBlockDesign(p, p.TreeTextureFile, ids));
		this.p = p;
		// TODO Move this to the individual berry bushes.
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new BlueBerry(p), 1));
	}

	@Override
	public boolean isIndirectlyProvidingPowerTo(World arg0, int arg1, int arg2,
			int arg3, BlockFace arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProvidingPowerTo(World arg0, int arg1, int arg2, int arg3,
			BlockFace arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onBlockClicked(World arg0, int arg1, int arg2, int arg3,
			SpoutPlayer arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockDestroyed(final World world, final int x, final int y, final int z) {
		// If glitching occurs, possibly add 1 to the y value?
		Random r = new Random();
		world.dropItemNaturally(new Location(world, x, y, z), SpoutManager.getMaterialManager().getCustomItemStack(new BlueBerrySeed(p), r.nextInt(2) + 1));
		p.getServer().getScheduler().scheduleSyncDelayedTask(p, new Runnable() {
			public void run() {
				mm.overrideBlock(world.getBlockAt(x, y, z), ItemMaps.b);
			}
		}, 1L);
	}

	@Override
	public boolean onBlockInteract(World arg0, int arg1, int arg2, int arg3,
			SpoutPlayer arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onBlockPlace(World arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockPlace(World arg0, int arg1, int arg2, int arg3,
			LivingEntity arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEntityMoveAt(World arg0, int arg1, int arg2, int arg3,
			Entity arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNeighborBlockChange(World arg0, int arg1, int arg2, int arg3,
			int arg4) {
		// TODO Auto-generated method stub
		
	}

}
