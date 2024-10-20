package net.leonmonkeygamer.invasion.item;

import net.leonmonkeygamer.invasion.invasion;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, invasion.MODID);

    public static final RegistryObject<Item> NEXUS_CATALYST = ITEMS.register("nexus_catalyst",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PHASE_CRYSTAL = ITEMS.register("phase_crystal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
