package hackathon.qolmods.client;


import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ArmourHPHud implements HudElementRegistry {
    public static final Identifier HUD_ID = Identifier.of("armourhud:armour_display");


    public static void register() {
        // Adds the HUD element
        // drawContext draws the hud using int variables
        // Tick counter updates the HP every tick
        // addLast applies the hud
        // HUD_ID is an Identifier object, and it's used to identify something from the game
        HudElementRegistry.addLast(HUD_ID, (drawContext, tickCounter) -> {
            MinecraftClient client = MinecraftClient.getInstance();
            // Literally if player is not existing in the client, then no hud rendering.
            if (client.player == null) {
                return;
            }

            // Responsible for rendering specifically the text
            TextRenderer textHud = client.textRenderer;

            // Getting value for the screen size (to find optimal spot for hud element)

            int screenWidth = MinecraftClient.getInstance().getWindow().getScaledWidth();
            int screenHeight = MinecraftClient.getInstance().getWindow().getScaledHeight();

            // Positions element right side next to hotbar
            int x = screenWidth / 2 + 101;
            int y = screenHeight - 17;
            // Represents a stack of items. This is a data container that holds the item count and the stack's components.
            for (ItemStack)
        });


    }
}
