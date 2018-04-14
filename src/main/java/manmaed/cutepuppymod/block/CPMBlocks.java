package manmaed.cutepuppymod.block;

import manmaed.cutepuppymod.CutePuppyMod;

public class CPMBlocks {

	/*public static Block blockGearbox;
	public static Block blockHamsterWheel;*/
	public static BaseCoreBlock endercoreblock;
	public static BaseCoreBlock bluecoreblock;
	public static BaseCoreBlock greencoreblock;
	public static BaseCoreBlock purplecoreblock;
	public static BaseCoreBlock redcoreblock;
	public static BaseCoreBlock yellowcoreblock;
	public static BaseCoreBlock herobrinecoreblock;
	public static BaseCoreBlock stevecoreblock;
	public static BaseCoreBlock thecoreblock;

	public static void RegisterBlocks() {
		//Init'ing
		/*blockGearbox = new BlockGearBox();*/
		endercoreblock = new EnderCoreBlock();
		bluecoreblock = new BlueCoreBlock();
		greencoreblock = new GreenCoreBlock();
		purplecoreblock = new PurpleCoreBlock();
		redcoreblock = new RedCoreBlock();
		yellowcoreblock = new YellowCoreBlock();
		herobrinecoreblock = new HerobrineCoreBlock();
		stevecoreblock = new SteveCoreBlock();
		thecoreblock = new TheCoreBlock();

		
		
		//Registring
		/*RegistryHelper.registerBlock(blockGearbox);*/
		CutePuppyMod.getRegistryHelper().registerBlock(endercoreblock);
		CutePuppyMod.getRegistryHelper().registerBlock(bluecoreblock);
		CutePuppyMod.getRegistryHelper().registerBlock(greencoreblock);
		CutePuppyMod.getRegistryHelper().registerBlock(purplecoreblock);
		CutePuppyMod.getRegistryHelper().registerBlock(redcoreblock);
		CutePuppyMod.getRegistryHelper().registerBlock(yellowcoreblock);
		CutePuppyMod.getRegistryHelper().registerBlock(herobrinecoreblock);
		CutePuppyMod.getRegistryHelper().registerBlock(stevecoreblock);
		CutePuppyMod.getRegistryHelper().registerBlock(thecoreblock);
	}
}
