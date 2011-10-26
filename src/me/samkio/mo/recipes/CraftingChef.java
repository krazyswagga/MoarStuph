package me.samkio.mo.recipes;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.blocks.ores.UraniumOre;
import me.samkio.mo.items.ingots.UraniumIngot;

public class CraftingChef {
	MoarStuph plugin;

	public CraftingChef(MoarStuph p) {
		this.plugin = p;
		this.populateCraftingRecipes();
		}
	
	private void populateCraftingRecipes() {
		//CUSTOM SHAPELESS RECIPE TEMPLATE
		//TEMPORARY FIX FOR LACK OF FURNACE RECIPES (I want to see them in-game :))
		ItemStack spec = SpoutManager.getMaterialManager().getCustomItemStack(new UraniumIngot(plugin), 1);
		SpoutShapelessRecipe x = new SpoutShapelessRecipe(spec);
		x.addIngredient(8, MaterialData.coal);
		x.addIngredient(1, new UraniumOre(plugin));
		SpoutManager.getMaterialManager().registerSpoutRecipe(x);
	}

}