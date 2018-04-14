package manmaed.cutepuppymod.entity;

import manmaed.cutepuppymod.items.CPMItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityHerobrinePuppy extends EntityMob implements IMob
{
	public EntityHerobrinePuppy(World par1World) 
	{
        super(par1World);
        this.setHealth(this.getMaxHealth());
        this.setSize(0.5F, 0.5F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        //this.tasks.addTask(0, new );
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityStevePuppy.class, 6.0F));
        this.tasks.addTask(5, new EntityAILookIdle(this));
        //this.tasks.addTask(9, new EntityAIAttackMelee(EntityPlayer.class, 2.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
	}
	

	
	public boolean isAIEnable()
	{
		return true;
	}
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
    }
    /*@Override
    public int getMaxSpawnedInChunk() {
        return 2;
    }*/

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected SoundEvent getHurtSound()
    {

        return SoundEvents.ENTITY_WOLF_HURT;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_WOLF_DEATH;
    }


    protected void dropFewItems(boolean par1, int par2)
    {
        if(this.rand.nextInt(8) == 0)
        {
            this.dropItem(CPMItems.herobrinecore, 1);
        }
    }
    
}
