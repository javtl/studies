/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraft.data.loot.BlockLootSubProvider;
/*    */ import net.minecraft.data.loot.LootTableProvider;
/*    */ import net.minecraft.world.flag.FeatureFlagSet;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
/*    */ 
/*    */ public class ModLootTableProvider
/*    */   extends BlockLootSubProvider
/*    */ {
/*    */   protected ModLootTableProvider(Set<Item> pExplosionResistant, FeatureFlagSet pEnabledFeatures) {
/* 17 */     super(pExplosionResistant, pEnabledFeatures);
/*    */   }
/*    */   
/*    */   public static LootTableProvider create(PackOutput output) {
/* 21 */     return new LootTableProvider(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(es.druedam.expansionmod.datagen.loot.ModBlockLootTables::new, LootContextParamSets.f_81421_)));
/*    */   }
/*    */   
/*    */   protected void m_245660_() {}
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModLootTableProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */