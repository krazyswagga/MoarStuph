package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class UraniumOre extends BaseOre{

	public UraniumOre(MoarStuph p)
	{
		super(p, "Uranium Ore", 7,0,32,1,6,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
