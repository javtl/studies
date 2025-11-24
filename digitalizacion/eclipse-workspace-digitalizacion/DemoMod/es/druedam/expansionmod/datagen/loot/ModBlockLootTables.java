/*    */ package es.druedam.expansionmod.datagen.loot;
/*    */ 
/*    */ import es.druedam.expansionmod.block.ModBlocks;
/*    */ import es.druedam.expansionmod.block.custom.StrawberryCropBlock;
/*    */ import es.druedam.expansionmod.block.custom.TomatoCropBlock;
/*    */ import es.druedam.expansionmod.item.ModItems;
/*    */ import java.util.Objects;
/*    */ import java.util.Set;
/*    */ import net.minecraft.advancements.critereon.StatePropertiesPredicate;
/*    */ import net.minecraft.data.loot.BlockLootSubProvider;
/*    */ import net.minecraft.world.flag.FeatureFlags;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.storage.loot.LootPool;
/*    */ import net.minecraft.world.level.storage.loot.LootTable;
/*    */ import net.minecraft.world.level.storage.loot.entries.LootItem;
/*    */ import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
/*    */ import net.minecraft.world.level.storage.loot.functions.FunctionUserBuilder;
/*    */ import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
/*    */ import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
/*    */ import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
/*    */ import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
/*    */ import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
/*    */ import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModBlockLootTables
/*    */   extends BlockLootSubProvider
/*    */ {
/*    */   public ModBlockLootTables() {
/* 36 */     super(Set.of(), FeatureFlags.f_244280_.m_247355_());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void m_245660_() {
/* 44 */     LootItemBlockStatePropertyCondition.Builder builder1 = LootItemBlockStatePropertyCondition.m_81769_((Block)ModBlocks.TOMATO_CROP.get()).m_81784_(StatePropertiesPredicate.Builder.m_67693_().m_67694_((Property)TomatoCropBlock.AGE, 4));
/*    */     
/* 46 */     m_247577_((Block)ModBlocks.TOMATO_CROP.get(), (LootTable.Builder)
/* 47 */         m_246108_((ItemLike)ModBlocks.TOMATO_CROP.get(), 
/* 48 */           (FunctionUserBuilder)LootTable.m_79147_()
/* 49 */           .m_79161_(LootPool.m_79043_()
/* 50 */             .m_79076_((LootPoolEntryContainer.Builder)LootItem.m_79579_((ItemLike)ModItems.TOMATO_SEEDS.get())))
/* 51 */           .m_79161_(LootPool.m_79043_()
/* 52 */             .m_79080_((LootItemCondition.Builder)builder1)
/* 53 */             .m_79076_((LootPoolEntryContainer.Builder)LootItem.m_79579_((ItemLike)ModItems.TOMATO_SEEDS.get())
/* 54 */               .m_79078_(
/* 55 */                 (LootItemFunction.Builder)SetItemCountFunction.m_165412_((NumberProvider)UniformGenerator.m_165780_(1.0F, 2.0F)))))
/* 56 */           .m_79161_(LootPool.m_79043_()
/* 57 */             .m_79080_((LootItemCondition.Builder)builder1)
/* 58 */             .m_79076_((LootPoolEntryContainer.Builder)LootItem.m_79579_((ItemLike)ModItems.TOMATO.get())
/* 59 */               .m_79078_(
/* 60 */                 (LootItemFunction.Builder)SetItemCountFunction.m_165412_((NumberProvider)UniformGenerator.m_165780_(2.0F, 3.0F)))))));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 66 */     LootItemBlockStatePropertyCondition.Builder builder2 = LootItemBlockStatePropertyCondition.m_81769_((Block)ModBlocks.STRAWBERRY_CROP.get()).m_81784_(StatePropertiesPredicate.Builder.m_67693_().m_67694_((Property)StrawberryCropBlock.AGE, 7));
/*    */     
/* 68 */     m_247577_((Block)ModBlocks.STRAWBERRY_CROP.get(), (LootTable.Builder)
/* 69 */         m_246108_((ItemLike)ModBlocks.STRAWBERRY_CROP.get(), 
/* 70 */           (FunctionUserBuilder)LootTable.m_79147_()
/* 71 */           .m_79161_(LootPool.m_79043_()
/* 72 */             .m_79076_((LootPoolEntryContainer.Builder)LootItem.m_79579_((ItemLike)ModItems.STRAWBERRY_SEEDS.get())))
/* 73 */           .m_79161_(LootPool.m_79043_()
/* 74 */             .m_79080_((LootItemCondition.Builder)builder2)
/* 75 */             .m_79076_((LootPoolEntryContainer.Builder)LootItem.m_79579_((ItemLike)ModItems.STRAWBERRY_SEEDS.get())
/* 76 */               .m_79078_(
/* 77 */                 (LootItemFunction.Builder)SetItemCountFunction.m_165412_((NumberProvider)UniformGenerator.m_165780_(1.0F, 2.0F)))))
/* 78 */           .m_79161_(LootPool.m_79043_()
/* 79 */             .m_79080_((LootItemCondition.Builder)builder2)
/* 80 */             .m_79076_((LootPoolEntryContainer.Builder)LootItem.m_79579_((ItemLike)ModItems.STRAWBERRY.get())
/* 81 */               .m_79078_(
/* 82 */                 (LootItemFunction.Builder)SetItemCountFunction.m_165412_((NumberProvider)UniformGenerator.m_165780_(2.0F, 3.0F)))))));
/*    */ 
/*    */     
/* 85 */     m_246481_((Block)ModBlocks.ORE_FLUORITE.get(), block -> m_246109_((Block)ModBlocks.ORE_FLUORITE.get(), (Item)ModItems.FLUORITE_INGOT.get()).m_79078_((LootItemFunction.Builder)SetItemCountFunction.m_165412_((NumberProvider)UniformGenerator.m_165780_(1.0F, 2.0F))));
/*    */ 
/*    */     
/* 88 */     m_246481_((Block)ModBlocks.DEEPSLATE_FLUORITE.get(), block -> m_246109_((Block)ModBlocks.DEEPSLATE_FLUORITE.get(), (Item)ModItems.FLUORITE_INGOT.get()).m_79078_((LootItemFunction.Builder)SetItemCountFunction.m_165412_((NumberProvider)UniformGenerator.m_165780_(1.0F, 2.0F))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected Iterable<Block> getKnownBlocks() {
/* 95 */     Objects.requireNonNull(ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)); return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\loot\ModBlockLootTables.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */