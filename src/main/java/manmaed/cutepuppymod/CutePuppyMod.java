package manmaed.cutepuppymod;

import manmaed.cutepuppymod.block.CPMBlocks;
import manmaed.cutepuppymod.client.render.entity.RenderPuppyTextures;
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
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, certificateFingerprint = "@FINGERPRINT@")

public class CutePuppyMod {

  @Mod.Instance(Reference.MOD_ID)
  public static CutePuppyMod instance;
    public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);
    private static RegistryHelper registryHelper;
    public static boolean christmas;
    public static boolean halloween;
    public static boolean manmaedbday;
    public static boolean bday;
    private static final String FINGERPRINT = "@FINGERPRINT@";

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.PROXY_COMMON)
	public static CommonProxy proxy;
	public static CreativeTabs tabsCMP = new CPMCreativeTab(CreativeTabs.getNextID());

    public static RegistryHelper getRegistryHelper() {
        return registryHelper;
    }



	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) throws NoSuchFieldException, IllegalAccessException {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        RenderPuppyTextures hat = new RenderPuppyTextures();

        if(month == 6 && day == 30) {
            bday = true;
            manmaedbday = true;
            hat.sethat("manmaed");
            LogHelper.info("Happy Birthday manmaed!");
        }
        if(month == 4 && day == 27) {
            /*bday = true;
            hat.sethat("joe");*/
            LogHelper.info("Happy Birthday JoeNoice!");
        }
        if(month == 6 && day == 8 ) {
            /*bday = true;
            hat.sethat("beefs");*/
            LogHelper.info("Happy Birthday UnRealDinnerbone!");
            LogHelper.info("Happy Birthday Dinnerbeef!");
        }
        if(month == 3 && day == 20 ) {
            bday = true;
            hat.sethat("dire");
            LogHelper.info("Happy Birthday Direwolf20!");
        }
        if(month == 10){
            halloween = true;
            hat.sethat("halloween");
            /*LogHelper.info("Its Halloween!:" + " " + halloween);*/
        }
        if(month == 12){
            christmas = true;
            hat.sethat("christmas");
            /*LogHelper.info("Its Christmas!:" + " " + christmas);*/
        }
        /*if(textevent){
            *//*Testing Events Enable Depending on event*//*
            //halloween = true;
            //christmas = true;
            //bday = true;

            *//*Turn Hats On*//*
            //hat.sethat("manmaed");
            //hat.sethat("joe");
            //hat.sethat("beefs");
            //hat.sethat("dire");
            //hat.sethat("halloween");
            //hat.sethat("christmas");
        }*/


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
        GameRegistry.addSmelting(new ItemStack(CPMBlocks.endercoreblock), new ItemStack(Items.ENDER_PEARL, 2), 5.0F);
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
        if(!event.isDirectory()) {
            invalsign = true;
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
        if (manmaedbday) {
            LogHelper.fatal("Please inform manmaed of this error: Happy Birthday!");
        }
        proxy.renderlayers();
        /*if(event.getSide() == Side.CLIENT)
        {
            RenderDemLayers dimlayer = new RenderDemLayers(new ModelPuppyHolder());
            for (RenderPlayer playerRender : Minecraft.getMinecraft().getRenderManager().getSkinMap().values()) {
                playerRender.addLayer(dimlayer);
            }
        }*/
    }
}

