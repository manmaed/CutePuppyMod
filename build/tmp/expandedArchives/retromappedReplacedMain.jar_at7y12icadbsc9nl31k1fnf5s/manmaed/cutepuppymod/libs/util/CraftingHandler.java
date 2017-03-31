package manmaed.cutepuppymod.libs.util;

import manmaed.cutepuppymod.achievements.Achievements;
import manmaed.cutepuppymod.items.CPMItems;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class CraftingHandler {

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
		if(event.pickedUp.func_92059_d().func_77973_b()== CPMItems.redcore)
		event.player.func_71064_a(Achievements.puppykiller, 1);
        if(event.pickedUp.func_92059_d().func_77973_b()== CPMItems.banhammer)
            event.player.func_71064_a(Achievements.killedbosspuppy, 1);
        if(event.pickedUp.func_92059_d().func_77973_b()== CPMItems.endercore)
            event.player.func_71064_a(Achievements.killEnderPuppy, 1);
    }
}
