package me.samkio.mo.blocks.cyrstals;

import java.util.ArrayList;
import java.util.List;

import me.samkio.mo.MoarStuph;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class BaseCrystal extends GenericCustomBlock {
	private List<Biome> b;
	private int miny = 0, maxy = 126, frequency = 0,maxDump=0;
	public BaseCrystal(MoarStuph p, String name, int id,int miny,int maxy,int fr, int maxD,List<Biome> biomes) {
		super(p, name, false);
                this.setBlockDesign(new CrystalDesign(id, p));
		this.miny = miny;
		this.maxy = maxy;
		this.frequency = fr;
		this.maxDump = maxD;
		this.setBiomes(biomes);
	}
	public List<Biome> getBiomes() {
		return b;
	}
	public void setBiomes(List<Biome> b) {
		this.b = b;
	}
	 public static List<Biome> allBiomes(){
	    	List<Biome> x = new ArrayList<Biome>();
	    	for(Biome b:Biome.values()){
	    		x.add(b);
	    	}
	    	return x;	
	    }
	public BaseCrystal(MoarStuph p, String name, int id) {
		super(p, name, false);
                this.setBlockDesign(new CrystalDesign(id, p));
	}
	public void setMinY(int i) {
		this.miny = i;
	}

	public void setMaxY(int i) {
		this.maxy = i;
	}

	public int getMinY() {
		return this.miny;
	}

	public int getMaxY() {
		return this.maxy;
	}

	public void setFrequency(int i) {
		this.frequency = i;
	}

	public int getFrequency() {
		return this.frequency;
	}
	public void setMaxDump(int i) {
		this.maxDump = i;
	}

	public int getMaxDump() {
		return this.maxDump;
	}

    @Override
    public void onNeighborBlockChange(World world, int i, int i1, int i2, int i3) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onBlockPlace(World world, int i, int i1, int i2) {
      //  throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onBlockPlace(World world, int i, int i1, int i2, LivingEntity le) {
     //   throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onBlockDestroyed(World world, int i, int i1, int i2) {
     //   throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean onBlockInteract(World world, int i, int i1, int i2, SpoutPlayer sp) {
     //   throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public void onEntityMoveAt(World world, int i, int i1, int i2, Entity entity) {
      //  throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onBlockClicked(World world, int i, int i1, int i2, SpoutPlayer sp) {
     //   throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isProvidingPowerTo(World world, int i, int i1, int i2, BlockFace bf) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public boolean isIndirectlyProvidingPowerTo(World world, int i, int i1, int i2, BlockFace bf) {
     //   throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }
}
