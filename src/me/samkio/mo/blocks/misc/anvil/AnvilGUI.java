package me.samkio.mo.blocks.misc.anvil;

import net.minecraft.server.ContainerFurnace;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.ICrafting;
import net.minecraft.server.TileEntityFurnace;

public class AnvilGUI extends ContainerFurnace {

	public AnvilGUI(EntityPlayer entityPlayer, int windowNumber,
			TileEntityFurnace tileentityfurnace) {
		super(entityPlayer.inventory, tileentityfurnace);
		super.windowId = windowNumber;
		super.a((ICrafting) entityPlayer);
	}

	@Override
	public boolean b(EntityHuman entityhuman) {
		return true;
	}
}