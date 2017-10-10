package manmaed.cutepuppymod.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

/**
 * Created by manmaed on 23/07/2017.
 */
public class ConfigManager {
    public static ConfigManager instance;
    public final boolean disablesixpuppy;
    public final Configuration config;

    public static void loadConfig(Configuration configuration) {
        instance = new ConfigManager(configuration);
    }

    public ConfigManager(Configuration configuration) {
        this.config = configuration;

        configuration.addCustomCategoryComment("Spawning", "Option for Spawning Entitys");
        Property p_disablesixpuppy = configuration.get("Spawning", "DisableSixKiller", false);

        configuration.load();

        disablesixpuppy = p_disablesixpuppy.getBoolean();

        boolean anyDefault = !p_disablesixpuppy.wasRead();

        if (anyDefault)
            configuration.save();
    }
}
