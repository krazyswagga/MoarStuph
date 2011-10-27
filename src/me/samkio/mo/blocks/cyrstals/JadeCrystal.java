package me.samkio.mo.blocks.cyrstals;

import org.getspout.spoutapi.SpoutManager;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.crystals.JadeRaw;

public class JadeCrystal extends BaseCrystal {

	public JadeCrystal(MoarStuph p) {
		super(p, "Jade Crystal", 17, 0,32, 2, 6,BaseCrystal.allBiomes());
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(new JadeRaw(p), 1));

	}

}
