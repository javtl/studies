/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import es.druedam.expansionmod.worldgen.ModBiomeModifiers;
/*    */ import es.druedam.expansionmod.worldgen.ModConfiguredFeatures;
/*    */ import es.druedam.expansionmod.worldgen.ModPlacedFeatures;
/*    */ import java.util.Set;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.core.RegistrySetBuilder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
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
/*    */ public class ModWorldGenProvider
/*    */   extends DatapackBuiltinEntriesProvider
/*    */ {
/* 29 */   public static final RegistrySetBuilder BUILDER = (new RegistrySetBuilder())
/* 30 */     .m_254916_(Registries.f_256911_, ModConfiguredFeatures::bootstrap)
/* 31 */     .m_254916_(Registries.f_256988_, ModPlacedFeatures::bootstrap)
/* 32 */     .m_254916_(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
/*    */ 
/*    */   
/*    */   public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
/* 36 */     super(output, registries, BUILDER, Set.of("druedams_expansion_mod"));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModWorldGenProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */