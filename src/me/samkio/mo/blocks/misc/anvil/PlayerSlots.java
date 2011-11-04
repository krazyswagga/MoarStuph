package me.samkio.mo.blocks.misc.anvil;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.gui.GenericButton;
import org.getspout.spoutapi.gui.GenericContainer;
import org.getspout.spoutapi.gui.GenericPopup;

public class PlayerSlots {
	public static int slots = 1;
	private int height = 160;
	private int width = 80;
	public GenericContainer container;
	private GenericPopup screen;
	public static GenericButton items;
	
	public PlayerSlots(GenericPopup screen, Inventory inv, GenericContainer menuContainer) {
		screen = this.screen;
	    for(ItemStack itemstack : inv.getContents()) {
	    	new PlayerSlot(width, height, itemstack, menuContainer);
	    	if (width <= 220) {
	    	width += 20;
	    	} else {
	    		height -= 20;
	    		width = 80;
	    	}
			slots++;
        }
	}
}