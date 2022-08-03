package com.seleneandmana.compatoplenty.integrations.create;

import com.simibubi.create.AllItems;
import com.simibubi.create.content.curiosities.tools.SandPaperItem;
import com.teamabnormals.blueprint.core.util.item.filling.TargetedItemCategoryFiller;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import vectorwing.farmersdelight.common.registry.ModItems;

public class CompatSandPaperItem extends SandPaperItem {

    private static final TargetedItemCategoryFiller FILLER = new TargetedItemCategoryFiller(AllItems.RED_SAND_PAPER::get);

    public CompatSandPaperItem(Properties properties) {
        super(properties);
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> item) {
        FILLER.fillItem(this.asItem(), tab, item);
    }
}
