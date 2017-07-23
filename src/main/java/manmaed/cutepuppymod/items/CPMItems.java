package manmaed.cutepuppymod.items;

import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.items.puppydrops.*;
import manmaed.cutepuppymod.items.swords.*;
import manmaed.cutepuppymod.libs.util.RegistryHelper;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class CPMItems {

    /*//Puppys - Colors
	public static Item spawnbluepuppy;
	public static Item spawngreenpuppy;
	public static Item spawnpurplepuppy;
	public static Item spawnredpuppy;
    public static Item spawnyellowpuppy;
    //Puppys - Custom
	public static Item spawnsixpuppy;
	public static Item spawnstevepuppy;
    //public static Item spawnhazardpuppy;
    public static Item spawnherobrinepuppy;*/

    //PuppyDrops
    public static Item redcore;
    public static Item bluecore;
    public static Item greencore;
    public static Item purplecore;
    public static Item yellowcore;
    public static Item endercore;

    //Swords
    public static Item bluesword;
    public static Item purplesword;
    public static Item redsword;
    public static Item yellowsword;
    public static Item greensword;
    public static Item banhammer;
    public static Item spawnenderpuppy;

    //Random
    public static Item iconfortab;
    public static Item mic;
    static Item.ToolMaterial banhammermeterial = EnumHelper.addToolMaterial("banhammermeterial", 3, 3000, 0.0F, 20.0F, 0);


	
	public static void RegisterItems() {
		//Init'ing

		//Colored Pups
		/*spawnbluepuppy = new SpawnBluePuppy();//
		spawnpurplepuppy = new SpawnPurplePuppy();//
		spawnredpuppy = new SpawnRedPuppy();//
		spawnyellowpuppy = new SpawnYellowPuppy();//
		spawngreenpuppy = new SpawnGreenPuppy();//
        spawnenderpuppy = new SpawnEnderPuppy();*/
		//Colored Drops
		bluecore = new BluePuppyCore();//
		purplecore = new PurplePuppyCore();
		redcore = new RedPuppyCore();//
		yellowcore = new YellowPuppyCore();//
		greencore = new GreenPuppyCore();//
        endercore = new EnderCore();//

		//Custom Pups
		//spawnhazardpuppy = new SpawnHazardPuppy();
		/*spawnherobrinepuppy = new SpawnHerobrinePuppy();//
		spawnsixpuppy = new SpawnSixPuppy();//
		spawnstevepuppy = new SpawnStevePuppy();//*/

        //Swords
        bluesword = new BluePuppySword(Item.ToolMaterial.IRON);//
        redsword = new RedPuppySword(Item.ToolMaterial.IRON);//
        greensword = new GreenPuppySword(Item.ToolMaterial.IRON);//
        yellowsword = new YellowPuppySword(Item.ToolMaterial.IRON);//
        purplesword = new PurplePuppySword(Item.ToolMaterial.IRON);//
        banhammer = new BanHammer(banhammermeterial);//


		//Other Things
		iconfortab = new ItemTab();
        mic = new FreddysMic(Item.ToolMaterial.WOOD);



		//Registering
        //Colored Pup Drops
        CutePuppyMod.getRegistryHelper().registerItem(bluecore);
        CutePuppyMod.getRegistryHelper().registerItem(greencore);
        CutePuppyMod.getRegistryHelper().registerItem(purplecore);
        CutePuppyMod.getRegistryHelper().registerItem(redcore);
        CutePuppyMod.getRegistryHelper().registerItem(yellowcore);
        CutePuppyMod.getRegistryHelper().registerItem(endercore);


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
        /*RegistryHelper.RegisterItem(bluesword, BluePuppySword.getName());
        RegistryHelper.RegisterItem(greensword, GreenPuppySword.getName());
        RegistryHelper.RegisterItem(purplesword, PurplePuppySword.getName());
        RegistryHelper.RegisterItem(redsword, RedPuppySword.getName());
        RegistryHelper.RegisterItem(yellowsword, YellowPuppySword.getName());
        RegistryHelper.RegisterItem(banhammer, BanHammer.getName());*/

        //Cores
        bluecore.setRegistryName(BluePuppyCore.getName());
        greencore.setRegistryName(GreenPuppyCore.getName());
        purplecore.setRegistryName(PurplePuppyCore.getName());
        redcore.setRegistryName(RedPuppyCore.getName());
        yellowcore.setRegistryName(YellowPuppyCore.getName());
        endercore.setRegistryName(EnderCore.getName());

        //Others
        iconfortab.setRegistryName(ItemTab.getName());
        mic.setRegistryName(FreddysMic.getName());

        //Swords + BanHammer
        bluesword.setRegistryName(BluePuppySword.getName());
        greensword.setRegistryName(GreenPuppySword.getName());
        purplesword.setRegistryName(PurplePuppySword.getName());
        redsword.setRegistryName(RedPuppySword.getName());
        yellowsword.setRegistryName(YellowPuppySword.getName());
        banhammer.setRegistryName(BanHammer.getName());
    }
}
