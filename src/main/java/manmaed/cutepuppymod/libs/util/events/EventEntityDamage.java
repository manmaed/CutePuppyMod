package manmaed.cutepuppymod.libs.util.events;

import manmaed.cutepuppymod.entity.EntityEnderBossPuppy;
import manmaed.cutepuppymod.entity.EntityTheBossPuppy;
import manmaed.cutepuppymod.libs.Reference;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by manmaed on 14/04/2018.
 */
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class EventEntityDamage
{
    @SubscribeEvent
    public static void onEntityDamage(LivingHurtEvent event) {
        if(event.getEntity() instanceof EntityEnderBossPuppy) {
            if(event.getSource() == DamageSource.LIGHTNING_BOLT) {
                event.setAmount(0);
                event.setCanceled(true);
            }
        }
        if(event.getEntity() instanceof EntityTheBossPuppy) {
            if(event.getSource() == DamageSource.LIGHTNING_BOLT) {
                event.setAmount(0);
                event.setCanceled(true);
            }
        }
    }
}
