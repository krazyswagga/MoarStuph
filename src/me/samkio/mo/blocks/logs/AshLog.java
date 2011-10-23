package me.samkio.mo.blocks.logs;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class AshLog extends BaseLog {
	private static int[] ids = {20,4,4,4,4,20};
	public AshLog(MoarStuph p) {
		super(p, "Ash Log",ids);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
