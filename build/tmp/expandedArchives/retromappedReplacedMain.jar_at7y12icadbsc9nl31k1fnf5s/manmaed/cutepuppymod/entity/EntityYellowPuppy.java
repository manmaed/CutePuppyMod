package manmaed.cutepuppymod.entity;

import manmaed.cutepuppymod.items.CPMItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityYellowPuppy extends EntityAnimal
{
	public EntityYellowPuppy(World par1World)
	{
        super(par1World);
        this.func_70105_a(0.5F, 0.5F);
        this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
        //this.tasks.addTask(0, new );
        this.field_70714_bg.func_75776_a(1, new EntityAIPanic(this, 1.0D));
        this.field_70714_bg.func_75776_a(2, new EntityAIMate(this, 1.0D));
        this.field_70714_bg.func_75776_a(3, new EntityAITempt(this, 1.25D, Items.field_151014_N, false));
        this.field_70714_bg.func_75776_a(4, new EntityAIFollowParent(this, 1.25D));
        this.field_70714_bg.func_75776_a(5, new EntityAIWander(this, 1.0D));
        this.field_70714_bg.func_75776_a(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.field_70714_bg.func_75776_a(7, new EntityAILookIdle(this));
	}

    /*@Override
    public int getMaxSpawnedInChunk() {
        return 2;
    }*/
	

	
	public boolean isAIEnable()
	{
		return true;
	}
	
    protected void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(5.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.35D);
    }
    
    public EntityYellowPuppy spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityYellowPuppy(this.field_70170_p);
    }

    protected SoundEvent func_184639_G()
    {

        return this.field_70146_Z.nextInt(3) == 0 ? SoundEvents.field_187857_gE : SoundEvents.field_187865_gI;
    }
    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected SoundEvent func_184601_bQ()
    {

        return SoundEvents.field_187863_gH;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected SoundEvent func_184615_bR()
    {
        return SoundEvents.field_187859_gF;
    }
    
    public EntityAgeable func_90011_a(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }

    protected void func_70628_a(boolean par1, int par2)
    {
        if(this.field_70146_Z.nextInt(8) == 0)
        {
            this.func_145779_a(CPMItems.yellowcore, 1);
        }
    }

}
