package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class TitaniumOre extends BaseOre{

	public TitaniumOre(MoarStuph p)
	{
		super(p, "Titanium Ore", 4,0,32,2,6,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}
}
