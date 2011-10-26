package me.samkio.mo.blocks.ores;


import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;


public class CopperOre extends BaseOre{

	public CopperOre(MoarStuph p)
	{
		super(p, "Copper Ore", 1,32,128,20,8,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

	
}
