package me.samkio.mo;


import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class MoarGenericCustomBlock extends GenericCustomBlock {
	private int miny = 0, maxy = 126, frequency = 0,maxDump=0;
	public MoarGenericCustomBlock(MoarStuph p, String name, boolean b, int id,int miny,int maxy,int fr, int maxD) {
		super(p, name, b);
		this.miny = miny;
		this.maxy = maxy;
		this.frequency = fr;
		this.maxDump = maxD;
	}
	public MoarGenericCustomBlock(MoarStuph p, String name, boolean b) {
		super(p, name, b);
	}
	public void setMinY(int i) {
		this.miny = i;
	}

	public void setMaxY(int i) {
		this.maxy = i;
	}

	public int getMinY() {
		return this.miny;
	}

	public int getMaxY() {
		return this.maxy;
	}

	public void setFrequency(int i) {
		this.frequency = i;
	}

	public int getFrequency() {
		return this.frequency;
	}
	public void setMaxDump(int i) {
		this.maxDump = i;
	}

	public int getMaxDump() {
		return this.maxDump;
	}
	public boolean canPlaceBlockAt(World arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canPlaceBlockAt(World arg0, int arg1, int arg2, int arg3,
			BlockFace arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isIndirectlyProdivingPowerTo(World arg0, int arg1, int arg2,
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
	@Override
	public boolean isIndirectlyProvidingPowerTo(World arg0, int arg1, int arg2,
			int arg3, BlockFace arg4) {
		// TODO Auto-generated method stub
		return false;
	}

}