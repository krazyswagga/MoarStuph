package me.samkio.mo.blocks.cyrstals;

import org.getspout.spoutapi.SpoutManager;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.crystals.AmberRaw;

public class AmberCrystal extends BaseCrystal{

	public AmberCrystal(MoarStuph p) {
		super(p, "Amber Crystal", 22, 0, 32, 2, 6,BaseCrystal.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new AmberRaw(p), 1));
	}

}
