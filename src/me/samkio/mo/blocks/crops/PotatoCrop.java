package me.samkio.mo.blocks.crops;

import org.bukkit.World;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.player.SpoutPlayer;

import me.samkio.mo.MoarStuph;

public class PotatoCrop extends BaseCrop {
	private static int[] id = {3,1,0,2,0,0};
	
	public PotatoCrop(MoarStuph p) {
		super(p, "Potato Crop", id);
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z) {
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z,
			LivingEntity entity) {
	}
	
	@Override
	public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
		return false;
		}
	}