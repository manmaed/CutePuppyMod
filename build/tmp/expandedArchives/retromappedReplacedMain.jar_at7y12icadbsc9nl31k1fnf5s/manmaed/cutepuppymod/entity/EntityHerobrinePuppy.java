package manmaed.cutepuppymod.entity;

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
        this.func_70606_j(this.func_110138_aP());
        this.func_70105_a(0.5F, 0.5F);
        this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
        //this.tasks.addTask(0, new );
        this.field_70714_bg.func_75776_a(1, new EntityAIAttackMelee(this, 1.0D, false));
        this.field_70714_bg.func_75776_a(2, new EntityAIWander(this, 1.0D));
        this.field_70714_bg.func_75776_a(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.field_70714_bg.func_75776_a(4, new EntityAIWatchClosest(this, EntityStevePuppy.class, 6.0F));
        this.field_70714_bg.func_75776_a(5, new EntityAILookIdle(this));
        //this.tasks.addTask(9, new EntityAIAttackMelee(EntityPlayer.class, 2.0D, false));
        this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, false, new Class[0]));
	}
	

	
	public boolean isAIEnable()
	{
		return true;
	}
	
    protected void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(100.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.35D);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(3.0D);
    }
    /*@Override
    public int getMaxSpawnedInChunk() {
        return 2;
    }*/

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

    
/*    protected void dropFewItems(boolean par1, int par2)
    {
		if(this.rand.nextInt(4) == 0)
				{
			this.dropItem(Items.diamond, 2);
				}
    }*/
    
}
