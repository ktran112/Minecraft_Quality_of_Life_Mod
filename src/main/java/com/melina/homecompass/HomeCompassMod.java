package com.melina.homecompass;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class HomeCompassMod implements ModInitializer {
    public static final String MOD_ID = "homecompass";
    public static Identifier id(String p){ return Identifier.of(MOD_ID, p); }

    public static final RegistryKey<Item> HOME_COMPASS_KEY =
            RegistryKey.of(RegistryKeys.ITEM, id("home_compass"));

    public static Item HOME_COMPASS;

    @Override
    public void onInitialize() {
        System.out.println("[HomeCompass] init");
        HOME_COMPASS = Registry.register(
                Registries.ITEM,
                HOME_COMPASS_KEY,
                new HomeCompassItem(new Item.Settings()
                        .maxCount(1)
                        .registryKey(HOME_COMPASS_KEY))
        );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register(e -> e.add(HOME_COMPASS));
    }
}
