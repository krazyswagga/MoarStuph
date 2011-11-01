package me.samkio.mo;

import java.util.HashSet;
import java.util.Set;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

import me.samkio.mo.blocks.bushes.BaseBush;
import me.samkio.mo.blocks.bushes.EmptyBush;
import me.samkio.mo.blocks.crops.BaseCrop;
import me.samkio.mo.blocks.crops.PotatoCrop;
import me.samkio.mo.blocks.cyrstals.*;
import me.samkio.mo.blocks.logs.AshLog;
import me.samkio.mo.blocks.logs.BaseLog;
import me.samkio.mo.blocks.logs.BeechLog;
import me.samkio.mo.blocks.logs.ElmLog;
import me.samkio.mo.blocks.logs.MapleLog;
import me.samkio.mo.blocks.logs.OakLog;
import me.samkio.mo.blocks.logs.PalmLog;
import me.samkio.mo.blocks.logs.RottenLog;
import me.samkio.mo.blocks.logs.WillowLog;
import me.samkio.mo.blocks.misc.anvil.AnvilBlock;
import me.samkio.mo.blocks.misc.microwave.MicrowaveBlock;
import me.samkio.mo.blocks.misc.nuclear.NuclearBomb;
import me.samkio.mo.blocks.ores.*;
import me.samkio.mo.items.food.BaseFood;
import me.samkio.mo.items.food.fruits.BananaFruit;
import me.samkio.mo.items.food.fruits.CoconutFruit;
import me.samkio.mo.items.food.fruits.OrangeFruit;
import me.samkio.mo.items.food.fruits.PearFruit;

/**
 *
 * @author Samkio
 */
public class ItemMaps {
	public static Set<BaseOre> ores = new HashSet<BaseOre>();
	public static Set<BaseCrystal> crystals = new HashSet<BaseCrystal>();
	public static Set<BaseFood> food = new HashSet<BaseFood>();
	public static Set<BaseLog> log = new HashSet<BaseLog>();
	public static Set<BaseCrop> crops = new HashSet<BaseCrop>();
	public static Set<BaseBush> bushes = new HashSet<BaseBush>();
	public static Set<GenericCubeCustomBlock> misc = new HashSet<GenericCubeCustomBlock>();
	public static EmptyBush b;

    public static void loadBlocks(MoarStuph p) {
		//Standard Real World Ores
		SilverOre s = new SilverOre(p); //SilverOre
		CopperOre s1 = new CopperOre(p); //CopperOre
		TinOre s2 = new TinOre(p); //Cassiterite
		LeadOre s3 = new LeadOre(p); //Galena
		TitaniumOre s4 = new TitaniumOre(p); //Sphene
		RuniteOre s5 = new RuniteOre(p); //Zincite
		ChromiumOre s6 = new ChromiumOre(p); //Chromite
		UraniumOre s7 = new UraniumOre(p); //Autunite
		
		//Fantasy Ores
		DragoniteOre s8 = new DragoniteOre(p);
		FireOre s9 = new FireOre(p);
		IceOre s10 = new IceOre(p);
		CobaltOre s11 = new CobaltOre(p);
		PyriteOre s12 = new PyriteOre(p);
		AdamantiumOre s13 = new AdamantiumOre(p);
		DarkOre s14 = new DarkOre(p);
		MithrilOre s15 = new MithrilOre(p);
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
		EmeraldCrystal c = new EmeraldCrystal(p);
		JadeCrystal c1 = new JadeCrystal(p);
		RubyCrystal c2 = new RubyCrystal(p);
		SapphireCrystal c3 = new SapphireCrystal(p);
		AmethystCrystal c4 = new AmethystCrystal(p);
		TopazCrystal c5 = new TopazCrystal(p);
		AmberCrystal c6 = new AmberCrystal(p); 
		crystals.add(c);
		crystals.add(c1);
		crystals.add(c2);
		crystals.add(c3);
		crystals.add(c4);
		crystals.add(c5);
		crystals.add(c6);
		
		PearFruit f = new PearFruit(p);
		CoconutFruit f1 = new CoconutFruit(p);
		BananaFruit f2 = new BananaFruit(p);
		OrangeFruit f3 = new OrangeFruit(p);
		food.add(f);
		food.add(f1);
		food.add(f2);
		food.add(f3);
		
		MicrowaveBlock m = new MicrowaveBlock(p);  //If all blocks aren't created on, onEnable..
		NuclearBomb m1 = new NuclearBomb(p);       //A reload would cause the blocks that are left out to..
		AnvilBlock m2 = new AnvilBlock(p);         //become flint or an odd block if placed. Until they are created
		misc.add(m);                               //In the code. This may be the case with items, not tested yet however.
		misc.add(m1);
		misc.add(m2);
		
		PotatoCrop cr = new PotatoCrop(p);
		crops.add(cr);
	
		//Microwave has custom DING
		
		//Trees Real
		WillowLog t = new WillowLog(p);
	    OakLog t1 = new OakLog(p);
		ElmLog t2 = new ElmLog(p);
		BeechLog t3 = new BeechLog(p);
		AshLog t4 = new AshLog(p);
		MapleLog  t5 = new MapleLog(p);
		RottenLog t6 = new RottenLog(p);
		PalmLog t7 = new PalmLog(p);
		log.add(t);
		log.add(t1);
		log.add(t2);
		log.add(t3);
		log.add(t4);
		log.add(t5);
		log.add(t6);
		log.add(t7);
		
		//Bushes
		b = new EmptyBush(p);
		bushes.add(b);
	}
}
