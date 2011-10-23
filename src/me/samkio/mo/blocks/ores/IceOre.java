package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarCubeCustomBlockSimple;
import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class IceOre extends MoarCubeCustomBlockSimple{

	public IceOre(MoarStuph p)
	{
		super(p, "Ice Ore", 10,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
