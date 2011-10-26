package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class TinOre extends BaseOre{

	public TinOre(MoarStuph p)
	{
		super(p, "Tin Ore", 2,32,128,16,8,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}
}
