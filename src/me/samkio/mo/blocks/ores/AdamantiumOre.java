package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;



public class AdamantiumOre extends BaseOre{

	public AdamantiumOre(MoarStuph p)
	{
		super(p, "Adamantium Ore",  13,0,32,1,6,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
