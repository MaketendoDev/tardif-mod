package net.maketendo.tardifmod.main.items;

import net.maketendo.tardifmod.main.items.extendable.LinkableItem;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class TardisKeyItem extends LinkableItem {

    private final String material;

    public TardisKeyItem(Settings settings, String material) {
        super(settings);
        this.material = material;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context,
                              TooltipDisplayComponent displayComponent,
                              Consumer<Text> textConsumer, TooltipType type) {

        super.appendTooltip(stack, context, displayComponent, textConsumer, type);

        textConsumer.accept(Text.empty());

        textConsumer.accept(
                Text.translatable("tooltip.tardif_mod.tardis_key.type")
                        .formatted(Formatting.GRAY)
        );

        textConsumer.accept(
                Text.literal(material)
                        .formatted(Formatting.BLUE)
        );
    }
}

