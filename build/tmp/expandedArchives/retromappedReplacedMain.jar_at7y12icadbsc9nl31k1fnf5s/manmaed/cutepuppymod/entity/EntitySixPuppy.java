package manmaed.cutepuppymod.entity;

import manmaed.cutepuppymod.items.CPMItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntitySixPuppy extends EntityMob implements IMob
{
    private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.func_145748_c_(), BossInfo.Color.PURPLE, BossInfo.Overlay.PROGRESS)).func_186741_a(false);
    public EntitySixPuppy(World par1World)
    {
        super(par1World);
        this.func_70606_j(this.func_110138_aP());
        this.func_70105_a(0.5F, 0.5F);
        this.field_70178_ae = true;
    }

    @Override
    protected void func_184651_r()
    {
        this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
        this.field_70714_bg.func_75776_a(1, new EntityAIAttackMelee(this, 1.0D, false));
        this.field_70714_bg.func_75776_a(2, new EntityAIWander(this, 1.0D));
        this.field_70714_bg.func_75776_a(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.field_70714_bg.func_75776_a(5, new EntityAILookIdle(this));
        this.applyEntityAI();
    }


    protected void applyEntityAI()
    {
        this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, false, new Class[0]));
    /*    this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
     */
    }

    @Override
    protected void func_70619_bc() {

        super.func_70619_bc();
        this.bossInfo.func_186735_a(this.func_110143_aJ() / this.func_110138_aP());
    }

    public void func_70636_d(){

        super.func_70636_d();
    }

    protected void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(200.0D);
        //this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.35D);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(8.0D);
    }

    /*@Override
    public int getMaxSpawnedInChunk() {
        return 2;
    }*/
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

    /*protected void dropFewItems(boolean par1, int par2)
    {
		if(this.rand.nextInt(20) == 0)
				{
			this.dropItem(CPMItems.banhammer, 1);
				}
    }*/
    /**
     * Add the given player to the list of players tracking this entity. For instance, a player may track a boss in
     * order to view its associated boss bar.
     */
    public void func_184178_b(EntityPlayerMP player)
    {
        super.func_184178_b(player);
        this.bossInfo.func_186760_a(player);
    }

    /**
     * Removes the given player from the list of players tracking this entity. See {@link Entity#addTrackingPlayer} for
     * more information on tracking.
     */
    public void func_184203_c(EntityPlayerMP player)
    {
        super.func_184203_c(player);
        this.bossInfo.func_186761_b(player);
    }

    @Override
    public boolean func_184222_aU()
    {
        return false;
    }



    protected void func_70628_a(boolean par1, int par2)
    {
        if(this.field_70146_Z.nextInt(50) == 0)
        {
            this.func_145779_a(CPMItems.banhammer, 1);
        }
    }
}
