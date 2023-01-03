package com.nikkolaka.lostcraft.registry;

import com.nikkolaka.lostcraft.LostCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;


public class ModItems {

    public static final Item STRAIGHT_SWORD = new Item(new FabricItemSettings().maxCount(1));


    public static void registerItems(){
        Registry.register(Registries.ITEM, new Identifier(LostCraft.MOD_ID,"straight_sword"), STRAIGHT_SWORD);
    }

}
