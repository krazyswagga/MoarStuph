package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class RuniteOre extends BaseOre{

	public RuniteOre(MoarStuph p)
	{
		super(p, "Zinc Ore", 5,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}
}
