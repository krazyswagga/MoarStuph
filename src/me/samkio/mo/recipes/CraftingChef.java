package me.samkio.mo.recipes;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

import me.samkio.mo.MoarStuph;
import me.samkio.mo.blocks.misc.nuclear.NuclearBomb;
import me.samkio.mo.blocks.ores.TitaniumOre;
import me.samkio.mo.blocks.ores.UraniumOre;
import me.samkio.mo.items.coins.BronzeCoin;
import me.samkio.mo.items.coins.GoldCoin;
import me.samkio.mo.items.coins.SilverCoin;
import me.samkio.mo.items.ingots.BronzeIngot;
import me.samkio.mo.items.ingots.SilverIngot;
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
		SpoutShapedRecipe x1 = new SpoutShapedRecipe(spec1);
		x1.shape("ABA", "BAB", "ABA");
		x1.setIngredient('B', new TitaniumIngot(plugin));
		x1.setIngredient('A', new UraniumIngot(plugin));
		SpoutManager.getMaterialManager().registerSpoutRecipe(x1);
		
		ItemStack spec2 = SpoutManager.getMaterialManager().getCustomItemStack(new TitaniumIngot(plugin), 1);
		SpoutShapelessRecipe x2 = new SpoutShapelessRecipe(spec2);
		x2.addIngredient(1, new TitaniumOre(plugin));
		x2.addIngredient(4, MaterialData.coal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(x2);
		this.CoinRecipes();
		
		
		
	}
	
	
	private void CoinRecipes(){
		ItemStack GoldCoin = SpoutManager.getMaterialManager().getCustomItemStack(new GoldCoin(plugin), 5);
		SpoutShapelessRecipe x = new SpoutShapelessRecipe(GoldCoin);
		x.addIngredient(1, MaterialData.goldIngot);
		SpoutManager.getMaterialManager().registerSpoutRecipe(x);
		
		ItemStack SilverCoin = SpoutManager.getMaterialManager().getCustomItemStack(new SilverCoin(plugin), 5);
		SpoutShapelessRecipe x1 = new SpoutShapelessRecipe(SilverCoin);
		x1.addIngredient(1, new SilverIngot(plugin));
		SpoutManager.getMaterialManager().registerSpoutRecipe(x1);
		
		ItemStack BronzeCoin = SpoutManager.getMaterialManager().getCustomItemStack(new BronzeCoin(plugin), 5);
		SpoutShapelessRecipe x2 = new SpoutShapelessRecipe(BronzeCoin);
		x2.addIngredient(1, new BronzeIngot(plugin));
		SpoutManager.getMaterialManager().registerSpoutRecipe(x2);
	}

}