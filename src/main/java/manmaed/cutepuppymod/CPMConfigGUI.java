package manmaed.cutepuppymod;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

/**
 * Created by manmaed on 31/05/2017.
 */
public class CPMConfigGUI  extends GuiConfig {
    public CPMConfigGUI(GuiScreen parent) {
        super(parent,
                new ConfigElement(CutePuppyMod.configFile.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                "CutePuppyMod", false, false, GuiConfig.getAbridgedConfigPath(CutePuppyMod.configFile.toString()));
    }
}
