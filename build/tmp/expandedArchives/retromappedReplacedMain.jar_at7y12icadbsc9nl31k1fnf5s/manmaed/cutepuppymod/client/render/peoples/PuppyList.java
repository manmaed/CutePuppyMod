package manmaed.cutepuppymod.client.render.peoples;

import com.google.gson.Gson;
import manmaed.cutepuppymod.libs.Reference;
import net.minecraft.entity.player.EntityPlayer;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by manmaed on 20/08/2015.
 */
public class PuppyList
{
    private List<String> idList;

    public PuppyList() {
        idList = new ArrayList<String>();
    }
    public void getLatestList() {
        try {
            idList.clear();
            Gson gson = new Gson();
            Reader file = new InputStreamReader(new URL(Reference.PUPPYURL).openStream());
            String[] json = gson.fromJson(file, String[].class);
            file.close();
            if (json != null) {
                for (String s : json) {
                    idList.add(s);
                }
            }
        } catch (Exception e) {

        }
    }

    public boolean isPuppy(EntityPlayer player) {
        return player != null && player.func_110124_au() != null && idList.contains(player.func_110124_au().toString());
    }


}
