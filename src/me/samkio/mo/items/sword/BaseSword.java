package me.samkio.mo.items.sword;


import me.samkio.mo.MoarStuph;
import me.samkio.mo.items.tools.BaseTool;

public class BaseSword extends BaseTool{

	public BaseSword(MoarStuph plugin, String name, int id) {
		super(plugin, name, plugin.FarmingTextureFile.getSubTexture(id).toString()); //No idea if this works! :D
	}

}
