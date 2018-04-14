package manmaed.cutepuppymod.libs.util.events;

import manmaed.cutepuppymod.libs.Reference;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by manmaed on 14/04/2018.
 */

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class EventBlockClicked {

    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent.RightClickBlock event){
//        IBlockState state = event.getWorld().getBlockState(event.getPos());
//        if(state.getBlock() == CPMBlocks.endercoreblock) {
//            LogHelper.info("rightclick on endercoreblock");
//            if(event.getItemStack().getItem() == CPMItems.endercore){
//                event.getWorld().setBlockState(event.getPos(), Blocks.AIR.getDefaultState());
//            }
//        }
//        if(state.getBlock() == CPMBlocks.thecoreblock){
//            if(event.getItemStack().getItem() == CPMItems.endercore){
//                event.getWorld().setBlockState(event.getPos(), Blocks.AIR.getDefaultState());
//            }
//        }
    }

}
