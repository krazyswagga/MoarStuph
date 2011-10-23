package me.samkio.mo.blocks.logs;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class WillowLog extends BaseLog {
	private static int[] ids = {16,0,0,0,0,16};
	public WillowLog(MoarStuph p) {
		super(p, "Willow Log",ids);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
