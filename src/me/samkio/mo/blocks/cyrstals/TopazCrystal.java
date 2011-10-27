package me.samkio.mo.blocks.cyrstals;

import org.getspout.spoutapi.SpoutManager;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.crystals.TopazRaw;

public class TopazCrystal extends BaseCrystal{

	public TopazCrystal(MoarStuph p) {
		super(p, "Topaz Crystal", 21, 0, 32, 1, 6,BaseCrystal.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new TopazRaw(p), 1));

	}

}
