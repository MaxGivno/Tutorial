package dev.maxgivno.tutorial.proxy;

import dev.maxgivno.tutorial.Init.TutorialBlocks;
import dev.maxgivno.tutorial.Init.TutorialItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        TutorialBlocks.registerRenders();
        TutorialItems.registerRenders();
    }
}
