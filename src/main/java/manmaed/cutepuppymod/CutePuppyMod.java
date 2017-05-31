package manmaed.cutepuppymod;

import manmaed.cutepuppymod.achievements.Achievements;
import manmaed.cutepuppymod.block.CPMBlocks;
import manmaed.cutepuppymod.creativetab.CPMCreativeTab;
import manmaed.cutepuppymod.entity.CPMEntitys;
import manmaed.cutepuppymod.items.CPMItems;
import manmaed.cutepuppymod.libs.LogHelper;
import manmaed.cutepuppymod.libs.Reference;
import manmaed.cutepuppymod.libs.util.EventHandler;
import manmaed.cutepuppymod.libs.util.RecipeHandler;
import manmaed.cutepuppymod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
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

	//private GuiHandlerPLC guiHandlerPLC = new GuiHandlerPLC();

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.PROXY_COMMON)
	public static CommonProxy proxy;
/*    public static boolean puppy = true;
    public static SimpleConfig config;*/
	public static CreativeTabs tabsCMP = new CPMCreativeTab(CreativeTabs.getNextID());
    private static boolean devenv = false;
    private static boolean beta = false;
    private static boolean release = true;

    //Config
    public static Configuration configFile;
    public static boolean disablesixpuppy = false;

    public static void syncConfig() {
        //disablesixpuppy = configFile.getBoolean("My Config Integer", Configuration.CATEGORY_GENERAL, myConfigInteger, 0, Integer.MAX_VALUE, "An Integer!");
        //myConfigString = configFile.getString("My Config String", Configuration.CATEGORY_GENERAL, myConfigString, "A String!");
        disablesixpuppy = configFile.getBoolean("Disable Sixkiller Puppy?", Configuration.CATEGORY_GENERAL, disablesixpuppy, "Setting to ture will disable spawns of Sixkiller Puppys");

        if(configFile.hasChanged())
            configFile.save();
    }

	//public static CraftingHandler CraftingHandler = new teamhamster.hamsterwheel.libs.util.CraftingHandler();
	//                                     new Achievement([ID], [NAME], [X COORD], [Y COORD], [ICON (BLOCK/ITEM ITSELF)], [ACHIEVEMENT REQUIRED]

	//EventManager eventmanager = new EventManager();


    /*@SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
        if(eventArgs.getModID().equals(Reference.MOD_ID)) {
            LogHelper.fatal("Hello");
            syncConfig();
        }
    }*/


	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

        configFile = new Configuration(event.getSuggestedConfigurationFile());
        syncConfig();


        /*config = new SimpleConfig(Reference.MOD_ID, new Configuration(event.getSuggestedConfigurationFile())) {
            @Override
            public void loadConfig() {
                puppy = getConfig().getBoolean("puppy", Configuration.CATEGORY_GENERAL, puppy, I18n.translateToLocal(Reference.PUPPY));
                if (getConfig().hasChanged())
                    getConfig().save();
            }
        };
        config.loadConfig();*/
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
       // Minecraft.getMinecraft().
        //ClientProxy.render();
        //proxy.init();
        //proxy.registerRenderers();
		FMLCommonHandler.instance().bus().register(new EventHandler());
		//GameRegistry.registerWorldGenerator(eventmanager, 0);
		//NetworkRegistry.registerGuiHandler(this, guiHandlerPLC);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
        if (release) {
            LogHelper.info("Lets hope it does not shoot fire and blow up");
            LogHelper.info("-iChun 2015");
            LogHelper.info("yes that is in evey mod manmaed makes!");
}
        if (beta) {
            LogHelper.info("Lets hope it does not shoot fire and blow up");
            LogHelper.info("-iChun 2015");
            LogHelper.warn("This is a Beta Release so it may shoot fire and blow up!");
        }
        if (devenv) {

            LogHelper.fatal("If you can see this msg in a Release build manmaed forgot to turn the boolean off");
            LogHelper.fatal("Please Report This!");
        }
        //LogHelper.info(CPMItems.banhammer.getUnlocalizedName());

	}
}

