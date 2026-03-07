package net.maketendo.tardifmod.main.items.extendable;

import net.maketendo.tardifmod.main.TARDIFComponents;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import java.util.function.Consumer;

public class LinkableItem extends Item {

    public LinkableItem(Properties settings) {
        super(settings);
    }

    public static void setLinkedId(ItemStack stack, int id) {stack.set(TARDIFComponents.LINKED_ID, id);}
    public static boolean hasLinkedId(ItemStack stack) {return stack.has(TARDIFComponents.LINKED_ID);}
    public static int getLinkedId(ItemStack stack) {return stack.getOrDefault(TARDIFComponents.LINKED_ID, -1);}
    public static void clearLinkedId(ItemStack stack) {stack.remove(TARDIFComponents.LINKED_ID);}

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context,
                              TooltipDisplay displayComponent,
                              Consumer<Component> textConsumer, TooltipFlag type) {

        super.appendHoverText(stack, context, displayComponent, textConsumer, type);

        if (hasLinkedId(stack)) {

            textConsumer.accept(
                    Component.translatable("tooltip.tardif_mod.linkable_item.id")
                            .withStyle(ChatFormatting.GRAY)
            );

            textConsumer.accept(
                    Component.literal(String.valueOf(getLinkedId(stack)))
                            .withStyle(ChatFormatting.BLUE)
            );

        } else {

            textConsumer.accept(
                    Component.translatable("tooltip.tardif_mod.linkable_item.1")
                            .withStyle(ChatFormatting.GRAY)
            );

            textConsumer.accept(
                    Component.translatable("tooltip.tardif_mod.linkable_item.2")
                            .withStyle(ChatFormatting.GRAY)
            );
        }
    }
}
