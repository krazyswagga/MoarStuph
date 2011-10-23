package me.samkio.mo.blocks.logs;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class OakLog extends BaseLog {
	private static int[] ids = {17,1,1,1,1,17};
	public OakLog(MoarStuph p) {
		super(p, "Oak Log",ids);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
