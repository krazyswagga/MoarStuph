package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarCubeCustomBlockSimple;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;



public class LeadOre extends MoarCubeCustomBlockSimple{

	public LeadOre(MoarStuph p)
	{
		super(p, "Lead Ore", 3,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}


}
