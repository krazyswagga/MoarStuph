package me.samkio.mo.blocks.logs;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class PalmLog extends BaseLog {
	private static int[] ids = {23,7,7,7,7,23};
	public PalmLog(MoarStuph p) {
		super(p, "Palm Log",ids);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
