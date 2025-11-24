/*    */ package es.druedam.expansionmod.worldgen;
/*    */ 
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.HolderGetter;
/*    */ import net.minecraft.core.HolderSet;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.data.worldgen.BootstapContext;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.BiomeTags;
/*    */ import net.minecraft.world.level.biome.Biome;
/*    */ import net.minecraft.world.level.levelgen.GenerationStep;
/*    */ import net.minecraft.world.level.levelgen.placement.PlacedFeature;
/*    */ import net.minecraftforge.common.world.BiomeModifier;
/*    */ import net.minecraftforge.common.world.ForgeBiomeModifiers;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModBiomeModifiers
/*    */ {
/* 25 */   public static final ResourceKey<BiomeModifier> ADD_FLUORITE_SEVEN_ORE = registerKey("add_fluorite_seven_ore");
/* 26 */   public static final ResourceKey<BiomeModifier> ADD_FLUORITE_FIVE_ORE = registerKey("add_fluorite_five_ore");
/* 27 */   public static final ResourceKey<BiomeModifier> ADD_FLUORITE_TWO_ORE = registerKey("add_fluorite_two_ore");
/*    */ 
/*    */   
/*    */   public static void bootstrap(BootstapContext<BiomeModifier> context) {
/* 31 */     HolderGetter<PlacedFeature> placedFeatures = context.m_255420_(Registries.f_256988_);
/* 32 */     HolderGetter<Biome> biomes = context.m_255420_(Registries.f_256952_);
/*    */     
/* 34 */     context.m_255272_(ADD_FLUORITE_SEVEN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier((HolderSet)biomes
/* 35 */           .m_254956_(BiomeTags.f_215817_), 
/* 36 */           (HolderSet)HolderSet.m_205809_(new Holder[] { (Holder)placedFeatures.m_255043_(ModPlacedFeatures.FLUORITE_ORE_PLACED_SEVEN_KEY) }, ), GenerationStep.Decoration.UNDERGROUND_ORES));
/*    */ 
/*    */     
/* 39 */     context.m_255272_(ADD_FLUORITE_FIVE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier((HolderSet)biomes
/* 40 */           .m_254956_(BiomeTags.f_215817_), 
/* 41 */           (HolderSet)HolderSet.m_205809_(new Holder[] { (Holder)placedFeatures.m_255043_(ModPlacedFeatures.FLUORITE_ORE_PLACED_FIVE_KEY) }, ), GenerationStep.Decoration.UNDERGROUND_ORES));
/*    */ 
/*    */     
/* 44 */     context.m_255272_(ADD_FLUORITE_TWO_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier((HolderSet)biomes
/* 45 */           .m_254956_(BiomeTags.f_215817_), 
/* 46 */           (HolderSet)HolderSet.m_205809_(new Holder[] { (Holder)placedFeatures.m_255043_(ModPlacedFeatures.FLUORITE_ORE_PLACED_TWO_KEY) }, ), GenerationStep.Decoration.UNDERGROUND_ORES));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static ResourceKey<BiomeModifier> registerKey(String name) {
/* 52 */     return ResourceKey.m_135785_(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation("druedams_expansion_mod", name));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\worldgen\ModBiomeModifiers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */