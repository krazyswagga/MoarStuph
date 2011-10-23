package me.samkio.mo;

import java.util.ArrayList;


import org.bukkit.inventory.FurnaceRecipe;

public class FurnaceChef {
	MoarStuph plugin;
	public ArrayList<FurnaceRecipe> furnaceRecipeObjects = new ArrayList<FurnaceRecipe>();
public FurnaceChef(MoarStuph p){
	this.plugin = p;
	this.populateFurnaceRecipes();
}
	private void populateFurnaceRecipes() {
		//My Fruitless attempts at FurnaceRecipes
					/*plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new SilverIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new SilverOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new CopperIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new CopperOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new TinIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new TinOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new LeadIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new LeadOre(plugin), 1).getTypeId())));
					
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new TitaniumIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new TitaniumOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new ZincIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new ZincOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new UraniumIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new UraniumOre(plugin), 1).getTypeId())));
					
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new FireIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new FireOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new IceIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new IceOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new CobaltIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new CobaltOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new PyriteOre(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new PyriteOre(plugin), 1).getTypeId())));
					
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new AdamantiumIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new AdamantiumOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new DragoniteIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new DragoniteOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new DarkIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new DarkOre(plugin), 1).getTypeId())));
					plugin.getServer().addRecipe(new FurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new MithrilIngot(plugin), 1),new MaterialData(SpoutManager.getMaterialManager().getCustomItemStack(new MithrilOre(plugin), 1).getTypeId())));
					*/
	//	SimpleSpoutFurnaceRecipe p = new SimpleSpoutFurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new SilverIngot(plugin), 1));
	//	p.setIngredient(SpoutManager.getMaterialManager().getCustomItemStack(new SilverOre(plugin), 1).getTypeId());
	//	plugin.log.info(SpoutManager.getMaterialManager().getCustomItemStack(new SilverOre(plugin), 1).getType().getId()+"/"+SpoutManager.getMaterialManager().getCustomItemStack(new CopperOre(plugin), 1).getType().getId());
	//	SimpleSpoutFurnaceRecipe p1 = new SimpleSpoutFurnaceRecipe(SpoutManager.getMaterialManager().getCustomItemStack(new CopperIngot(plugin), 1));
	//	p1.setIngredient(SpoutManager.getMaterialManager().getCustomItemStack(new CopperOre(plugin), 1).getType().getId());
	//	p.addToCraftingManager();
	//	p1.addToCraftingManager();
	}

}
