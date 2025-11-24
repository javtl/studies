/*    */ package es.druedam.expansionmod.util;
/*    */ 
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.tags.ItemTags;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.level.block.Block;
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
/*    */ public class ModTags
/*    */ {
/*    */   public static class Items
/*    */   {
/*    */     private static TagKey<Item> tag(String name) {
/* 26 */       return ItemTags.create(new ResourceLocation("druedams_expansion_mod", name));
/*    */     }
/*    */     
/*    */     private static TagKey<Item> forgeTag(String name) {
/* 30 */       return ItemTags.create(new ResourceLocation("forge", name));
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Blocks
/*    */   {
/* 36 */     public static final TagKey<Block> NEEDS_FLUORITE = tag("needs_fluorite_tool");
/*    */ 
/*    */     
/*    */     private static TagKey<Block> tag(String name) {
/* 40 */       return BlockTags.create(new ResourceLocation("druedams_expansion_mod", name));
/*    */     }
/*    */     
/*    */     private static TagKey<Block> forgeTag(String name) {
/* 44 */       return BlockTags.create(new ResourceLocation("forge", name));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmo\\util\ModTags.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */