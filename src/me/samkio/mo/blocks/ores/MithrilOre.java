package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarCubeCustomBlockSimple;
import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;

public class MithrilOre extends MoarCubeCustomBlockSimple{

	public MithrilOre(MoarStuph p)
	{
		super(p, "Mithril Ore", 15,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}
}
