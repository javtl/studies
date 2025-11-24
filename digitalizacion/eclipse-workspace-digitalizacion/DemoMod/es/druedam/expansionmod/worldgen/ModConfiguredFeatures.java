/*    */ package es.druedam.expansionmod.worldgen;
/*    */ 
/*    */ import es.druedam.expansionmod.block.ModBlocks;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.data.worldgen.BootstapContext;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.Feature;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModConfiguredFeatures
/*    */ {
/* 28 */   public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FLUORITE_ORE_KEY = registerKey("flurite_ore_key");
/* 29 */   public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DEEPSLATE_FLUORITE_ORE_KEY = registerKey("deepslate_flurite_ore_key");
/*    */ 
/*    */   
/*    */   public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
/* 33 */     TagMatchTest tagMatchTest1 = new TagMatchTest(BlockTags.f_144266_);
/* 34 */     List<OreConfiguration.TargetBlockState> overworldFluoriteOres = List.of(OreConfiguration.m_161021_((RuleTest)tagMatchTest1, ((Block)ModBlocks.ORE_FLUORITE
/* 35 */           .get()).m_49966_()));
/*    */     
/* 37 */     TagMatchTest tagMatchTest2 = new TagMatchTest(BlockTags.f_144267_);
/* 38 */     List<OreConfiguration.TargetBlockState> overworldFluoriteOres2 = List.of(OreConfiguration.m_161021_((RuleTest)tagMatchTest2, ((Block)ModBlocks.DEEPSLATE_FLUORITE
/* 39 */           .get()).m_49966_()));
/*    */     
/* 41 */     register(context, OVERWORLD_FLUORITE_ORE_KEY, Feature.f_65731_, new OreConfiguration(overworldFluoriteOres, 9));
/* 42 */     register(context, OVERWORLD_DEEPSLATE_FLUORITE_ORE_KEY, Feature.f_65731_, new OreConfiguration(overworldFluoriteOres2, 9));
/*    */   }
/*    */   
/*    */   public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
/* 46 */     return ResourceKey.m_135785_(Registries.f_256911_, new ResourceLocation("druedams_expansion_mod", name));
/*    */   }
/*    */ 
/*    */   
/*    */   private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
/* 51 */     context.m_255272_(key, new ConfiguredFeature((Feature)feature, (FeatureConfiguration)configuration));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\worldgen\ModConfiguredFeatures.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */