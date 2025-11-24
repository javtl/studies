/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraft.data.tags.PaintingVariantTagsProvider;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.PaintingVariantTags;
/*    */ import net.minecraftforge.common.data.ExistingFileHelper;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ public class ModPaintingVariantTagProvider
/*    */   extends PaintingVariantTagsProvider
/*    */ {
/*    */   public ModPaintingVariantTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
/* 26 */     super(packOutput, future, "druedams_expansion_mod", existingFileHelper);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_6577_(HolderLookup.Provider pProvider) {
/* 31 */     m_206424_(PaintingVariantTags.f_215870_)
/* 32 */       .m_176839_(new ResourceLocation("druedams_expansion_mod", "mouse"))
/* 33 */       .m_176839_(new ResourceLocation("druedams_expansion_mod", "sad_mouse"))
/* 34 */       .m_176839_(new ResourceLocation("druedams_expansion_mod", "ultrakill"))
/* 35 */       .m_176839_(new ResourceLocation("druedams_expansion_mod", "rodrick"))
/* 36 */       .m_176839_(new ResourceLocation("druedams_expansion_mod", "spain_flag"))
/* 37 */       .m_176839_(new ResourceLocation("druedams_expansion_mod", "brocoli"))
/* 38 */       .m_176839_(new ResourceLocation("druedams_expansion_mod", "michael_jackson"))
/* 39 */       .m_176839_(new ResourceLocation("druedams_expansion_mod", "among_us"));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModPaintingVariantTagProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */