package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarCubeCustomBlockSimple;
import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;



public class AdamantiumOre extends MoarCubeCustomBlockSimple{

	public AdamantiumOre(MoarStuph p)
	{
		super(p, "Adamantium Ore",  13,10,50,8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
