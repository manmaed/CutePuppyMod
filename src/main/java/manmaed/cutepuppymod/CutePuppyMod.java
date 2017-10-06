package manmaed.cutepuppymod;

import manmaed.cutepuppymod.block.CPMBlocks;
import manmaed.cutepuppymod.config.ConfigManager;
import manmaed.cutepuppymod.creativetab.CPMCreativeTab;
import manmaed.cutepuppymod.entity.CPMEntitys;
import manmaed.cutepuppymod.items.CPMItems;
import manmaed.cutepuppymod.libs.LogHelper;
import manmaed.cutepuppymod.libs.Reference;
import manmaed.cutepuppymod.libs.iChun;
import manmaed.cutepuppymod.libs.util.RegistryHelper;
import manmaed.cutepuppymod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class CutePuppyMod {

  @Mod.Instance(Reference.MOD_ID)
  public static CutePuppyMod instance;
    public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);
    private static RegistryHelper registryHelper;
    public static boolean christmas;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.PROXY_COMMON)
	public static CommonProxy proxy;
	public static CreativeTabs tabsCMP = new CPMCreativeTab(CreativeTabs.getNextID());

    public static RegistryHelper getRegistryHelper() {
        return registryHelper;
    }


	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();

        if(month == 12){
            christmas = true;
            LogHelper.info("Its Christmas!:" + " " + christmas);
        }



        ConfigManager.loadConfig(new Configuration(event.getSuggestedConfigurationFile()));
        registryHelper = new RegistryHelper(event);


        CPMBlocks.RegisterBlocks();
        CPMItems.RegisterItems();
        CPMEntitys.Load();
        proxy.renderInformation();

    }
	@Mod.EventHandler
	public void load(FMLInitializationEvent event)
	{
	    //Stuff
	}
    private static boolean devenvsign = false;
    private static boolean invalsign = false;

    @Mod.EventHandler
    public void onInvalidFingerprint(FMLFingerprintViolationEvent event) {
        if (event.isDirectory()) {
            devenvsign = true;
            iChun.setdev();
        }
    }
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        iChun.RuniChunMagic();
        if (devenvsign) {
            LogHelper.info(Reference.NO_FINGERPRINT_MESSAGE);
        }
        if (invalsign) {
            LogHelper.warn(Reference.INVALID_FINGERPRINT_MESSAGE);
        }
        if (christmas) {
            LogHelper.warn("Christmas Hats are On!");
        }
    }
}

