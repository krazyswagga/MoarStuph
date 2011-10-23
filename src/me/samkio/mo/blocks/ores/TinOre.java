package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarCubeCustomBlockSimple;
import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class TinOre extends MoarCubeCustomBlockSimple{

	public TinOre(MoarStuph p)
	{
		super(p, "Tin Ore", 2,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}
}
