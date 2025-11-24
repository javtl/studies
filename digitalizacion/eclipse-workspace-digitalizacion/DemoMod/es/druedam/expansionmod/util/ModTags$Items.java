/*    */ package es.druedam.expansionmod.util;
/*    */ 
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.ItemTags;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.item.Item;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Items
/*    */ {
/*    */   private static TagKey<Item> tag(String name) {
/* 26 */     return ItemTags.create(new ResourceLocation("druedams_expansion_mod", name));
/*    */   }
/*    */   
/*    */   private static TagKey<Item> forgeTag(String name) {
/* 30 */     return ItemTags.create(new ResourceLocation("forge", name));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmo\\util\ModTags$Items.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */