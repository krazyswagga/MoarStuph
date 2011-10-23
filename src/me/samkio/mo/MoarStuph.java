package me.samkio.mo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import me.samkio.mo.blocks.cyrstals.*;
import me.samkio.mo.blocks.logs.*;
import me.samkio.mo.blocks.misc.microwave.MicrowaveItem;
import me.samkio.mo.blocks.misc.microwave.MicrowaveItemWatcher;
import me.samkio.mo.blocks.ores.*;
import me.samkio.mo.items.ingots.*;
import me.samkio.mo.populators.CrystalPopulator;
import me.samkio.mo.populators.OrePopulator;
import me.samkio.mo.populators.TreePopulator;
import me.samkio.mo.util.BO2ObjectManager;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.bukkit.inventory.ItemStack;
@SuppressWarnings("unused")
public class MoarStuph extends JavaPlugin {
//http://www.minecraftforum.net/topic/423079-escape-haunted-house-escape-210-dls-first-official-mcdh-clan-map/page__p__5875439#entry5875439
	//http://www.minecraftforum.net/topic/697245-181-halloween-day-7/
	
	public Logger log = Logger.getLogger("Minecraft");
	public Texture OreTextureFile,TreeTextureFile,MiscTextureFile;
	public Set<MoarCubeCustomBlockSimple> ores = new HashSet<MoarCubeCustomBlockSimple>();
	public Set<MoarGenericCustomBlock> crystals = new HashSet<MoarGenericCustomBlock>();
	private MoarPlayerListener pL = new MoarPlayerListener(this);
	private MoarBlockListener bL = new MoarBlockListener(this);
	public List<MicrowaveItem> microwavedFood = new ArrayList<MicrowaveItem>();
	private MicrowaveItemWatcher watcher = new MicrowaveItemWatcher();
	public static MoarStuph instance;
	@Override
	public void onDisable() 
	{
		for(World current : this.getServer().getWorlds())
		{
			if(current.getEnvironment()==Environment.NORMAL)
			{
				current.getPopulators().remove(new OrePopulator(this));
				current.getPopulators().remove(new CrystalPopulator(this));
				current.getPopulators().remove(new TreePopulator(this));
				log.info("Removed Populators from World: "+current.getName()+".");
			}
				
		}
		log.info("Moar Ores has been disabled!");
		
	}
	@Override
	public void onEnable() 
	{   
		instance = this;
		try {
			BO2ObjectManager.ReadBO2Files(this.getDataFolder() + "/Trees/");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		log.info("Moar Ores is ready to rock and roll!");
		log.info("PellTato - Let's MASH some ideas together!");
		OreTextureFile = new Texture(this,"http://dl.dropbox.com/u/19653570/ores.png",256,256,16);
		TreeTextureFile = new Texture(this,"http://dl.dropbox.com/u/19653570/Trees.png",256,256,16);
		MiscTextureFile = new Texture(this,"http://dl.dropbox.com/u/19653570/Misc.png",256,256,16);
		this.loadBlocks();
		getCommand("dbg").setExecutor(new DebugMan(this));
		for(World current : this.getServer().getWorlds())
		{
			if(current.getEnvironment()==Environment.NORMAL)
			{
				current.getPopulators().add(new OrePopulator(this));
				current.getPopulators().add(new CrystalPopulator(this));
				current.getPopulators().add(new TreePopulator(this));
				log.info("Added Populators to World: "+current.getName()+".");
			}
				
		}
		this.getServer().getScheduler().scheduleSyncRepeatingTask(this, watcher, 0, 20);
		this.getServer().getPluginManager().registerEvent(Event.Type.BLOCK_BREAK, bL, Event.Priority.Highest, this);
		//new FurnaceChef(this);
	}

	public void loadBlocks(){
		//Standard Real World Ores
		SilverOre s = new SilverOre(this); //SilverOre
		CopperOre s1 = new CopperOre(this); //CopperOre
		TinOre s2 = new TinOre(this); //Cassiterite
		LeadOre s3 = new LeadOre(this); //Galena
		TitaniumOre s4 = new TitaniumOre(this); //Sphene
		ZincOre s5 = new ZincOre(this); //Zincite
		ChromiumOre s6 = new ChromiumOre(this); //Chromite
		UraniumOre s7 = new UraniumOre(this); //Autunite
		
		//Fantasy Ores
		DragoniteOre s8 = new DragoniteOre(this);
		FireOre s9 = new FireOre(this);
		IceOre s10 = new IceOre(this);
		CobaltOre s11 = new CobaltOre(this);
		PyriteOre s12 = new PyriteOre(this);
		AdamantiumOre s13 = new AdamantiumOre(this);
		DarkOre s14 = new DarkOre(this);
		MithrilOre s15 = new MithrilOre(this);
		ores.add(s);
		ores.add(s1);
		ores.add(s2);
		ores.add(s3);
		ores.add(s4);
		ores.add(s5);
		ores.add(s6);
		ores.add(s7);
		ores.add(s8);
		ores.add(s9);
		ores.add(s10);
		ores.add(s11);
		ores.add(s12);
		ores.add(s13);
		ores.add(s14);
		ores.add(s15); 
		
		//Cyrstals Real
		EmeraldCrystal c = new EmeraldCrystal(this);
		JadeCrystal c1 = new JadeCrystal(this);
		RubyCrystal c2 = new RubyCrystal(this);
		SapphireCrystal c3 = new SapphireCrystal(this);
		AmethystCrystal c4 = new AmethystCrystal(this);
		TopazCrystal c5 = new TopazCrystal(this);
		AmberCrystal c6 = new AmberCrystal(this); 
		crystals.add(c);
		crystals.add(c1);
		crystals.add(c2);
		crystals.add(c3);
		crystals.add(c4);
		crystals.add(c5);
		crystals.add(c6); 
	
		//Microwave has custom DING
		
		//Trees Real
		/*WillowLog t = new WillowLog(this);
	    OakLog t1 = new OakLog(this);
		ElmLog t2 = new ElmLog(this);
		BeechLog t3 = new BeechLog(this);
		AshLog t4 = new AshLog(this);
		MapleLog  t5 = new MapleLog(this);
		RottenLog t6 = new RottenLog(this);
		PalmLog t7 = new PalmLog(this); */
		
				

		
	}
	


}
