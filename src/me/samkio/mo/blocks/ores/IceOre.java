package me.samkio.mo.blocks.ores;


import java.util.Arrays;

import me.samkio.mo.MoarStuph;

import org.bukkit.block.Biome;
import org.getspout.spoutapi.SpoutManager;


public class IceOre extends BaseOre{
	private static Biome[] b = {Biome.ICE_DESERT};
	public IceOre(MoarStuph p)
	{
		super(p, "Ice Ore", 10,0,45,7,10,Arrays.asList(b));
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

}
