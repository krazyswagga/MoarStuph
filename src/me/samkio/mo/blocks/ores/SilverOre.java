package me.samkio.mo.blocks.ores;


import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;



public class SilverOre extends BaseOre{

	public SilverOre(MoarStuph p)
	{
		super(p, "Silver Ore", 0,0,32,3,7,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}


}
