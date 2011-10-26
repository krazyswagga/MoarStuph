package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class DarkOre extends BaseOre{

	public DarkOre(MoarStuph p)
	{
		super(p, "Dark Ore", 14,0,16,1,6,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

	

}
