package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;


import org.getspout.spoutapi.SpoutManager;


public class CobaltOre extends BaseOre{

	public CobaltOre(MoarStuph p)
	{
		super(p, "Cobalt Ore", 11,0,32,2,8,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

	
	

}
