package net.basil.tutorialmod.item;

import net.basil.tutorialmod.MinecraftMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {

    public static final Item PINK_GRANET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET =registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MinecraftMod.MOD_ID, name),item);
    }

    public static void registerModItem(){
        MinecraftMod.LOGGER.info("Registering Mod Items for " + MinecraftMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GRANET);
            entries.add(RAW_PINK_GARNET);
        });
    }

}
