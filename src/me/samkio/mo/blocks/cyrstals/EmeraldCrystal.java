package me.samkio.mo.blocks.cyrstals;

import org.getspout.spoutapi.SpoutManager;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.crystals.EmeraldRaw;

public class EmeraldCrystal extends BaseCrystal{

	public EmeraldCrystal(MoarStuph p) {
		super(p, "Emerald Crystal", 16, 0, 32, 3, 6,BaseCrystal.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new EmeraldRaw(p), 1));

	}

}
