package me.samkio.mo.blocks.misc.anvil;

import org.getspout.spoutapi.gui.GenericButton;
import org.getspout.spoutapi.gui.GenericItemWidget;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.gui.RenderPriority;

public class IngredientSlot {
	private int itemInSlot;
	GenericButton btn;
	GenericItemWidget itemWidget;
	
	public IngredientSlot(GenericPopup popup, int x, int y, int item) {
		btn = new GenericButton();
		btn.setWidth(20);
		btn.setHeight(20);
		btn.setEnabled(false);
		btn.setX(x).setY(y);
		if (item != 0) {
		itemWidget = new GenericItemWidget();
		itemWidget.setTypeId(item).setX(x+2).setY(y+2);
		itemWidget.setHeight(5);
		itemWidget.setWidth(5).setPriority(RenderPriority.Lowest);
		}
		this.itemInSlot = item;
	}
	
	public void setItemInSlot(int id) {
		this.itemInSlot = id;
		this.itemWidget.setTypeId(id).setDirty(true);
	}
}