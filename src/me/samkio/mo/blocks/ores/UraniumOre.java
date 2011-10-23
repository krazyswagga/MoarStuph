package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarCubeCustomBlockSimple;
import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class UraniumOre extends MoarCubeCustomBlockSimple{

	public UraniumOre(MoarStuph p)
	{
		super(p, "Uranium Ore", 7,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
