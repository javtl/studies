/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import es.druedam.expansionmod.block.ModBlocks;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraftforge.common.data.BlockTagsProvider;
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
/*    */ public class ModBlockTagGenerator
/*    */   extends BlockTagsProvider
/*    */ {
/*    */   public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
/* 25 */     super(output, lookupProvider, "druedams_expansion_mod", existingFileHelper);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void m_6577_(HolderLookup.Provider provider) {
/* 31 */     m_206424_(BlockTags.f_144282_)
/* 32 */       .m_255245_(ModBlocks.ORE_FLUORITE.get())
/* 33 */       .m_255245_(ModBlocks.DEEPSLATE_FLUORITE.get());
/*    */ 
/*    */     
/* 36 */     m_206424_(BlockTags.f_144285_)
/* 37 */       .m_255245_(ModBlocks.ORE_FLUORITE.get())
/* 38 */       .m_255245_(ModBlocks.DEEPSLATE_FLUORITE.get());
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModBlockTagGenerator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */