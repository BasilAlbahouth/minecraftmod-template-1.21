package net.basil.tutorialmod.item;

import net.basil.tutorialmod.MinecraftMod;
import net.basil.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MinecraftMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItem.PINK_GRANET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItem.RAW_PINK_GARNET);
                        entries.add(ModItem.PINK_GRANET);
                    }).build());

    public static final ItemGroup PINK_GARNET_Block = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MinecraftMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                    }).build());

    public static void registerItemGroups(){
        MinecraftMod.LOGGER.info("Registering Item Groups for" + MinecraftMod.MOD_ID);

    }
}
