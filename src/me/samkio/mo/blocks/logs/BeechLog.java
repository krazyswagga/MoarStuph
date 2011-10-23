package me.samkio.mo.blocks.logs;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class BeechLog extends BaseLog {
	private static int[] ids = {19,3,3,3,3,19};
	public BeechLog(MoarStuph p) {
		super(p, "Beech Log",ids);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
