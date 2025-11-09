package com.melina.homecompass;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LodestoneTrackerComponent;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.CompassItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.GlobalPos;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.function.Consumer;

public class HomeCompassItem extends CompassItem {
    public HomeCompassItem(Settings s){ super(s.maxCount(1)); }

    @Override
    public ActionResult useOnBlock(ItemUsageContext ctx){
        World w = ctx.getWorld();
        PlayerEntity p = ctx.getPlayer();
        BlockPos pos = ctx.getBlockPos();
        if(!w.isClient() && p!=null){
            ItemStack stack = ctx.getStack();
            stack.set(DataComponentTypes.LODESTONE_TRACKER,
                    new LodestoneTrackerComponent(
                            Optional.of(GlobalPos.create(w.getRegistryKey(), pos)),
                            true // tracked = true so it points to target
                    )
            );
            p.sendMessage(Text.literal("🏠 Home set to "+pos.getX()+", "+pos.getY()+", "+pos.getZ())
                    .formatted(Formatting.GREEN), true);
        }
        return ActionResult.SUCCESS;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext c,
                              TooltipDisplayComponent disp, Consumer<Text> add, TooltipType type){
        LodestoneTrackerComponent tr = stack.get(DataComponentTypes.LODESTONE_TRACKER);
        if(tr!=null && tr.target().isPresent()){
            BlockPos p = tr.target().get().pos();
            add.accept(Text.literal("Home: "+p.getX()+", "+p.getY()+", "+p.getZ()).formatted(Formatting.GRAY));
        } else {
            add.accept(Text.literal("Right-click a block to set your home.").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, c, disp, add, type);
    }
}
