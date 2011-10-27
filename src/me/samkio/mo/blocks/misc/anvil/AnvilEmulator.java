package me.samkio.mo.blocks.misc.anvil;

import net.minecraft.server.ContainerFurnace;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.InventoryPlayer;
import net.minecraft.server.TileEntityFurnace;

import java.lang.reflect.Field;

import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.inventory.ItemStack;

import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

public class AnvilEmulator implements Runnable{
	private SpoutPlayer p;
	private EntityHuman h;
	private InventoryPlayer inventory;
    public AnvilEmulator(SpoutPlayer p){
    	this.p = p;
    	this.h = ((CraftPlayer) p.getPlayer()).getHandle();
    	this.inventory = this.h.inventory;
    }
	@SuppressWarnings("deprecation")
	@Override
	public void run() {

		ContainerFurnace furnace = null;
		try {
			furnace = (ContainerFurnace) h.activeContainer;
		} catch (Exception ex) {
			//kill();
			return;
		}
		Field privateTileEntity;
		try {
			privateTileEntity = ContainerFurnace.class.getDeclaredField("a");
		} catch (Exception ex) {

			return;
		}
		privateTileEntity.setAccessible(true);
		TileEntityFurnace tileEntity;

		try {
			tileEntity = (TileEntityFurnace) privateTileEntity.get(furnace);
		} catch (Exception ex) {
			return;}
	
				
		net.minecraft.server.ItemStack[] Anvil = tileEntity.getContents();
		if(Anvil[0]!=null){
		ItemStack x = new ItemStack(Anvil[0].id,Anvil[0].count,(short) Anvil[0].getData());
		p.sendMessage(SpoutManager.getItemManager().isCustomItem(x)+"");
		if(SpoutManager.getItemManager().getCustomItem(x).getName().equals("Anvil")){
			
		}
		}
		
        
		
	}
	
}
