package me.samkio.mo.blocks.misc.microwave;

import me.samkio.mo.MoarStuph;

public class MicrowaveItemWatcher implements Runnable {

	@Override
	public void run() {
		for (MicrowaveItem item : MoarStuph.instance.microwavedFood) {
			if (item.getItem().isDead()) {
				item.respawn();
			}
			item.updatePosition();
		}
	}
}
