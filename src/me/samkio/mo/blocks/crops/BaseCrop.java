package me.samkio.mo.blocks.crops;

import me.samkio.mo.MoarStuph;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class BaseCrop extends GenericCubeCustomBlock {

	public BaseCrop(MoarStuph p, String name, int[] id) {
		super(p, name, new GenericCubeBlockDesign(p, p.FarmingTextureFile, id));
		this.setBlockDesign(new CropDesign());
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
	public void onBlockDestroyed(World arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
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