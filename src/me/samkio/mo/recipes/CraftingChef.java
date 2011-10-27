package me.samkio.mo.recipes;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.blocks.misc.nuclear.NuclearBomb;
import me.samkio.mo.blocks.ores.TitaniumOre;
import me.samkio.mo.blocks.ores.UraniumOre;
import me.samkio.mo.items.ingots.TitaniumIngot;
import me.samkio.mo.items.ingots.UraniumIngot;

public class CraftingChef {
	MoarStuph plugin;

	public CraftingChef(MoarStuph p) {
		this.plugin = p;
		this.populateCraftingRecipes();
		}
	
	private void populateCraftingRecipes() {
		ItemStack spec = SpoutManager.getMaterialManager().getCustomItemStack(new UraniumIngot(plugin), 1);
		SpoutShapelessRecipe x = new SpoutShapelessRecipe(spec);
		x.addIngredient(8, MaterialData.coal);
		x.addIngredient(1, new UraniumOre(plugin));
		SpoutManager.getMaterialManager().registerSpoutRecipe(x);
		
		ItemStack spec1 = SpoutManager.getMaterialManager().getCustomItemStack(new NuclearBomb(plugin), 1);
		SpoutShapelessRecipe x1 = new SpoutShapelessRecipe(spec1);
		x1.addIngredient(5, new TitaniumIngot(plugin));
		x1.addIngredient(4, new UraniumIngot(plugin));
		SpoutManager.getMaterialManager().registerSpoutRecipe(x1);
		
		ItemStack spec2 = SpoutManager.getMaterialManager().getCustomItemStack(new TitaniumIngot(plugin), 1);
		SpoutShapelessRecipe x2 = new SpoutShapelessRecipe(spec2);
		x2.addIngredient(1, new TitaniumOre(plugin));
		x2.addIngredient(4, MaterialData.coal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(x2);
	}

}