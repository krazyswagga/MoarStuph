package me.samkio.mo.populators;



import java.util.Random;
import java.util.logging.Logger;
import me.samkio.mo.ItemMaps;
import me.samkio.mo.MoarStuph;
import me.samkio.mo.blocks.ores.BaseOre;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.MaterialManager;

public class OrePopulator extends BlockPopulator {
	private MaterialManager itm = SpoutManager.getMaterialManager();
	public static final Logger log = Logger.getLogger("Minecraft");
    private MoarStuph p;
	public OrePopulator(MoarStuph p) {
		this.p = p;
	}

    @Override
	public void populate(World world, Random random, Chunk source) {
		for (BaseOre block:ItemMaps.ores) {
			for (int j = 0; j < block.getFrequency(); j++) {
				internal(source, random, random.nextInt(16),random.nextInt(block.getMaxY()), random.nextInt(16),block.getMaxDump(), block);
			}
		}
	}

	private void internal(Chunk source, Random random, int originX,
			int originY, int originZ, int amount, BaseOre type) {
		for (int i = 0; i < amount; i++) {
			int x = originX + random.nextInt(amount / 2) - amount / 4;
			int y = originY + random.nextInt(amount / 4) - amount / 8;
			int z = originZ + random.nextInt(amount / 2) - amount / 4;
			x &= 0xf;
			z &= 0xf;
			if (y > 127 || y < 0) {
				continue;
			}
			Block block = source.getBlock(x, y, z);
			if (block.getTypeId() == 1) {
				itm.overrideBlock(block,type);
			}
			
			
		}
	}
}