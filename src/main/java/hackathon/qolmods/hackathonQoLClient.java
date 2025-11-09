package hackathon.qolmods;

import net.fabricmc.api.ClientModInitializer;

public class hackathonQoLClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[QoLMods] client init");
        // client-only setup (render layers, keybinds, screens) goes here
    }
}
