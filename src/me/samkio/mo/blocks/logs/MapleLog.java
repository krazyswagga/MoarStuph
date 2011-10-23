package me.samkio.mo.blocks.logs;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class MapleLog extends BaseLog {
	private static int[] ids = {21,5,5,5,5,21};
	public MapleLog(MoarStuph p) {
		super(p, "Maple Log",ids);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
