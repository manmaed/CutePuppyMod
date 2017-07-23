package manmaed.cutepuppymod;

import manmaed.cutepuppymod.achievements.Achievements;
import manmaed.cutepuppymod.block.CPMBlocks;
import manmaed.cutepuppymod.config.ConfigManager;
import manmaed.cutepuppymod.creativetab.CPMCreativeTab;
import manmaed.cutepuppymod.entity.CPMEntitys;
import manmaed.cutepuppymod.items.CPMItems;
import manmaed.cutepuppymod.libs.Reference;
import manmaed.cutepuppymod.libs.iChun;
import manmaed.cutepuppymod.libs.util.RecipeHandler;
import manmaed.cutepuppymod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class CutePuppyMod {

  @Mod.Instance(Reference.MOD_ID)
  public static CutePuppyMod instance;

  public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.PROXY_COMMON)
	public static CommonProxy proxy;
	public static CreativeTabs tabsCMP = new CPMCreativeTab(CreativeTabs.getNextID());


	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

        ConfigManager.loadConfig(new Configuration(event.getSuggestedConfigurationFile()));
        proxy.preInit();

        CPMBlocks.load();
        CPMItems.RegisterItem();
        if(event.getSide().isClient())
        {
            CPMItems.RenderItem();
        }
        RecipeHandler.addRecipes();
        CPMEntitys.Load();
        proxy.renderInformation();
        Achievements.Load();

    }
	@Mod.EventHandler
	public void load(FMLInitializationEvent event)
	{
	    //Stuff
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	    iChun.RuniChunMagic();
	}
}

