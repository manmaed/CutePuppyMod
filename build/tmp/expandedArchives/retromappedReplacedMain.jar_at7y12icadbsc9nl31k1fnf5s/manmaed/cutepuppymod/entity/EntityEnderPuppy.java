package manmaed.cutepuppymod.entity;

import manmaed.cutepuppymod.items.CPMItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

public class EntityEnderPuppy extends EntityMob {

    private static final UUID ATTACKING_SPEED_BOOST_ID = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
    private static final AttributeModifier ATTACKING_SPEED_BOOST = (new AttributeModifier(ATTACKING_SPEED_BOOST_ID, "Attacking speed boost", 0.15000000596046448D, 0)).func_111168_a(false);
    private static final DataParameter<Boolean> SCREAMING = EntityDataManager.<Boolean>func_187226_a(EntityEnderPuppy.class, DataSerializers.field_187198_h);
    private int lastCreepySound;
    private int targetChangeTime;

    public EntityEnderPuppy(World worldIn) {
        super(worldIn);
        this.func_70105_a(0.5F, 0.5F);
        this.func_184644_a(PathNodeType.WATER, -1.0F);
        this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
        this.field_70714_bg.func_75776_a(2, new EntityAIAttackMelee(this, 1.0D, false));
        this.field_70714_bg.func_75776_a(7, new EntityAIWander(this, 1.0D));
        this.field_70714_bg.func_75776_a(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.field_70714_bg.func_75776_a(8, new EntityAILookIdle(this));
        this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, false, new Class[0]));
    }

    /*@Override
    public int getMaxSpawnedInChunk() {
        return 5;
    }*/
    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(10.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.30000001192092896D);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(5.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(64.0D);
    }

    /**
     * Sets the active target the Task system uses for tracking
     */
    public void func_70624_b(@Nullable EntityLivingBase entitylivingbaseIn)
    {
        super.func_70624_b(entitylivingbaseIn);
        IAttributeInstance iattributeinstance = this.func_110148_a(SharedMonsterAttributes.field_111263_d);

        if (entitylivingbaseIn == null)
        {
            this.targetChangeTime = 0;
            this.field_70180_af.func_187227_b(SCREAMING, Boolean.valueOf(false));
            iattributeinstance.func_111124_b(ATTACKING_SPEED_BOOST);
        }
        else
        {
            this.targetChangeTime = this.field_70173_aa;
            this.field_70180_af.func_187227_b(SCREAMING, Boolean.valueOf(true));

            if (!iattributeinstance.func_180374_a(ATTACKING_SPEED_BOOST))
            {
                iattributeinstance.func_111121_a(ATTACKING_SPEED_BOOST);
            }
        }
    }
    protected void func_70088_a()
    {
        super.func_70088_a();
        this.field_70180_af.func_187214_a(SCREAMING, Boolean.valueOf(false));
    }
    public void playEnderPuppySound() {
        if (this.field_70173_aa >= this.lastCreepySound + 400) {
            this.lastCreepySound = this.field_70173_aa;

            if (!this.func_174814_R()) {
                this.field_70170_p.func_184134_a(this.field_70165_t, this.field_70163_u + (double) this.func_70047_e(), this.field_70161_v, SoundEvents.field_187533_aW, this.func_184176_by(), 2.5F, 1.0F, false);
            }
        }
    }

    public void func_184206_a(DataParameter<?> key)
    {
        if (SCREAMING.equals(key) && this.field_70170_p.field_72995_K)
        {
            this.playEnderPuppySound();
        }

        super.func_184206_a(key);
    }
    public static void func_189763_b(DataFixer p_189763_0_)
    {
        EntityLiving.func_189752_a(p_189763_0_, "EnderPuppy");
    }

    /**
     * Checks to see if this enderman should be attacking this player
     */
    private boolean shouldAttackPlayer(EntityPlayer player)
    {
        ItemStack itemstack = player.field_71071_by.field_70460_b[3];

        if (itemstack != null && itemstack.func_77973_b() == Item.func_150898_a(Blocks.field_150423_aK))
        {
            return false;
        }
        else
        {
            Vec3d vec3d = player.func_70676_i(1.0F).func_72432_b();
            Vec3d vec3d1 = new Vec3d(this.field_70165_t - player.field_70165_t, this.func_174813_aQ().field_72338_b + (double)this.func_70047_e() - (player.field_70163_u + (double)player.func_70047_e()), this.field_70161_v - player.field_70161_v);
            double d0 = vec3d1.func_72433_c();
            vec3d1 = vec3d1.func_72432_b();
            double d1 = vec3d.func_72430_b(vec3d1);
            return d1 > 1.0D - 0.025D / d0 ? player.func_70685_l(this) : false;
        }
    }

    public void func_70636_d()
    {
        if (this.field_70170_p.field_72995_K)
        {
            for (int i = 0; i < 2; ++i)
            {
                this.field_70170_p.func_175688_a(EnumParticleTypes.PORTAL, this.field_70165_t + (this.field_70146_Z.nextDouble() - 0.5D) * (double)this.field_70130_N, this.field_70163_u + this.field_70146_Z.nextDouble() * (double)this.field_70131_O - 0.25D, this.field_70161_v + (this.field_70146_Z.nextDouble() - 0.5D) * (double)this.field_70130_N, (this.field_70146_Z.nextDouble() - 0.5D) * 2.0D, -this.field_70146_Z.nextDouble(), (this.field_70146_Z.nextDouble() - 0.5D) * 2.0D, new int[0]);
            }
        }

        this.field_70703_bu = false;
        super.func_70636_d();
    }

    protected void func_70619_bc()
    {
        if (this.func_70026_G())
        {
            this.func_70097_a(DamageSource.field_76369_e, 1.0F);
        }

        if (this.field_70170_p.func_72935_r() && this.field_70173_aa >= this.targetChangeTime + 600)
        {
            float f = this.func_70013_c(1.0F);

            if (f > 0.5F && this.field_70170_p.func_175678_i(new BlockPos(this)) && this.field_70146_Z.nextFloat() * 30.0F < (f - 0.4F) * 2.0F)
            {
                this.func_70624_b((EntityLivingBase)null);
                this.teleportRandomly();
            }
        }

        super.func_70619_bc();
    }

    /**
     * Teleport the enderman to a random nearby position
     */
    protected boolean teleportRandomly()
    {
        double d0 = this.field_70165_t + (this.field_70146_Z.nextDouble() - 0.5D) * 64.0D;
        double d1 = this.field_70163_u + (double)(this.field_70146_Z.nextInt(64) - 32);
        double d2 = this.field_70161_v + (this.field_70146_Z.nextDouble() - 0.5D) * 64.0D;
        return this.teleportTo(d0, d1, d2);
    }

    /**
     * Teleport the enderman to another entity
     */
    protected boolean teleportToEntity(Entity p_70816_1_)
    {
        Vec3d vec3d = new Vec3d(this.field_70165_t - p_70816_1_.field_70165_t, this.func_174813_aQ().field_72338_b + (double)(this.field_70131_O / 2.0F) - p_70816_1_.field_70163_u + (double)p_70816_1_.func_70047_e(), this.field_70161_v - p_70816_1_.field_70161_v);
        vec3d = vec3d.func_72432_b();
        double d0 = 16.0D;
        double d1 = this.field_70165_t + (this.field_70146_Z.nextDouble() - 0.5D) * 8.0D - vec3d.field_72450_a * 16.0D;
        double d2 = this.field_70163_u + (double)(this.field_70146_Z.nextInt(16) - 8) - vec3d.field_72448_b * 16.0D;
        double d3 = this.field_70161_v + (this.field_70146_Z.nextDouble() - 0.5D) * 8.0D - vec3d.field_72449_c * 16.0D;
        return this.teleportTo(d1, d2, d3);
    }

    /**
     * Teleport the enderman
     */
    private boolean teleportTo(double x, double y, double z)
    {
        net.minecraftforge.event.entity.living.EnderTeleportEvent event = new net.minecraftforge.event.entity.living.EnderTeleportEvent(this, x, y, z, 0);
        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return false;
        boolean flag = this.func_184595_k(event.getTargetX(), event.getTargetY(), event.getTargetZ());

        if (flag)
        {
            this.field_70170_p.func_184148_a((EntityPlayer)null, this.field_70169_q, this.field_70167_r, this.field_70166_s, SoundEvents.field_187534_aX, this.func_184176_by(), 1.0F, 1.0F);
            this.func_184185_a(SoundEvents.field_187534_aX, 1.0F, 1.0F);
        }

        return flag;
    }

    protected SoundEvent func_184639_G()
    {

        return this.field_70146_Z.nextInt(2) == 0 ? SoundEvents.field_187857_gE : SoundEvents.field_187529_aS;
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

    protected void func_70628_a(boolean par1, int par2) {
        if (this.field_70146_Z.nextInt(8) == 0) {
            this.func_145779_a(CPMItems.endercore, 1);
        }
    }
}
