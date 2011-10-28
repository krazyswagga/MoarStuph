package me.samkio.mo.blocks.misc.anvil;

import me.samkio.mo.GenericCustomItemWidget;
import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.gui.GenericContainer;
import org.getspout.spoutapi.gui.GenericItemWidget;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;

public class AnvilGUI2 extends GenericPopup{
	 public static GenericContainer menuContainer = new GenericContainer();
	   public static GenericLabel titleLabel = new GenericLabel();
	   public static GenericCustomItemWidget itemWidget;
	    
	@SuppressWarnings("deprecation")
	AnvilGUI2(){
		 titleLabel.setX(5);
	        titleLabel.setY(5);
	        titleLabel.setText("Citizens Command GUI");
	       itemWidget = new GenericCustomItemWidget(SpoutManager.getItemManager().getCustomItemStack(new AnvilBlock(MoarStuph.instance), 3));
	        itemWidget.setTooltip("Anvil");
	        itemWidget.setHeight(10);
	        itemWidget.setWidth(10);
	        itemWidget.setX(10);
	        itemWidget.setY(10);
	       
	       menuContainer.addChildren(titleLabel,itemWidget);
		menuContainer.setDirty(true);	
		this.attachWidget(MoarStuph.instance, menuContainer);
	}

}
