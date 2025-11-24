/*    */ package es.druedam.expansionmod.item;
/*    */ 
/*    */ import es.druedam.expansionmod.util.ModTags;
/*    */ import java.util.List;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.item.Tier;
/*    */ import net.minecraft.world.item.Tiers;
/*    */ import net.minecraft.world.item.crafting.Ingredient;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.common.ForgeTier;
/*    */ import net.minecraftforge.common.TierSortingRegistry;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModToolTiers
/*    */ {
/* 23 */   public static final Tier FLUORITE = TierSortingRegistry.registerTier((Tier)new ForgeTier(5, 200, 6.0F, 2.0F, 14, ModTags.Blocks.NEEDS_FLUORITE, () -> Ingredient.m_43929_(new ItemLike[] { (ItemLike)ModItems.FLUORITE_INGOT.get() })), new ResourceLocation("druedams_expansion_mod", "fluorite"), 
/*    */ 
/*    */       
/* 26 */       List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\item\ModToolTiers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */