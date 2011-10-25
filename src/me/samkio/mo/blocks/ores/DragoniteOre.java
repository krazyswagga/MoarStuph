package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class DragoniteOre extends BaseOre{

	public DragoniteOre(MoarStuph p)
	{
		super(p, "Dragonite Ore", 8,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
