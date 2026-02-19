package net.maketendo.tardifmod.main.items.extendable;

import net.maketendo.tardifmod.main.TARDIFComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class LinkableItem extends Item {

    public LinkableItem(Settings settings) {
        super(settings);
    }

    public static void setLinkedId(ItemStack stack, int id) {stack.set(TARDIFComponents.LINKED_ID, id);}
    public static boolean hasLinkedId(ItemStack stack) {return stack.contains(TARDIFComponents.LINKED_ID);}
    public static int getLinkedId(ItemStack stack) {return stack.getOrDefault(TARDIFComponents.LINKED_ID, -1);}
    public static void clearLinkedId(ItemStack stack) {stack.remove(TARDIFComponents.LINKED_ID);}

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context,
                              TooltipDisplayComponent displayComponent,
                              Consumer<Text> textConsumer, TooltipType type) {

        super.appendTooltip(stack, context, displayComponent, textConsumer, type);

        if (hasLinkedId(stack)) {

            textConsumer.accept(
                    Text.translatable("tooltip.tardif_mod.linkable_item.id")
                            .formatted(Formatting.GRAY)
            );

            textConsumer.accept(
                    Text.literal(String.valueOf(getLinkedId(stack)))
                            .formatted(Formatting.BLUE)
            );

        } else {

            textConsumer.accept(
                    Text.translatable("tooltip.tardif_mod.linkable_item.1")
                            .formatted(Formatting.GRAY)
            );

            textConsumer.accept(
                    Text.translatable("tooltip.tardif_mod.linkable_item.2")
                            .formatted(Formatting.GRAY)
            );
        }
    }
}
