package net.leonmonkeygamer.invasion.item;

import net.leonmonkeygamer.invasion.Block.ModBlock;
import net.leonmonkeygamer.invasion.invasion;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, invasion.MODID);

    public static final RegistryObject<CreativeModeTab> INVASION_TAB = CREATIVE_MODE_TABS.register("invasion_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NEXUS_CATALYST.get()))
                    .title(Component.translatable("creativtab.inavsion_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.NEXUS_CATALYST.get());
                        pOutput.accept(ModBlock.NEXUS_BLOCK.get());
                        pOutput.accept(ModItems.PHASE_CRYSTAL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}

















