package me.samkio.mo.blocks.cyrstals;

import org.getspout.spoutapi.SpoutManager;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.crystals.AmethystRaw;

public class AmethystCrystal extends BaseCrystal{

	public AmethystCrystal(MoarStuph p) {
		super(p, "Amethyst Crystal", 20, 0, 32, 2, 6,BaseCrystal.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new AmethystRaw(p), 1));

	}

}
