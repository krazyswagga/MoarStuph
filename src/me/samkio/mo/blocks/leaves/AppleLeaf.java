package me.samkio.mo.blocks.leaves;


import org.bukkit.World;
import me.samkio.mo.MoarStuph;

public class AppleLeaf extends BaseLeaf {
	private static int[] ids = {19,3,3,3,3,19};
	
	public AppleLeaf(MoarStuph p) {
		super(p, "Apple Leaf", ids);
	}
	
	@Override
	public void onBlockDestroyed(World world, int x, int y, int z) {
	}

}