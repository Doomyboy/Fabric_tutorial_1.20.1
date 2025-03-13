package net.doomwolf.tutorialmod.block;

import net.doomwolf.tutorialmod.TutorialMod;
import net.doomwolf.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups{
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "pink_garnet"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pink_garnet"))
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
                    }).build());

    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Regiserting Item Groups for " + TutorialMod.MOD_ID);
    }
}
