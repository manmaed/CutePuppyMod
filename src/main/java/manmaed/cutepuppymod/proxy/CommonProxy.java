package manmaed.cutepuppymod.proxy;

import manmaed.cutepuppymod.client.render.peoples.PuppyList;

public class CommonProxy {

    public PuppyList list;

    public void preInit() {
        list = new PuppyList();
    }
    public void init() {
        list.getLatestList();
    }
    public void renderInformation(){
		
	}
}
