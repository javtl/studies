/*     */ package es.druedam.expansionmod.datagen;
/*     */ 
/*     */ import es.druedam.expansionmod.block.ModBlocks;
/*     */ import es.druedam.expansionmod.item.ModItems;
/*     */ import java.util.List;
/*     */ import java.util.function.Consumer;
/*     */ import net.minecraft.advancements.CriterionTriggerInstance;
/*     */ import net.minecraft.advancements.critereon.ItemPredicate;
/*     */ import net.minecraft.data.PackOutput;
/*     */ import net.minecraft.data.recipes.FinishedRecipe;
/*     */ import net.minecraft.data.recipes.RecipeCategory;
/*     */ import net.minecraft.data.recipes.RecipeProvider;
/*     */ import net.minecraft.data.recipes.ShapedRecipeBuilder;
/*     */ import net.minecraft.data.recipes.ShapelessRecipeBuilder;
/*     */ import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
/*     */ import net.minecraft.tags.ItemTags;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.item.crafting.AbstractCookingRecipe;
/*     */ import net.minecraft.world.item.crafting.Ingredient;
/*     */ import net.minecraft.world.item.crafting.RecipeSerializer;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModRecipeProvider
/*     */   extends RecipeProvider
/*     */   implements IConditionBuilder
/*     */ {
/*     */   public ModRecipeProvider(PackOutput pOutput) {
/*  32 */     super(pOutput);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_245200_(Consumer<FinishedRecipe> pWriter) {
/*  39 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.FOOD, (ItemLike)ModItems.RAW_FRIED_CHICKEN.get())
/*  40 */       .m_126130_("CT")
/*  41 */       .m_126127_(Character.valueOf('C'), (ItemLike)Items.f_42581_)
/*  42 */       .m_126127_(Character.valueOf('T'), (ItemLike)Items.f_42405_)
/*  43 */       .m_126132_(m_176602_((ItemLike)ModItems.RAW_FRIED_CHICKEN.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.RAW_FRIED_CHICKEN.get()))
/*  44 */       .m_176498_(pWriter);
/*     */     
/*  46 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.FOOD, (ItemLike)ModItems.CHOCOLATE_TABLE.get())
/*  47 */       .m_126130_("###")
/*  48 */       .m_126130_("###")
/*  49 */       .m_126130_("###")
/*  50 */       .m_126127_(Character.valueOf('#'), (ItemLike)Items.f_42533_)
/*  51 */       .m_126132_(m_176602_((ItemLike)Items.f_42533_), (CriterionTriggerInstance)m_125977_((ItemLike)Items.f_42533_))
/*  52 */       .m_176498_(pWriter);
/*     */     
/*  54 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.FOOD, (ItemLike)ModItems.BOCATA_LOMO_QUESO.get())
/*  55 */       .m_126130_("QCP")
/*  56 */       .m_126127_(Character.valueOf('Q'), (ItemLike)ModItems.CHEESE.get())
/*  57 */       .m_126127_(Character.valueOf('C'), (ItemLike)Items.f_42485_)
/*  58 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42406_)
/*  59 */       .m_126132_(m_176602_((ItemLike)ModItems.CHEESE.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.CHEESE.get()))
/*  60 */       .m_176498_(pWriter);
/*     */     
/*  62 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.FOOD, (ItemLike)ModItems.CHOCOLATE_MILKSHAKE.get())
/*  63 */       .m_126130_("LC")
/*  64 */       .m_126127_(Character.valueOf('L'), (ItemLike)Items.f_42455_)
/*  65 */       .m_126127_(Character.valueOf('C'), (ItemLike)ModItems.CHOCOLATE_TABLE.get())
/*  66 */       .m_126132_(m_176602_((ItemLike)ModItems.CHOCOLATE_TABLE.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.CHOCOLATE_TABLE.get()))
/*  67 */       .m_176498_(pWriter);
/*     */     
/*  69 */     ShapedRecipeBuilder.m_246608_(RecipeCategory.FOOD, (ItemLike)ModItems.CROQUETTE.get(), 6)
/*  70 */       .m_126130_("CLP")
/*  71 */       .m_126127_(Character.valueOf('C'), (ItemLike)Items.f_42485_)
/*  72 */       .m_126127_(Character.valueOf('L'), (ItemLike)Items.f_42455_)
/*  73 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42406_)
/*  74 */       .m_126132_(m_176602_((ItemLike)Items.f_42485_), (CriterionTriggerInstance)m_125977_((ItemLike)Items.f_42485_))
/*  75 */       .m_176498_(pWriter);
/*     */     
/*  77 */     ShapedRecipeBuilder.m_246608_(RecipeCategory.FOOD, (ItemLike)ModItems.CAMPURRIANA.get(), 8)
/*  78 */       .m_126130_("HLT")
/*  79 */       .m_126127_(Character.valueOf('H'), (ItemLike)Items.f_42521_)
/*  80 */       .m_126127_(Character.valueOf('L'), (ItemLike)Items.f_42455_)
/*  81 */       .m_126127_(Character.valueOf('T'), (ItemLike)Items.f_42405_)
/*  82 */       .m_126132_(m_176602_((ItemLike)Items.f_42521_), (CriterionTriggerInstance)m_125977_((ItemLike)Items.f_42521_))
/*  83 */       .m_176498_(pWriter);
/*     */     
/*  85 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.FOOD, (ItemLike)ModItems.DURUM.get())
/*  86 */       .m_126130_("PCT")
/*  87 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42406_)
/*  88 */       .m_126127_(Character.valueOf('C'), (ItemLike)Items.f_42579_)
/*  89 */       .m_126127_(Character.valueOf('T'), (ItemLike)ModItems.TOMATO.get())
/*  90 */       .m_126132_(m_176602_((ItemLike)Items.f_42406_), (CriterionTriggerInstance)m_125977_((ItemLike)Items.f_42406_))
/*  91 */       .m_176498_(pWriter);
/*     */     
/*  93 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.FOOD, (ItemLike)ModItems.BURGER.get())
/*  94 */       .m_126130_(" P ")
/*  95 */       .m_126130_("CQT")
/*  96 */       .m_126130_(" P ")
/*  97 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42406_)
/*  98 */       .m_126127_(Character.valueOf('C'), (ItemLike)Items.f_42579_)
/*  99 */       .m_126127_(Character.valueOf('Q'), (ItemLike)ModItems.CHEESE.get())
/* 100 */       .m_126127_(Character.valueOf('T'), (ItemLike)ModItems.TOMATO.get())
/* 101 */       .m_126132_(m_176602_((ItemLike)Items.f_42406_), (CriterionTriggerInstance)m_125977_((ItemLike)Items.f_42406_))
/* 102 */       .m_176498_(pWriter);
/*     */     
/* 104 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.FOOD, (ItemLike)ModItems.FOOD_COMBINED.get())
/* 105 */       .m_126130_("HBP")
/* 106 */       .m_126127_(Character.valueOf('H'), (ItemLike)Items.f_42521_)
/* 107 */       .m_126127_(Character.valueOf('B'), (ItemLike)Items.f_42485_)
/* 108 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42620_)
/* 109 */       .m_126132_(m_176602_((ItemLike)Items.f_42485_), (CriterionTriggerInstance)m_125977_((ItemLike)Items.f_42485_))
/* 110 */       .m_176498_(pWriter);
/*     */     
/* 112 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.FOOD, (ItemLike)ModBlocks.PIZZA.get())
/* 113 */       .m_126130_("QCT")
/* 114 */       .m_126130_("PPP")
/* 115 */       .m_126127_(Character.valueOf('Q'), (ItemLike)ModItems.CHEESE.get())
/* 116 */       .m_126127_(Character.valueOf('C'), (ItemLike)Items.f_42485_)
/* 117 */       .m_126127_(Character.valueOf('T'), (ItemLike)ModItems.TOMATO.get())
/* 118 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42406_)
/* 119 */       .m_126132_(m_176602_((ItemLike)Items.f_42406_), (CriterionTriggerInstance)m_125977_((ItemLike)Items.f_42406_))
/* 120 */       .m_176498_(pWriter);
/*     */     
/* 122 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.COMBAT, (ItemLike)ModItems.FLUORITE_SWORD.get())
/* 123 */       .m_126130_("F")
/* 124 */       .m_126130_("F")
/* 125 */       .m_126130_("P")
/* 126 */       .m_126127_(Character.valueOf('F'), (ItemLike)ModItems.FLUORITE_INGOT.get())
/* 127 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42398_)
/* 128 */       .m_126132_(m_176602_((ItemLike)ModItems.FLUORITE_INGOT.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.FLUORITE_INGOT.get()))
/* 129 */       .m_176498_(pWriter);
/*     */     
/* 131 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.TOOLS, (ItemLike)ModItems.FLUORITE_AXE.get())
/* 132 */       .m_126130_("FF ")
/* 133 */       .m_126130_("FP ")
/* 134 */       .m_126130_(" P ")
/* 135 */       .m_126127_(Character.valueOf('F'), (ItemLike)ModItems.FLUORITE_INGOT.get())
/* 136 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42398_)
/* 137 */       .m_126132_(m_176602_((ItemLike)ModItems.FLUORITE_INGOT.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.FLUORITE_INGOT.get()))
/* 138 */       .m_176498_(pWriter);
/*     */     
/* 140 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.TOOLS, (ItemLike)ModItems.FLUORITE_SHOVEL.get())
/* 141 */       .m_126130_("F")
/* 142 */       .m_126130_("P")
/* 143 */       .m_126130_("P")
/* 144 */       .m_126127_(Character.valueOf('F'), (ItemLike)ModItems.FLUORITE_INGOT.get())
/* 145 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42398_)
/* 146 */       .m_126132_(m_176602_((ItemLike)ModItems.FLUORITE_INGOT.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.FLUORITE_INGOT.get()))
/* 147 */       .m_176498_(pWriter);
/*     */     
/* 149 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.TOOLS, (ItemLike)ModItems.FLUORITE_HOE.get())
/* 150 */       .m_126130_("FF ")
/* 151 */       .m_126130_(" P ")
/* 152 */       .m_126130_(" P ")
/* 153 */       .m_126127_(Character.valueOf('F'), (ItemLike)ModItems.FLUORITE_INGOT.get())
/* 154 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42398_)
/* 155 */       .m_126132_(m_176602_((ItemLike)ModItems.FLUORITE_INGOT.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.FLUORITE_INGOT.get()))
/* 156 */       .m_176498_(pWriter);
/*     */     
/* 158 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.TOOLS, (ItemLike)ModItems.FLUORITE_PICKAXE.get())
/* 159 */       .m_126130_("FFF")
/* 160 */       .m_126130_(" P ")
/* 161 */       .m_126130_(" P ")
/* 162 */       .m_126127_(Character.valueOf('F'), (ItemLike)ModItems.FLUORITE_INGOT.get())
/* 163 */       .m_126127_(Character.valueOf('P'), (ItemLike)Items.f_42398_)
/* 164 */       .m_126132_(m_176602_((ItemLike)ModItems.FLUORITE_INGOT.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.FLUORITE_INGOT.get()))
/* 165 */       .m_176498_(pWriter);
/*     */     
/* 167 */     ShapelessRecipeBuilder.m_246517_(RecipeCategory.FOOD, (ItemLike)ModItems.CHEESE.get(), 3)
/* 168 */       .m_126209_((ItemLike)Items.f_42455_)
/* 169 */       .m_126132_(m_176602_((ItemLike)Items.f_42455_), (CriterionTriggerInstance)m_125977_((ItemLike)Items.f_42455_))
/* 170 */       .m_176498_(pWriter);
/*     */     
/* 172 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.COMBAT, (ItemLike)ModItems.FLUORITE_HELMET.get())
/* 173 */       .m_126130_("FFF")
/* 174 */       .m_126130_("F F")
/* 175 */       .m_126127_(Character.valueOf('F'), (ItemLike)ModItems.FLUORITE_INGOT.get())
/* 176 */       .m_126132_(m_176602_((ItemLike)ModItems.FLUORITE_INGOT.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.FLUORITE_INGOT.get()))
/* 177 */       .m_176498_(pWriter);
/*     */     
/* 179 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.COMBAT, (ItemLike)ModItems.FLUORITE_CHESTPLATE.get())
/* 180 */       .m_126130_("F F")
/* 181 */       .m_126130_("FFF")
/* 182 */       .m_126130_("FFF")
/* 183 */       .m_126127_(Character.valueOf('F'), (ItemLike)ModItems.FLUORITE_INGOT.get())
/* 184 */       .m_126132_(m_176602_((ItemLike)ModItems.FLUORITE_INGOT.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.FLUORITE_INGOT.get()))
/* 185 */       .m_176498_(pWriter);
/*     */     
/* 187 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.COMBAT, (ItemLike)ModItems.FLUORITE_LEGGINGS.get())
/* 188 */       .m_126130_("FFF")
/* 189 */       .m_126130_("F F")
/* 190 */       .m_126130_("F F")
/* 191 */       .m_126127_(Character.valueOf('F'), (ItemLike)ModItems.FLUORITE_INGOT.get())
/* 192 */       .m_126132_(m_176602_((ItemLike)ModItems.FLUORITE_INGOT.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.FLUORITE_INGOT.get()))
/* 193 */       .m_176498_(pWriter);
/*     */     
/* 195 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.COMBAT, (ItemLike)ModItems.FLUORITE_BOOTS.get())
/* 196 */       .m_126130_("F F")
/* 197 */       .m_126130_("F F")
/* 198 */       .m_126127_(Character.valueOf('F'), (ItemLike)ModItems.FLUORITE_INGOT.get())
/* 199 */       .m_126132_(m_176602_((ItemLike)ModItems.FLUORITE_INGOT.get()), (CriterionTriggerInstance)m_125977_((ItemLike)ModItems.FLUORITE_INGOT.get()))
/* 200 */       .m_176498_(pWriter);
/*     */ 
/*     */     
/* 203 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.COMBAT, (ItemLike)ModItems.WOOD_HELMET.get())
/* 204 */       .m_126130_("WWW")
/* 205 */       .m_126130_("W W")
/* 206 */       .m_206416_(Character.valueOf('W'), ItemTags.f_13168_)
/* 207 */       .m_126132_("has_planks", (CriterionTriggerInstance)m_126011_(new ItemPredicate[] { ItemPredicate.Builder.m_45068_()
/* 208 */             .m_204145_(ItemTags.f_13168_).m_45077_()
/* 209 */           })).m_176498_(pWriter);
/*     */     
/* 211 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.COMBAT, (ItemLike)ModItems.WOOD_CHESTPLATE.get())
/* 212 */       .m_126130_("W W")
/* 213 */       .m_126130_("WWW")
/* 214 */       .m_126130_("WWW")
/* 215 */       .m_206416_(Character.valueOf('W'), ItemTags.f_13168_)
/* 216 */       .m_126132_("has_planks", (CriterionTriggerInstance)m_126011_(new ItemPredicate[] { ItemPredicate.Builder.m_45068_()
/* 217 */             .m_204145_(ItemTags.f_13168_).m_45077_()
/* 218 */           })).m_176498_(pWriter);
/*     */     
/* 220 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.COMBAT, (ItemLike)ModItems.WOOD_LEGGINGS.get())
/* 221 */       .m_126130_("WWW")
/* 222 */       .m_126130_("W W")
/* 223 */       .m_126130_("W W")
/* 224 */       .m_206416_(Character.valueOf('W'), ItemTags.f_13168_)
/* 225 */       .m_126132_("has_planks", (CriterionTriggerInstance)m_126011_(new ItemPredicate[] { ItemPredicate.Builder.m_45068_()
/* 226 */             .m_204145_(ItemTags.f_13168_).m_45077_()
/* 227 */           })).m_176498_(pWriter);
/*     */     
/* 229 */     ShapedRecipeBuilder.m_245327_(RecipeCategory.COMBAT, (ItemLike)ModItems.WOOD_BOOTS.get())
/* 230 */       .m_126130_("W W")
/* 231 */       .m_126130_("W W")
/* 232 */       .m_206416_(Character.valueOf('W'), ItemTags.f_13168_)
/* 233 */       .m_126132_("has_planks", (CriterionTriggerInstance)m_126011_(new ItemPredicate[] { ItemPredicate.Builder.m_45068_()
/* 234 */             .m_204145_(ItemTags.f_13168_).m_45077_()
/* 235 */           })).m_176498_(pWriter);
/*     */     
/* 237 */     m_245809_(pWriter, RecipeSerializer.f_44091_, List.of((ItemLike)ModItems.RAW_FRIED_CHICKEN.get()), RecipeCategory.FOOD, (ItemLike)ModItems.FRIED_CHICKEN.get(), 0.2F, 200, "", "");
/*     */   }
/*     */   
/*     */   protected static void m_246272_(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
/* 241 */     m_245809_(pFinishedRecipeConsumer, RecipeSerializer.f_44091_, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
/*     */   }
/*     */   
/*     */   protected static void m_245412_(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
/* 245 */     m_245809_(pFinishedRecipeConsumer, RecipeSerializer.f_44092_, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
/*     */   }
/*     */ 
/*     */   
/*     */   protected static void m_245809_(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
/* 250 */     for (ItemLike itemLike : pIngredients) {
/* 251 */       SimpleCookingRecipeBuilder.m_247607_(Ingredient.m_43929_(new ItemLike[] { itemLike }, ), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
/*     */         
/* 253 */         .m_126145_(pGroup).m_126132_(m_176602_(itemLike), (CriterionTriggerInstance)m_125977_(itemLike))
/* 254 */         .m_176500_(pFinishedRecipeConsumer, "druedams_expansion_mod:" + m_176632_(pResult) + pRecipeName + "_" + m_176632_(itemLike));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModRecipeProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */