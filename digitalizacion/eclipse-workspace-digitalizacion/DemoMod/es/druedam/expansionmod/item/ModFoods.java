/*    */ package es.druedam.expansionmod.item;
/*    */ 
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.food.FoodProperties;
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
/*    */ 
/*    */ 
/*    */ public class ModFoods
/*    */ {
/* 26 */   public static final FoodProperties FRIED_CHICKEN = (new FoodProperties.Builder()).m_38760_(5)
/* 27 */     .m_38758_(0.4F).effect(() -> new MobEffectInstance(MobEffects.f_19596_, 3500), 1.0F)
/* 28 */     .m_38757_().m_38767_();
/*    */   
/* 30 */   public static final FoodProperties RAW_FRIED_CHICKEN = (new FoodProperties.Builder()).m_38760_(1)
/* 31 */     .m_38758_(0.2F).effect(() -> new MobEffectInstance(MobEffects.f_19612_, 600), 0.3F)
/* 32 */     .m_38757_().m_38767_();
/*    */   
/* 34 */   public static final FoodProperties PEPSI = (new FoodProperties.Builder()).m_38760_(2)
/* 35 */     .m_38758_(0.0F).effect(() -> new MobEffectInstance(MobEffects.f_19615_, 500), 1.0F)
/* 36 */     .effect(() -> new MobEffectInstance(MobEffects.f_19610_, 500), 1.0F).m_38765_().m_38767_();
/*    */   
/* 38 */   public static final FoodProperties CAMPURRIANA = (new FoodProperties.Builder()).m_38760_(3)
/* 39 */     .m_38758_(0.2F).m_38765_().m_38766_().effect(() -> new MobEffectInstance(MobEffects.f_19611_, 700), 1.0F).m_38767_();
/*    */   
/* 41 */   public static final FoodProperties CROQUETTE = (new FoodProperties.Builder()).m_38760_(3)
/* 42 */     .m_38758_(0.4F).m_38757_().m_38766_().m_38767_();
/*    */   
/* 44 */   public static final FoodProperties STRAWBERRY = (new FoodProperties.Builder()).m_38760_(2)
/* 45 */     .m_38758_(0.1F).m_38766_().effect(() -> new MobEffectInstance(MobEffects.f_19606_, 500), 1.0F).m_38765_().m_38767_();
/*    */   
/* 47 */   public static final FoodProperties CHEESE = (new FoodProperties.Builder()).m_38760_(2)
/* 48 */     .m_38758_(0.5F).m_38767_();
/*    */   
/* 50 */   public static final FoodProperties CHOCOLATE_TABLE = (new FoodProperties.Builder()).m_38760_(5)
/* 51 */     .m_38758_(0.35F).m_38767_();
/*    */   
/* 53 */   public static final FoodProperties CHOCOLATE_MILKSHAKE = (new FoodProperties.Builder()).m_38760_(6)
/* 54 */     .m_38758_(0.5F).m_38767_();
/*    */   
/* 56 */   public static final FoodProperties BOCATA_LOMO_QUESO = (new FoodProperties.Builder()).m_38760_(8)
/* 57 */     .m_38758_(0.5F).m_38767_();
/*    */   
/* 59 */   public static final FoodProperties TOMATO = (new FoodProperties.Builder()).m_38760_(4)
/* 60 */     .m_38758_(0.2F).m_38767_();
/*    */   
/* 62 */   public static final FoodProperties DURUM = (new FoodProperties.Builder()).m_38760_(10)
/* 63 */     .m_38758_(1.0F).effect(() -> new MobEffectInstance(MobEffects.f_19604_, 250), 0.25F)
/* 64 */     .effect(() -> new MobEffectInstance(MobEffects.f_19621_, 3500), 1.0F).m_38767_();
/*    */   
/* 66 */   public static final FoodProperties BURGER = (new FoodProperties.Builder()).m_38760_(10)
/* 67 */     .m_38758_(0.7F).effect(() -> new MobEffectInstance(MobEffects.f_19600_, 3500), 1.0F).m_38767_();
/*    */   
/* 69 */   public static final FoodProperties FOOD_COMBINED = (new FoodProperties.Builder()).m_38760_(8)
/* 70 */     .m_38758_(0.5F).effect(() -> new MobEffectInstance(MobEffects.f_19607_, 3500), 1.0F).m_38767_();
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\item\ModFoods.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */