package hackathon.qolmods.ui;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;

public class ItemReplacer {
    private static final int HOTBAR_SIZE = 9;
    /**
     * Replace selected item with another suitable item from inventory by looping
     * through the player's inventory and exclude.
     * @param state
     * @param player
     */
    public void replaceToolInHand(BlockState state, PlayerEntity player) {
        PlayerInventory inventory = player.getInventory();
        int currentSlot = inventory.getSelectedSlot();

        for (int i = 0; i < inventory.size(); i++) {
            // Skip if slot is the one being replaced
            if (i == currentSlot) continue;
            ItemStack stack = inventory.getStack(i);
            // If stack being looped is is suitable for
            if (i > HOTBAR_SIZE - 1 && stack.isSuitableFor(state)) {
                inventory.setStack(currentSlot, stack);
                inventory.setStack(i, ItemStack.EMPTY);
                player.playerScreenHandler.syncState();
                break;
            }
        }
    }
}
