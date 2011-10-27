package me.samkio.mo.blocks.cyrstals;

import org.getspout.spoutapi.SpoutManager;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.crystals.SapphireRaw;

public class SapphireCrystal extends BaseCrystal{

	public SapphireCrystal(MoarStuph p) {
		super(p, "Sapphire Crystal", 19, 0, 32, 3, 6,BaseCrystal.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new SapphireRaw(p), 1));

	}

}
