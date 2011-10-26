package me.samkio.mo.blocks.ores;


import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class MithrilOre extends BaseOre{

	public MithrilOre(MoarStuph p)
	{
		super(p, "Mithril Ore", 15,0,45,2,7,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}
}
