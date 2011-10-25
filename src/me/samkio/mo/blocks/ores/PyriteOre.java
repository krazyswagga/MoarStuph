package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;


public class PyriteOre extends BaseOre{

	public PyriteOre(MoarStuph p)
	{
		super(p, "Pyrite Ore", 12,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
