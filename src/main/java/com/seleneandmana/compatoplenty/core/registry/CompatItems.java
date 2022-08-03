package com.seleneandmana.compatoplenty.core.registry;

import com.seleneandmana.compatoplenty.integrations.create.CompatSandPaperItem;
import com.simibubi.create.Create;
import com.simibubi.create.content.CreateItemGroup;
import com.simibubi.create.content.curiosities.tools.SandPaperItem;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatItems {
    public static final ItemSubRegistryHelper HELPER = CompatOPlenty.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> GLOWING_MOSS_PASTE = HELPER.createCompatItem("glowing_moss_paste", new Item.Properties(), CreativeModeTab.TAB_MATERIALS, CompatOPlenty.QUARK_ID);

    // Sandpaper
    public static final RegistryObject<Item> BLACK_SANDPAPER = HELPER.createItem("black_sandpaper",() -> new CompatSandPaperItem(new Item.Properties().tab(BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.CREATE_ID) ? CreateItemGroup.TAB_TOOLS : null)));
    public static final RegistryObject<Item> ORANGE_SANDPAPER = HELPER.createItem("orange_sandpaper",() -> new CompatSandPaperItem(new Item.Properties().tab(BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.CREATE_ID) ? CreateItemGroup.TAB_TOOLS : null)));
    public static final RegistryObject<Item> WHITE_SANDPAPER = HELPER.createItem("white_sandpaper",() -> new CompatSandPaperItem(new Item.Properties().tab(BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.CREATE_ID) ? CreateItemGroup.TAB_TOOLS : null)));
}
