/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraft.data.tags.ItemTagsProvider;
/*    */ import net.minecraft.data.tags.TagsProvider;
/*    */ import net.minecraft.world.level.block.Block;
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
/*    */ public class ModItemTagGenerator
/*    */   extends ItemTagsProvider
/*    */ {
/*    */   public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagsProvider.TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
/* 25 */     super(p_275343_, p_275729_, p_275322_, "druedams_expansion_mod", existingFileHelper);
/*    */   }
/*    */   
/*    */   protected void m_6577_(HolderLookup.Provider provider) {}
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModItemTagGenerator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */