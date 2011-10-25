package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class FireOre extends BaseOre{

	public FireOre(MoarStuph p)
	{
		super(p, "Fire Ore",9,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

	

}
