package manmaed.cutepuppymod.items;

import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.items.puppydrops.*;
import manmaed.cutepuppymod.items.swords.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class CPMItems {


    //PuppyDrops
    public static ItemCoreBase redcore;
    public static ItemCoreBase bluecore;
    public static ItemCoreBase greencore;
    public static ItemCoreBase purplecore;
    public static ItemCoreBase yellowcore;
    public static ItemCoreBase endercore;
    public static ItemCoreBase stevecore;
    public static ItemCoreBase herobrinecore;

    //Swords
    public static Item bluesword;
    public static Item purplesword;
    public static Item redsword;
    public static Item yellowsword;
    public static Item greensword;
    public static Item banhammer;

    //Random
    public static ItemCoreBase emptysyringe;
    public static ItemCoreBase fullsyringe;
    public static Item iconfortab;
    public static Item mic;
    static Item.ToolMaterial banhammermeterial = EnumHelper.addToolMaterial("banhammermeterial", 3, 3000, 0.0F, 20.0F, 0);


	
	public static void RegisterItems() {
		//Init'ing

		//Colored Drops
		bluecore = new BluePuppyCore();
		purplecore = new PurplePuppyCore();
		redcore = new RedPuppyCore();
		yellowcore = new YellowPuppyCore();
		greencore = new GreenPuppyCore();
        endercore = new EnderCore();
        stevecore = new StevePuppyCore();
        herobrinecore = new HerobrinePuppyCore();


        //Swords
        bluesword = new BluePuppySword(Item.ToolMaterial.IRON);
        greensword = new GreenPuppySword(Item.ToolMaterial.IRON);
        yellowsword = new YellowPuppySword(Item.ToolMaterial.IRON);
        purplesword = new PurplePuppySword(Item.ToolMaterial.IRON);
        banhammer = new BanHammer(banhammermeterial);
        redsword = new RedPuppySword(Item.ToolMaterial.IRON);

		//Other Things
		iconfortab = new ItemTab();
        mic = new FreddysMic(Item.ToolMaterial.WOOD);
        emptysyringe = new EmptySyringe();
        fullsyringe = new FullSyringe();



		//Registering
        //Colored Pup Drops
        CutePuppyMod.getRegistryHelper().registerItem(bluecore);
        CutePuppyMod.getRegistryHelper().registerItem(greencore);
        CutePuppyMod.getRegistryHelper().registerItem(purplecore);
        CutePuppyMod.getRegistryHelper().registerItem(redcore);
        CutePuppyMod.getRegistryHelper().registerItem(yellowcore);
        CutePuppyMod.getRegistryHelper().registerItem(endercore);
        CutePuppyMod.getRegistryHelper().registerItem(stevecore);
        CutePuppyMod.getRegistryHelper().registerItem(herobrinecore);


        //Others
        CutePuppyMod.getRegistryHelper().registerItem(iconfortab);
        CutePuppyMod.getRegistryHelper().registerItem(mic);


        //Swords
        CutePuppyMod.getRegistryHelper().registerItem(bluesword);
        CutePuppyMod.getRegistryHelper().registerItem(greensword);
        CutePuppyMod.getRegistryHelper().registerItem(purplesword);
        CutePuppyMod.getRegistryHelper().registerItem(redsword);
        CutePuppyMod.getRegistryHelper().registerItem(yellowsword);
        CutePuppyMod.getRegistryHelper().registerItem(banhammer);

        CutePuppyMod.getRegistryHelper().registerItem(fullsyringe);
        CutePuppyMod.getRegistryHelper().registerItem(emptysyringe);
        /*RegistryHelper.RegisterItem(bluesword, BluePuppySword.getName());
        RegistryHelper.RegisterItem(greensword, GreenPuppySword.getName());
        RegistryHelper.RegisterItem(purplesword, PurplePuppySword.getName());
        RegistryHelper.RegisterItem(redsword, RedPuppySword.getName());
        RegistryHelper.RegisterItem(yellowsword, YellowPuppySword.getName());
        RegistryHelper.RegisterItem(banhammer, BanHammer.getName());*/

        //Cores

        //Others
        iconfortab.setRegistryName(ItemTab.getName());
        mic.setRegistryName(FreddysMic.getName());

        //Swords + BanHammer
        bluesword.setRegistryName(BluePuppySword.getName());
        greensword.setRegistryName(GreenPuppySword.getName());
        purplesword.setRegistryName(PurplePuppySword.getName());
        redsword.setRegistryName(RedPuppySword.getName());
        yellowsword.setRegistryName(YellowPuppySword.getName());
    }
}
