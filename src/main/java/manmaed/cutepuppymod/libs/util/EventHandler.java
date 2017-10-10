package manmaed.cutepuppymod.libs.util;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class EventHandler {

	@SubscribeEvent
	public void Smelting(PlayerEvent.ItemSmeltedEvent event)
	{
	//Add
	}
	@SubscribeEvent
	public void Craftng(PlayerEvent.ItemCraftedEvent event)
	{
	//Add
	}
	
	@SubscribeEvent
	public void PickUpItem(PlayerEvent.ItemPickupEvent event)
	{
		/*if(event.pickedUp.getEntityItem().getItem()== CPMItems.redcore)
		event.player.addStat(Achievements.puppykiller, 1);
        if(event.pickedUp.getEntityItem().getItem()== CPMItems.banhammer)
            event.player.addStat(Achievements.killedbosspuppy, 1);
        if(event.pickedUp.getEntityItem().getItem()== CPMItems.endercore)
            event.player.addStat(Achievements.killEnderPuppy, 1);*/
    }
/*	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if(eventArgs.getModID().equals(Reference.MOD_ID)) {
			CutePuppyMod.syncConfig();
		}
	}*/
}
