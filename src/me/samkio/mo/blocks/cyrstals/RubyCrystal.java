package me.samkio.mo.blocks.cyrstals;

import org.getspout.spoutapi.SpoutManager;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.crystals.RubyRaw;

public class RubyCrystal extends BaseCrystal{

	public RubyCrystal(MoarStuph p) {
		super(p, "Ruby Crystal", 18, 0, 32, 3, 6,BaseCrystal.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new RubyRaw(p), 1));

	}

}
