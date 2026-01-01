package net.maketendo.tardifmod.main.items;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class LinkableItem extends Item {

    private static final String LINK_KEY = "LinkedId";

    public LinkableItem(Settings settings) {
        super(settings);
    }

    public static void setLinkedId(ItemStack stack, int id) {
        NbtCompound tag = stack
                .getOrDefault(DataComponentTypes.CUSTOM_DATA, NbtComponent.DEFAULT)
                .copyNbt();

        tag.putInt(LINK_KEY, id);
        stack.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(tag));
    }

    public static boolean hasLinkedId(ItemStack stack) {
        NbtComponent comp = stack.get(DataComponentTypes.CUSTOM_DATA);
        return comp != null && comp.copyNbt().contains(LINK_KEY);
    }

    public static int getLinkedId(ItemStack stack) {
        if (!hasLinkedId(stack)) return -1;
        return stack.get(DataComponentTypes.CUSTOM_DATA).copyNbt().getInt(LINK_KEY, -1);
    }

    public static void clearLinkedId(ItemStack stack) {
        NbtCompound tag = stack
                .getOrDefault(DataComponentTypes.CUSTOM_DATA, NbtComponent.DEFAULT)
                .copyNbt();

        tag.remove(LINK_KEY);
        stack.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(tag));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);

        if (hasLinkedId(stack)) {
            textConsumer.accept(
                    Text.translatable("tooltip.tardif_mod.linkable_item.id")
                            .formatted(Formatting.BLUE)
            );

            textConsumer.accept(
                    Text.literal(String.valueOf(getLinkedId(stack)))
                            .formatted(Formatting.GRAY)
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
