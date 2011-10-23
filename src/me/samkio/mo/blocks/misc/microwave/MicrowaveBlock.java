package me.samkio.mo.blocks.misc.microwave;

import me.samkio.mo.MoarStuph;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class MicrowaveBlock extends GenericCubeCustomBlock{
	private static int[] id = {3,1,0,2,0,0};
	private MoarStuph p;
	public MicrowaveBlock(MoarStuph plugin) {
		super(plugin, "Microwave",  false,new GenericCubeBlockDesign(plugin, plugin.MiscTextureFile,id),1000);
		this.setBlockDesign(new MicrowaveDesign(plugin));
		this.p = plugin;
	}

	public boolean canPlaceBlockAt(World arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canPlaceBlockAt(World arg0, int arg1, int arg2, int arg3,
			BlockFace arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isIndirectlyProdivingPowerTo(World arg0, int arg1, int arg2,
			int arg3, BlockFace arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProvidingPowerTo(World arg0, int arg1, int arg2, int arg3,
			BlockFace arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onBlockClicked(World arg0, int arg1, int arg2, int arg3,
			SpoutPlayer arg4) {
		
		
	}

	@Override
	public void onBlockDestroyed(World arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onBlockInteract(World arg0, int arg1, int arg2, int arg3,
			SpoutPlayer arg4) {
		arg4.sendMessage("XD");
		/*Location loc = new Location(arg0,arg1+0.5,arg2+0.2,arg3+0.5);
		Item i = loc.getWorld().dropItem(loc, new ItemStack(Material.RAW_BEEF).clone());
		i.setVelocity(new Vector(0, 0.1, 0)); */
		Location loc = new Location(arg0,arg1,arg2,arg3);
		ItemStack stack = new ItemStack(Material.RAW_BEEF);
		Item item = loc.getWorld().dropItem(loc, stack);
		MicrowaveItem i = new MicrowaveItem(item,loc);
		p.microwavedFood.add(i);
		return false;
	}

	@Override
	public void onBlockPlace(World arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockPlace(World arg0, int arg1, int arg2, int arg3,
			LivingEntity arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEntityMoveAt(World arg0, int arg1, int arg2, int arg3,
			Entity arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNeighborBlockChange(World arg0, int arg1, int arg2, int arg3,
			int arg4) {
		for (MicrowaveItem item : MoarStuph.instance.microwavedFood) {
			if (item.getItem().isDead()) {
				item.respawn();
			}
			item.updatedPosition = false;
			item.updatePosition();
		}
		
	}

	@Override
	public boolean isIndirectlyProvidingPowerTo(World arg0, int arg1, int arg2,
			int arg3, BlockFace arg4) {
		// TODO Auto-generated method stub
		return false;
	}

}
