package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class DarkOre extends BaseOre{

	public DarkOre(MoarStuph p)
	{
		super(p, "Dark Ore", 14,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

	

}
