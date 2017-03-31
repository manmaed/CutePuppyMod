package manmaed.cutepuppymod.items;

import manmaed.cutepuppymod.items.puppydrops.*;
import manmaed.cutepuppymod.items.swords.*;
import manmaed.cutepuppymod.libs.util.RegistryHelper;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class CPMItems {

    //Puppys - Colors
	public static Item spawnbluepuppy;
	public static Item spawngreenpuppy;
	public static Item spawnpurplepuppy;
	public static Item spawnredpuppy;
    public static Item spawnyellowpuppy;
    //Puppys - Custom
	public static Item spawnsixpuppy;
	public static Item spawnstevepuppy;
    //public static Item spawnhazardpuppy;
    public static Item spawnherobrinepuppy;

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


	
	public static void RegisterItem() {
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
		//Colored Pups
       /* RegistryHelper.RegisterItem(spawnbluepuppy, SpawnBluePuppy.getName());
        RegistryHelper.RegisterItem(spawngreenpuppy, SpawnGreenPuppy.getName());
        RegistryHelper.RegisterItem(spawnpurplepuppy, SpawnPurplePuppy.getName());
        RegistryHelper.RegisterItem(spawnredpuppy, SpawnRedPuppy.getName());
        RegistryHelper.RegisterItem(spawnyellowpuppy, SpawnYellowPuppy.getName());
        RegistryHelper.RegisterItem(spawnenderpuppy, SpawnEnderPuppy.getName());*/
        //Colored Pup Drops
        RegistryHelper.RegisterItem(bluecore, BluePuppyCore.getName());
        RegistryHelper.RegisterItem(greencore, GreenPuppyCore.getName());
        RegistryHelper.RegisterItem(purplecore, PurplePuppyCore.getName());
        RegistryHelper.RegisterItem(redcore, RedPuppyCore.getName());
        RegistryHelper.RegisterItem(yellowcore, YellowPuppyCore.getName());
        RegistryHelper.RegisterItem(endercore, EnderCore.getName());

        //Custom
        //RegistryHelper.RegisterItem(spawnhazardpuppy.getUnlocalizedName());
        /*RegistryHelper.RegisterItem(spawnherobrinepuppy, SpawnHerobrinePuppy.getName());
        RegistryHelper.RegisterItem(spawnsixpuppy, SpawnSixPuppy.getName());
        RegistryHelper.RegisterItem(spawnstevepuppy, SpawnStevePuppy.getName());*/

        //Others
        RegistryHelper.RegisterItem(iconfortab, ItemTab.getName());
        RegistryHelper.RegisterItem(mic, FreddysMic.getName());

        //Swords
        RegistryHelper.RegisterItem(bluesword, BluePuppySword.getName());
        RegistryHelper.RegisterItem(greensword, GreenPuppySword.getName());
        RegistryHelper.RegisterItem(purplesword, PurplePuppySword.getName());
        RegistryHelper.RegisterItem(redsword, RedPuppySword.getName());
        RegistryHelper.RegisterItem(yellowsword, YellowPuppySword.getName());
        RegistryHelper.RegisterItem(banhammer, BanHammer.getName());

	}

    public static void RenderItem() {

        /*RegistryHelper.RenderItem(spawnbluepuppy, SpawnBluePuppy.getName());
        RegistryHelper.RenderItem(spawngreenpuppy, SpawnGreenPuppy.getName());
        RegistryHelper.RenderItem(spawnpurplepuppy, SpawnPurplePuppy.getName());
        RegistryHelper.RenderItem(spawnredpuppy, SpawnRedPuppy.getName());
        RegistryHelper.RenderItem(spawnyellowpuppy, SpawnYellowPuppy.getName());
        RegistryHelper.RenderItem(spawnenderpuppy, SpawnEnderPuppy.getName());*/
        //Colored Pup Drops
        RegistryHelper.RenderItem(bluecore, BluePuppyCore.getName());
        RegistryHelper.RenderItem(greencore, GreenPuppyCore.getName());
        RegistryHelper.RenderItem(purplecore, PurplePuppyCore.getName());
        RegistryHelper.RenderItem(redcore, RedPuppyCore.getName());
        RegistryHelper.RenderItem(yellowcore, YellowPuppyCore.getName());
        RegistryHelper.RenderItem(endercore, EnderCore.getName());

        //Custom
        //RegistryHelper.RenderItem(spawnhazardpuppy.getUnlocalizedName());
        /*RegistryHelper.RenderItem(spawnherobrinepuppy, SpawnHerobrinePuppy.getName());
        RegistryHelper.RenderItem(spawnsixpuppy, SpawnSixPuppy.getName());
        RegistryHelper.RenderItem(spawnstevepuppy, SpawnStevePuppy.getName());*/

        //Others
        RegistryHelper.RenderItem(iconfortab, ItemTab.getName());
        RegistryHelper.RenderItem(mic, FreddysMic.getName());

        //Swords
        RegistryHelper.RenderItem(bluesword, BluePuppySword.getName());
        RegistryHelper.RenderItem(greensword, GreenPuppySword.getName());
        RegistryHelper.RenderItem(purplesword, PurplePuppySword.getName());
        RegistryHelper.RenderItem(redsword, RedPuppySword.getName());
        RegistryHelper.RenderItem(yellowsword, YellowPuppySword.getName());
        RegistryHelper.RenderItem(banhammer, BanHammer.getName());
    }

}
