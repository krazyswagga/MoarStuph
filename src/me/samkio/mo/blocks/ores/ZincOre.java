package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarCubeCustomBlockSimple;
import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;


public class ZincOre extends MoarCubeCustomBlockSimple{

	public ZincOre(MoarStuph p)
	{
		super(p, "Zinc Ore", 5,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}
}
