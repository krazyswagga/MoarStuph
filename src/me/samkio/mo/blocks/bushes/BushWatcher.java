package me.samkio.mo.blocks.bushes;

import me.samkio.mo.MoarStuph;

public class BushWatcher {
	MoarStuph p;
	EmptyBush bush;
	// TODO: Possibly make it a BaseBush and cast it to an EmptyBush
	
	public BushWatcher(MoarStuph p, EmptyBush bush) {
		this.p = p;
		this.bush = bush;
	}
	
	public void run() {
		p.getServer().getScheduler().scheduleSyncDelayedTask(p, new Runnable() {
			public void run() {
				bush.grow();
			}
		}, 50L);
	}

}
