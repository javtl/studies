/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import es.druedam.expansionmod.item.ModItems;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraftforge.client.model.generators.ItemModelBuilder;
/*    */ import net.minecraftforge.client.model.generators.ItemModelProvider;
/*    */ import net.minecraftforge.common.data.ExistingFileHelper;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModItemModelProvider
/*    */   extends ItemModelProvider
/*    */ {
/*    */   public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
/* 24 */     super(output, "druedams_expansion_mod", existingFileHelper);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void registerModels() {
/* 30 */     simpleItem(ModItems.BOCATA_LOMO_QUESO);
/* 31 */     simpleItem(ModItems.CAMPURRIANA);
/* 32 */     simpleItem(ModItems.CHEESE);
/* 33 */     simpleItem(ModItems.CHOCOLATE_MILKSHAKE);
/* 34 */     simpleItem(ModItems.CHOCOLATE_TABLE);
/* 35 */     simpleItem(ModItems.CROQUETTE);
/* 36 */     simpleItem(ModItems.PEPSI);
/* 37 */     simpleItem(ModItems.RAW_FRIED_CHICKEN);
/* 38 */     simpleItem(ModItems.FRIED_CHICKEN);
/* 39 */     simpleItem(ModItems.STRAWBERRY);
/* 40 */     simpleItem(ModItems.FRIED_CHICKEN);
/* 41 */     simpleItem(ModItems.TOMATO);
/* 42 */     simpleItem(ModItems.DURUM);
/* 43 */     simpleItem(ModItems.BURGER);
/* 44 */     simpleItem(ModItems.FOOD_COMBINED);
/* 45 */     simpleItem(ModItems.TOMATO_SEEDS);
/* 46 */     simpleItem(ModItems.STRAWBERRY_SEEDS);
/* 47 */     simpleItem(ModItems.FLUORITE_INGOT);
/*    */     
/* 49 */     handheldItem(ModItems.FLUORITE_PICKAXE);
/* 50 */     handheldItem(ModItems.FLUORITE_AXE);
/* 51 */     handheldItem(ModItems.FLUORITE_SWORD);
/* 52 */     handheldItem(ModItems.FLUORITE_HOE);
/* 53 */     handheldItem(ModItems.FLUORITE_SHOVEL);
/*    */     
/* 55 */     simpleItem(ModItems.FLUORITE_HELMET);
/* 56 */     simpleItem(ModItems.FLUORITE_CHESTPLATE);
/* 57 */     simpleItem(ModItems.FLUORITE_LEGGINGS);
/* 58 */     simpleItem(ModItems.FLUORITE_BOOTS);
/*    */     
/* 60 */     simpleItem(ModItems.WOOD_HELMET);
/* 61 */     simpleItem(ModItems.WOOD_CHESTPLATE);
/* 62 */     simpleItem(ModItems.WOOD_LEGGINGS);
/* 63 */     simpleItem(ModItems.WOOD_BOOTS);
/*    */   }
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
/*    */   private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
/* 78 */     return (ItemModelBuilder)((ItemModelBuilder)withExistingParent(item.getId().m_135815_(), new ResourceLocation("item/generated")))
/* 79 */       .texture("layer0", new ResourceLocation("druedams_expansion_mod", "item/" + item
/* 80 */           .getId().m_135815_()));
/*    */   }
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
/*    */   private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
/* 93 */     return (ItemModelBuilder)((ItemModelBuilder)withExistingParent(item.getId().m_135815_(), new ResourceLocation("item/handheld")))
/* 94 */       .texture("layer0", new ResourceLocation("druedams_expansion_mod", "item/" + item
/* 95 */           .getId().m_135815_()));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModItemModelProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */