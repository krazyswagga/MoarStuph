package me.samkio.mo.blocks.ores;

import java.util.Arrays;

import me.samkio.mo.MoarStuph;

import org.bukkit.block.Biome;
import org.getspout.spoutapi.SpoutManager;


public class FireOre extends BaseOre{
	private static Biome[] b = {Biome.DESERT};
	public FireOre(MoarStuph p)
	{
		super(p, "Fire Ore",9,0,45,7,10,Arrays.asList(b));
		this.setItemDrop(SpoutManager.getMaterialManager().getCustomItemStack(this, 1));
	}

	

}
