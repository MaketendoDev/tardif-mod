package net.maketendo.tardifmod.main.items;

import net.maketendo.tardifmod.main.items.extendable.LinkableItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import java.util.function.Consumer;

public class TardisKeyItem extends LinkableItem {

    private final String material;

    public TardisKeyItem(Properties settings, String material) {
        super(settings);
        this.material = material;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context,
                              TooltipDisplay displayComponent,
                              Consumer<Component> textConsumer, TooltipFlag type) {

        super.appendHoverText(stack, context, displayComponent, textConsumer, type);

        textConsumer.accept(Component.empty());

        textConsumer.accept(
                Component.translatable("tooltip.tardif_mod.tardis_key.type")
                        .withStyle(ChatFormatting.GRAY)
        );

        textConsumer.accept(
                Component.literal(material)
                        .withStyle(ChatFormatting.BLUE)
        );
    }
}

