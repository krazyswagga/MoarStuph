package me.samkio.mo.items.food.berries;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.food.BaseFood;

public class BlueBerry extends BaseFood {

	public BlueBerry(MoarStuph plugin, String name, String image) {
		super(plugin, name, image);
		healingAmount = 1;
		foodAmount = 1;
	}
}
