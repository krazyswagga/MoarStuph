package me.samkio.mo.blocks.ores;


import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;


public class CopperOre extends BaseOre{

	public CopperOre(MoarStuph p)
	{
		super(p, "Copper Ore", 1,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

	
}
