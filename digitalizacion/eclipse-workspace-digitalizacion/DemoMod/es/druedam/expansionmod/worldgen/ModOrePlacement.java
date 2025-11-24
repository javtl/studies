/*    */ package es.druedam.expansionmod.worldgen;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.minecraft.world.level.levelgen.placement.BiomeFilter;
/*    */ import net.minecraft.world.level.levelgen.placement.CountPlacement;
/*    */ import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
/*    */ import net.minecraft.world.level.levelgen.placement.PlacementModifier;
/*    */ import net.minecraft.world.level.levelgen.placement.RarityFilter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModOrePlacement
/*    */ {
/*    */   public static List<PlacementModifier> orePlacement(PlacementModifier pCountPlacement, PlacementModifier pHeightRange) {
/* 17 */     return (List)List.of(pCountPlacement, InSquarePlacement.m_191715_(), pHeightRange, BiomeFilter.m_191561_());
/*    */   }
/*    */   
/*    */   public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
/* 21 */     return orePlacement((PlacementModifier)CountPlacement.m_191628_(pCount), pHeightRange);
/*    */   }
/*    */   
/*    */   public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
/* 25 */     return orePlacement((PlacementModifier)RarityFilter.m_191900_(pChance), pHeightRange);
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\worldgen\ModOrePlacement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */