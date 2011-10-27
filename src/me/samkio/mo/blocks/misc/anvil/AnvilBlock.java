package me.samkio.mo.blocks.misc.anvil;

import me.samkio.mo.MoarStuph;
import net.minecraft.server.EntityPlayer;import net.minecraft.server.Packet100OpenWindow;
import net.minecraft.server.TileEntityFurnace;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.gui.ScreenType;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class AnvilBlock extends GenericCubeCustomBlock {
	private static int[] id = { 3, 1, 0, 2, 0, 0 };
	@SuppressWarnings("unused")
	private MoarStuph p;

	public AnvilBlock(MoarStuph plugin) {
		super(plugin, "Anvil", false, new GenericCubeBlockDesign(plugin,
				plugin.MiscTextureFile, id), 1000);
		this.setBlockDesign(new AnvilDesign(plugin));
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

		arg4.openScreen(ScreenType.CHEST_INVENTORY, true);
		TileEntityFurnace titleentityfurnace = new TileEntityFurnace();
		EntityPlayer ep = ((CraftPlayer) arg4.getPlayer()).getHandle();
		ep.netServerHandler.sendPacket(new Packet100OpenWindow(1, 2,"Anvil", titleentityfurnace.getSize()));
		ep.activeContainer = new AnvilGUI(ep, 1, titleentityfurnace);
		// ep.netServerHandler.sendPacket(new
		// Packet100OpenWindow(1,2,"Anvil",9));
		// ep.activeContainer= new AnvilGUI(ep,1);

		// ep.a( new TileEntityFurnace());
		// TileEntity tileentity = this.a_();
		// ep.a(tileentity);
		arg4.setTexturePack("http://dl.dropbox.com/u/19653570/Moar/Anvil.zip");
		this.p.getServer().getScheduler().scheduleSyncRepeatingTask(this.p, new AnvilEmulator(arg4), 10, 10);
		// arg4.resetTexturePack();

		return true;
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

	}

	@Override
	public boolean isIndirectlyProvidingPowerTo(World arg0, int arg1, int arg2,
			int arg3, BlockFace arg4) {
		// TODO Auto-generated method stub
		return false;
	}

}
