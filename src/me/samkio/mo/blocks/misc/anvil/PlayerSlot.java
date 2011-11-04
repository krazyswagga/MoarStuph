package me.samkio.mo.blocks.misc.anvil;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.gui.GenericButton;
import org.getspout.spoutapi.gui.GenericContainer;
import org.getspout.spoutapi.gui.GenericItemWidget;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.RenderPriority;

public class PlayerSlot {
	private int itemInSlot;
	
	public PlayerSlot(int width, int height, ItemStack itemstack, GenericContainer menuContainer) {
		GenericButton btn = new GenericButton();
		btn.setWidth(20);
		btn.setHeight(20);
		btn.setEnabled(false);
		btn.setX(width).setY(height);
		if (itemstack != null) {
		GenericItemWidget itemWidget = new GenericItemWidget();
		itemWidget.setTypeId(itemstack.getTypeId()).setX(width+2).setY(height+2);
		if (itemstack.getTypeId() == 318) {
			boolean isCustom = SpoutManager.getMaterialManager().isCustomItem(itemstack);
			if (isCustom) {
				//Make Fake ItemWidget logo?
				System.out.println("CUSTOM ITEM FOUND AT " + width + " : " + height);
			}
		}
		itemWidget.setHeight(5);
		itemWidget.setWidth(5).setPriority(RenderPriority.Low);
		this.itemInSlot = itemstack.getTypeId();
		if (itemstack.getAmount() > 1) {
			GenericLabel label = new GenericLabel();
			label.setText("" + itemstack.getAmount()).setX(width+10).setY(height+10);
			label.setPriority(RenderPriority.Lowest);
			menuContainer.insertChild(PlayerSlots.slots, label);
		}
		menuContainer.insertChild(PlayerSlots.slots, itemWidget);
		}
		menuContainer.insertChild(PlayerSlots.slots, btn);
	}
}