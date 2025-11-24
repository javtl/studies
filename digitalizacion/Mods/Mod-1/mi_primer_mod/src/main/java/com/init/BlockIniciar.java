package com.init;

import com.Tutorialmod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs; // Cambiar esto a CreativeModeTab si no estás usando la versión de 1.19
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockIniciar {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorialmod.MODID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = register(
            "example_block", // Cambia el uso de `name:` a solo el nombre como string
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).friction(0.98f)),
            new Item.Properties().tab(CreativeModeTabs.BUILDING_BLOCKS) // Asegúrate de que estás usando el tab correcto
    );  // Cierra el paréntesis aquí

    private static <T extends Block> RegistryObject<T> register( // Cambia `RegistryIbject` a `RegistryObject`
                                                                 String name,
                                                                 Supplier<T> supplier,
                                                                 Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
