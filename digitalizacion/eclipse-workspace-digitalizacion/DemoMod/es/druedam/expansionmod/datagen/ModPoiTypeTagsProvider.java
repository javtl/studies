/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraft.data.tags.PoiTypeTagsProvider;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.PoiTypeTags;
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
/*    */ 
/*    */ 
/*    */ public class ModPoiTypeTagsProvider
/*    */   extends PoiTypeTagsProvider
/*    */ {
/*    */   public ModPoiTypeTagsProvider(PackOutput p_256012_, CompletableFuture<HolderLookup.Provider> p_256617_, @Nullable ExistingFileHelper existingFileHelper) {
/* 28 */     super(p_256012_, p_256617_, "druedams_expansion_mod", existingFileHelper);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_6577_(HolderLookup.Provider pProvider) {
/* 33 */     m_206424_(PoiTypeTags.f_215875_).m_176839_(new ResourceLocation("druedams_expansion_mod", "sound_poi"));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModPoiTypeTagsProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */