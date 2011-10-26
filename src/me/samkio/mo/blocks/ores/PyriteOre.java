package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;


public class PyriteOre extends BaseOre{

	public PyriteOre(MoarStuph p)
	{
		super(p, "Pyrite Ore", 12,0,32,2,6,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
