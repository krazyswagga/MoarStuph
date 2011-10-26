package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class ChromiumOre extends BaseOre{

	public ChromiumOre(MoarStuph p) {
		super(p, "Chromium Ore", 6, 0, 32, 2,6,BaseOre.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}
}
