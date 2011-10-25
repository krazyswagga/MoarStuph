package me.samkio.mo.blocks.cyrstals;

import me.samkio.mo.MoarGenericCustomBlock;
import me.samkio.mo.MoarStuph;

public class BaseCrystal extends MoarGenericCustomBlock {

	public BaseCrystal(MoarStuph p, String name, int id, int miny, int maxy,
			int fr, int maxD) {
		super(p, name, false,id, miny, maxy, fr, maxD);
		this.setBlockDesign(new CrystalDesign(id, p));
	}
}
