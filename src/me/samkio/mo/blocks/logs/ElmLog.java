package me.samkio.mo.blocks.logs;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class ElmLog extends BaseLog {
	private static int[] ids = {18,2,2,2,2,18};
	public ElmLog(MoarStuph p) {
		super(p, "Elm Log",ids);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
