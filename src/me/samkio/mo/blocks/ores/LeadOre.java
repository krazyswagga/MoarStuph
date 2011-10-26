package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;



public class LeadOre extends BaseOre{

	public LeadOre(MoarStuph p)
	{
		super(p, "Lead Ore", 3,0,45,8,6,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}


}
