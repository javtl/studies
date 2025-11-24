/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.data.DataGenerator;
/*    */ import net.minecraft.data.DataProvider;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraftforge.common.data.ExistingFileHelper;
/*    */ import net.minecraftforge.data.event.GatherDataEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(modid = "druedams_expansion_mod", bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class DataGenerators
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void gatherData(GatherDataEvent event) {
/* 34 */     DataGenerator generator = event.getGenerator();
/* 35 */     PackOutput packOutput = generator.getPackOutput();
/* 36 */     ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
/* 37 */     CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
/*    */ 
/*    */     
/* 40 */     generator.addProvider(event.includeServer(), (DataProvider)ModLootTableProvider.create(packOutput));
/* 41 */     generator.addProvider(event.includeServer(), (DataProvider)new ModRecipeProvider(packOutput));
/*    */     
/* 43 */     generator.addProvider(event.includeClient(), (DataProvider)new ModItemModelProvider(packOutput, existingFileHelper));
/* 44 */     generator.addProvider(event.includeClient(), (DataProvider)new ModBlockStateProvider(packOutput, existingFileHelper));
/*    */     
/* 46 */     generator.addProvider(event.includeServer(), (DataProvider)new ModGlobalLootModifiersProvider(packOutput));
/*    */     
/* 48 */     ModBlockTagGenerator blockTagGenerator = (ModBlockTagGenerator)generator.addProvider(event.includeServer(), (DataProvider)new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
/*    */     
/* 50 */     generator.addProvider(event.includeServer(), (DataProvider)new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.m_274426_(), existingFileHelper));
/*    */     
/* 52 */     generator.addProvider(event.includeServer(), (DataProvider)new ModWorldGenProvider(packOutput, lookupProvider));
/* 53 */     generator.addProvider(event.includeServer(), (DataProvider)new ModPoiTypeTagsProvider(packOutput, lookupProvider, existingFileHelper));
/* 54 */     generator.addProvider(event.includeClient(), (DataProvider)new ModPaintingVariantTagProvider(packOutput, lookupProvider, existingFileHelper));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\DataGenerators.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */