package net.zeta.zeta_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zeta.zeta_mod.ZetaMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZetaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ZETA_TAB = CREATIVE_MODE_TABS.register("zeta_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRAVESWORD.get()))
                    .title(Component.translatable("creativetab.zeta_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SWORDOFTHEBRAVE.get());
                        output.accept(ModItems.BRAVESWORD.get());
                        output.accept(ModItems.GARRY.get());
                        output.accept(ModItems.METAL_DETECTOR.get());


                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
