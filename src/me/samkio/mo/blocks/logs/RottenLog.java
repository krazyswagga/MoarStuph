package me.samkio.mo.blocks.logs;
import me.samkio.mo.MoarStuph;
import org.getspout.spoutapi.SpoutManager;

public class RottenLog extends BaseLog {
	private static int[] ids = {22,6,6,6,6,22};
	public RottenLog(MoarStuph p) {
		super(p, "Rotten Log",ids);
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
