/*    */ package es.druedam.expansionmod.worldgen;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.HolderGetter;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.data.worldgen.BootstapContext;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.levelgen.VerticalAnchor;
/*    */ import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
/*    */ import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
/*    */ import net.minecraft.world.level.levelgen.placement.PlacedFeature;
/*    */ import net.minecraft.world.level.levelgen.placement.PlacementModifier;
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
/*    */ public class ModPlacedFeatures
/*    */ {
/* 28 */   public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_SEVEN_KEY = registerKey("fluorite_ore_placed_seven");
/*    */   
/* 30 */   public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_FIVE_KEY = registerKey("fluorite_ore_placed_five");
/*    */   
/* 32 */   public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_TWO_KEY = registerKey("fluorite_ore_placed_two");
/*    */   
/*    */   public static void bootstrap(BootstapContext<PlacedFeature> context) {
/* 35 */     HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.m_255420_(Registries.f_256911_);
/*    */     
/* 37 */     register(context, FLUORITE_ORE_PLACED_SEVEN_KEY, (Holder<ConfiguredFeature<?, ?>>)configuredFeatures.m_255043_(ModConfiguredFeatures.OVERWORLD_FLUORITE_ORE_KEY), 
/* 38 */         ModOrePlacement.commonOrePlacement(7, 
/* 39 */           (PlacementModifier)HeightRangePlacement.m_191680_(VerticalAnchor.m_158930_(-30), VerticalAnchor.m_158930_(80))));
/*    */     
/* 41 */     register(context, FLUORITE_ORE_PLACED_FIVE_KEY, (Holder<ConfiguredFeature<?, ?>>)configuredFeatures.m_255043_(ModConfiguredFeatures.OVERWORLD_DEEPSLATE_FLUORITE_ORE_KEY), 
/* 42 */         ModOrePlacement.commonOrePlacement(5, 
/* 43 */           (PlacementModifier)HeightRangePlacement.m_191680_(VerticalAnchor.m_158930_(-50), VerticalAnchor.m_158930_(80))));
/*    */     
/* 45 */     register(context, FLUORITE_ORE_PLACED_TWO_KEY, (Holder<ConfiguredFeature<?, ?>>)configuredFeatures.m_255043_(ModConfiguredFeatures.OVERWORLD_DEEPSLATE_FLUORITE_ORE_KEY), 
/* 46 */         ModOrePlacement.rareOrePlacement(2, 
/* 47 */           (PlacementModifier)HeightRangePlacement.m_191692_(VerticalAnchor.m_158930_(-50), VerticalAnchor.m_158930_(80))));
/*    */   }
/*    */ 
/*    */   
/*    */   private static ResourceKey<PlacedFeature> registerKey(String name) {
/* 52 */     return ResourceKey.m_135785_(Registries.f_256988_, new ResourceLocation("druedams_expansion_mod", name));
/*    */   }
/*    */ 
/*    */   
/*    */   private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
/* 57 */     context.m_255272_(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\worldgen\ModPlacedFeatures.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */