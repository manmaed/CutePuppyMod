package net.manmaed.cutepuppymod;


import net.manmaed.cutepuppymod.entitys.CPEntity;
import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.manmaed.cutepuppymod.items.CPItems;
import net.manmaed.cutepuppymod.libs.Refs;
import net.manmaed.cutepuppymod.libs.RegisterHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Created by manmaed on 09/04/2021.
 */

@Mod(Refs.id)
public class CutePuppyMod {

    /*
    *
    * TODO List
    * TODO: Blocks
    *  * EnderCore Block (Needs Entitys)
    *  * TheCoreBlock (Needs Entitys)
    * ---
    *
    *
    */

    private static RegisterHandler registeryHandler;
    public static final ItemGroup itemGroup = new ItemGroup(Refs.id) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(CPItems.tabicon);
        }
    };

    public CutePuppyMod() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(CutePuppyModClient::doClientStuff);
        registeryHandler = new RegisterHandler();
        CPEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        /*
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, PRConfig.COMMON_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, PRConfig.CLIENT_CONFIG);
        MinecraftForge.EVENT_BUS.addListener(this::serverLoad);*/
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static RegisterHandler getRegisteryHandler() {
        return registeryHandler;
    }

    private void init(final FMLCommonSetupEvent event) {
        // some preinit code;
        DeferredWorkQueue.runLater(CPEntity::load);
        //World Gen
        /*event.enqueueWork(WorldGenHandler::registerConfiguredFeatures);*/
    }

    //Commands
    /*private void serverLoad(FMLServerStartingEvent event) {
        PRCommands.register(event.getServer().getCommandManager().getDispatcher());
    }*/
}
