package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarCubeCustomBlockSimple;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class TitaniumOre extends MoarCubeCustomBlockSimple{

	public TitaniumOre(MoarStuph p)
	{
		super(p, "Titanium Ore", 4,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}
}
