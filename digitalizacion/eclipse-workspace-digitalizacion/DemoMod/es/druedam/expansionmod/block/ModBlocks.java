/*    */ package es.druedam.expansionmod.block;
/*    */ 
/*    */ import es.druedam.expansionmod.block.custom.PizzaBlock;
/*    */ import es.druedam.expansionmod.block.custom.StrawberryCropBlock;
/*    */ import es.druedam.expansionmod.block.custom.TomatoCropBlock;
/*    */ import es.druedam.expansionmod.item.ModItems;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.util.valueproviders.IntProvider;
/*    */ import net.minecraft.util.valueproviders.UniformInt;
/*    */ import net.minecraft.world.item.BlockItem;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.DropExperienceBlock;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModBlocks
/*    */ {
/* 33 */   public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "druedams_expansion_mod");
/*    */   
/* 35 */   public static final RegistryObject<Block> ORE_FLUORITE = registerBlock("ore_fluorite", () -> new DropExperienceBlock(BlockBehaviour.Properties.m_60926_((BlockBehaviour)Blocks.f_49996_), (IntProvider)UniformInt.m_146622_(2, 5)));
/*    */ 
/*    */   
/* 38 */   public static final RegistryObject<Block> DEEPSLATE_FLUORITE = registerBlock("deepslate_fluorite", () -> new DropExperienceBlock(BlockBehaviour.Properties.m_60926_((BlockBehaviour)Blocks.f_152468_), (IntProvider)UniformInt.m_146622_(3, 7)));
/*    */ 
/*    */   
/* 41 */   public static final RegistryObject<Block> PIZZA = registerBlock("pizza", () -> new PizzaBlock(BlockBehaviour.Properties.m_60926_((BlockBehaviour)Blocks.f_50041_).m_222994_()), 1);
/*    */ 
/*    */   
/* 44 */   public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("tomato_crop", () -> new TomatoCropBlock(BlockBehaviour.Properties.m_60926_((BlockBehaviour)Blocks.f_50092_).m_60910_().m_60955_()));
/*    */ 
/*    */   
/* 47 */   public static final RegistryObject<Block> STRAWBERRY_CROP = BLOCKS.register("strawberry_crop", () -> new StrawberryCropBlock(BlockBehaviour.Properties.m_60926_((BlockBehaviour)Blocks.f_50092_).m_60910_().m_60955_()));
/*    */ 
/*    */   
/*    */   private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, int maxStacks) {
/* 51 */     RegistryObject<T> toReturn = BLOCKS.register(name, block);
/* 52 */     registerBlockItem(name, toReturn, maxStacks);
/* 53 */     return toReturn;
/*    */   }
/*    */   
/*    */   private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
/* 57 */     RegistryObject<T> toReturn = BLOCKS.register(name, block);
/* 58 */     registerBlockItem(name, toReturn);
/* 59 */     return toReturn;
/*    */   }
/*    */   
/*    */   private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
/* 63 */     return ModItems.ITEMS.register(name, () -> new BlockItem((Block)block.get(), new Item.Properties()));
/*    */   }
/*    */   
/*    */   private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, int maxStacks) {
/* 67 */     return ModItems.ITEMS.register(name, () -> new BlockItem((Block)block.get(), (new Item.Properties()).m_41487_(maxStacks)));
/*    */   }
/*    */ 
/*    */   
/*    */   public static void register(IEventBus eventBus) {
/* 72 */     BLOCKS.register(eventBus);
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\block\ModBlocks.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */