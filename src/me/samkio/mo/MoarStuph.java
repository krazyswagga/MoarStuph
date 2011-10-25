package me.samkio.mo;




import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.samkio.mo.blocks.misc.microwave.MicrowaveItem;
import me.samkio.mo.blocks.misc.microwave.MicrowaveItemWatcher;
import me.samkio.mo.populators.CrystalPopulator;
import me.samkio.mo.populators.OrePopulator;
import me.samkio.mo.populators.TreePopulator;
import me.samkio.mo.util.BO2ObjectManager;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;

@SuppressWarnings("unused")
public class MoarStuph extends JavaPlugin {
//http://www.minecraftforum.net/topic/423079-escape-haunted-house-escape-210-dls-first-official-mcdh-clan-map/page__p__5875439#entry5875439
	//http://www.minecraftforum.net/topic/697245-181-halloween-day-7/
	
	public static final Logger log = Logger.getLogger("Minecraft");
	public Texture OreTextureFile, TreeTextureFile, FoodTextureFile, FarmingTextureFile, MiscTextureFile;
	//private MoarPlayerListener pL = new MoarPlayerListener(this);
	//private MoarBlockListener bL = new MoarBlockListener(this);
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
				log.log(Level.INFO, "Removed Populators from World: {0}.", current.getName());
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
		} 
                this.setupTextures();
                this.populateWorlds();
                                ItemMaps.loadBlocks(this);
		getCommand("dbg").setExecutor(new DebugMan(this));
		//this.getServer().getScheduler().scheduleSyncRepeatingTask(this, watcher, 0, 20);
		//this.getServer().getPluginManager().registerEvent(Event.Type.BLOCK_BREAK, bL, Event.Priority.Highest, this);
		//new FurnaceChef(this); 
		// TODO Crafting Version for custom recipes. 
		log.log(Level.INFO, "{0} v.{1}. By:{2} is enabled!", new Object[]{this.getDescription().getFullName(), this.getDescription().getVersion(), this.getDescription().getAuthors()});
	}
        
        public void populateWorlds(){
            for(World current : this.getServer().getWorlds()) {
			if(current.getEnvironment() == Environment.NORMAL) {
				current.getPopulators().add(new OrePopulator(this));
				current.getPopulators().add(new CrystalPopulator(this));
				current.getPopulators().add(new TreePopulator(this));
				log.log(Level.INFO, "Added Populators to World:{0}", current.getName());
			}	
		}
        }
        public void setupTextures(){
            //TODO place in resources folder.
            getClass().getResourceAsStream("resources/ores.png");
              URL url = getClass().getClassLoader().getResource("resources/ores.png");
                OreTextureFile = new Texture(this, url.toExternalForm(), 256, 256, 16); //Ores should be capitalised! ;(
		TreeTextureFile = new Texture(this, "http://dl.dropbox.com/u/19653570/Trees.png", 256, 256, 16);
		FoodTextureFile = new Texture(this, "http://cloud.github.com/downloads/mbsuperstar1/MoarStuph/Food.png", 256, 256, 16); // TODO Find an artist...
		FarmingTextureFile = new Texture(this, "", 256, 256, 16); 
		MiscTextureFile = new Texture(this, "http://dl.dropbox.com/u/19653570/Misc.png", 256, 256, 16);
		SpoutManager.getFileManager().addToCache(this, url.toExternalForm());
                SpoutManager.getFileManager().addToCache(this, "http://dl.dropbox.com/u/19653570/Trees.png");
                SpoutManager.getFileManager().addToCache(this, "http://cloud.github.com/downloads/mbsuperstar1/MoarStuph/Food.png");
                SpoutManager.getFileManager().addToCache(this, "http://dl.dropbox.com/u/19653570/Misc.png");
         
        }
        
}