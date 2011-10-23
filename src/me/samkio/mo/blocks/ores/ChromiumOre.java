package me.samkio.mo.blocks.ores;

import me.samkio.mo.MoarCubeCustomBlockSimple;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class ChromiumOre extends MoarCubeCustomBlockSimple {

	public ChromiumOre(MoarStuph p) {
		super(p, "Chromium Ore", 6, 10, 50, 8,6);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(
				this, 1));
	}

}
