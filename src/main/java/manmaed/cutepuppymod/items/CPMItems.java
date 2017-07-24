package manmaed.cutepuppymod.items;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class CPMItems {


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

		//Colored Drops
		/*bluecore = new BluePuppyCore();//
		purplecore = new PurplePuppyCore();
		redcore = new RedPuppyCore();//
		yellowcore = new YellowPuppyCore();//
		greencore = new GreenPuppyCore();//
        endercore = new EnderCore();//*/


        //Swords
        /*bluesword = new BluePuppySword(Item.ToolMaterial.IRON);//
        greensword = new GreenPuppySword(Item.ToolMaterial.IRON);//
        yellowsword = new YellowPuppySword(Item.ToolMaterial.IRON);//
        purplesword = new PurplePuppySword(Item.ToolMaterial.IRON);//
        banhammer = new BanHammer(banhammermeterial);//
        redsword = new RedPuppySword(Item.ToolMaterial.IRON);//
*/

		//Other Things
		iconfortab = new ItemTab();
/*        mic = new FreddysMic(Item.ToolMaterial.WOOD);*/



		//Registering
        //Colored Pup Drops
        /*CutePuppyMod.getRegistryHelper().registerItem(bluecore);
        CutePuppyMod.getRegistryHelper().registerItem(greencore);
        CutePuppyMod.getRegistryHelper().registerItem(purplecore);
        CutePuppyMod.getRegistryHelper().registerItem(redcore);
        CutePuppyMod.getRegistryHelper().registerItem(yellowcore);
        CutePuppyMod.getRegistryHelper().registerItem(endercore);*/


        //Others
        CutePuppyMod.getRegistryHelper().registerItem(iconfortab);
        /*CutePuppyMod.getRegistryHelper().registerItem(mic);*/


        //Swords
        /*CutePuppyMod.getRegistryHelper().registerItem(bluesword);
        CutePuppyMod.getRegistryHelper().registerItem(greensword);
        CutePuppyMod.getRegistryHelper().registerItem(purplesword);
        CutePuppyMod.getRegistryHelper().registerItem(redsword);
        CutePuppyMod.getRegistryHelper().registerItem(yellowsword);
        CutePuppyMod.getRegistryHelper().registerItem(banhammer);*/
        /*RegistryHelper.RegisterItem(bluesword, BluePuppySword.getName());
        RegistryHelper.RegisterItem(greensword, GreenPuppySword.getName());
        RegistryHelper.RegisterItem(purplesword, PurplePuppySword.getName());
        RegistryHelper.RegisterItem(redsword, RedPuppySword.getName());
        RegistryHelper.RegisterItem(yellowsword, YellowPuppySword.getName());
        RegistryHelper.RegisterItem(banhammer, BanHammer.getName());*/

        //Cores
       /* bluecore.setRegistryName("BluePuppyCore");
        greencore.setRegistryName("GreenPuppyCore");
        purplecore.setRegistryName("1");
        redcore.setRegistryName("2");
        yellowcore.setRegistryName("3");
        endercore.setRegistryName("4");
*/
        //Others
        iconfortab.setRegistryName("Names");
      /*  mic.setRegistryName("mic");*/

        //Swords + BanHammer
        /*bluesword.setRegistryName(BluePuppySword.getName().toString());
        greensword.setRegistryName(GreenPuppySword.getName().toString());
        purplesword.setRegistryName(PurplePuppySword.getName().toString());
        redsword.setRegistryName(RedPuppySword.getName().toString());
        yellowsword.setRegistryName(YellowPuppySword.getName().toString());
        banhammer.setRegistryName(BanHammer.getName().toString());*/
    }
}
