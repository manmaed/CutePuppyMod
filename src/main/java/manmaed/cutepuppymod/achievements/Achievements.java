package manmaed.cutepuppymod.achievements;

import manmaed.cutepuppymod.items.CPMItems;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;


public class Achievements {
	public static Achievement puppykiller;
    public static Achievement killedbosspuppy;
    public static Achievement killEnderPuppy;
	public static AchievementPage PuppyAchievements;
	//public static Achievement howcouldyou;
	
	
	// TODO Loads
	public static void Load() {

		// Telling MC That i Waz a Ne Achievements
		puppykiller = new Achievement("achievement.puppykiller", "puppykiller", 1, 1, CPMItems.redcore, null).initIndependentStat().registerStat();
        killEnderPuppy = new Achievement("achievement.enderpuppy", "enderpuppy", 1, -1,CPMItems.endercore, Achievements.puppykiller).registerStat();
		/*bluepuppykiller = new Achievement("achievement.bluepuppykiller", "bluepuppykiller", 0, 0, CPMItems.iconfortab, null).initIndependentStat().registerStat();
		redpuppykiller = new Achievement("achievement.redpuppykiller", "redpuppykiller", -1, 1, CPMItems.iconfortab, null).initIndependentStat().registerStat();
		hazardpuppykiller = new Achievement("achievement.hazardpuppykiller", "hazardpuppykiller", -2, 2, CPMItems.iconfortab, null).initIndependentStat().registerStat();
		purplepuppykiller = new Achievement("achievement.purplepuppykiller", "purplepuppykiller", -3, 3, CPMItems.iconfortab, null).initIndependentStat().registerStat();
		stevepuppykiller = new Achievement("achievement.stevepuppykiller", "stevepuppykiller", -4, 4, CPMItems.iconfortab, null).initIndependentStat().registerStat();
		herobrinepuppykiller = new Achievement("achievement.herobrinepuppykiller", "herobrinepuppykiller", -5, 5, CPMItems.iconfortab, null).initIndependentStat().registerStat();*/


		killedbosspuppy = new Achievement("achievement.killedbosspuppy", "killedbosspuppy", 2, 0, CPMItems.banhammer, Achievements.puppykiller).registerStat();

		//hamsterkiller = new Achievement("achievement.hamsterkill", "hamsterkiller", 7, -2, Items.wooden_sword, AchievementList.buildSword).registerStat();
		//howcouldyou = new Achievement("achievement.howcouldyou", "howcouldyou", 8 , -2, teamhamster.hamsterwheel.items.Items.cookedhamster, hamsterkiller).registerStat();

		//Achievement Page
		//TODO: Find out how to make it a look in the lang file
		PuppyAchievements = new AchievementPage("Puppy Achievements", puppykiller, killedbosspuppy, killEnderPuppy);
		AchievementPage.registerAchievementPage(PuppyAchievements);
	}
}
