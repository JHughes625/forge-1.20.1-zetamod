package net.zeta.zeta_mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zeta.zeta_mod.ZetaMod;
import net.zeta.zeta_mod.item.custom.BraveSwordItem;
import net.zeta.zeta_mod.item.custom.SwordOfTheBraveItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZetaMod.MOD_ID);


    public static final RegistryObject<Item> BRAVESWORD = ITEMS.register("swordofthebrave",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GARRY = ITEMS.register("garry",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new BraveSwordItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> SWORDOFTHEBRAVE = ITEMS.register("sword_of_the_brave",
            () -> new SwordOfTheBraveItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
