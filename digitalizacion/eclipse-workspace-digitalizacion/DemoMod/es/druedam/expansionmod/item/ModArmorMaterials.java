/*     */ package es.druedam.expansionmod.item;
/*     */ import java.util.EnumMap;
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.Util;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundEvents;
/*     */ import net.minecraft.tags.ItemTags;
/*     */ import net.minecraft.util.StringRepresentable;
/*     */ import net.minecraft.world.item.ArmorItem;
/*     */ import net.minecraft.world.item.ArmorMaterials;
/*     */ import net.minecraft.world.item.crafting.Ingredient;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ 
/*     */ public enum ModArmorMaterials implements ArmorMaterial {
/*     */   FLUORITE, WOOD;
/*     */   public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC;
/*     */   private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE;
/*     */   private final String name;
/*     */   private final int durabilityMultiplier;
/*     */   private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
/*     */   private final int enchantmentValue;
/*     */   private final SoundEvent sound;
/*     */   private final float toughness;
/*     */   private final float knockbackResistance;
/*     */   private final Supplier<Ingredient> repairIngredient;
/*     */   
/*     */   static {
/*  28 */     FLUORITE = new ModArmorMaterials("FLUORITE", 0, "fluorite", 25, (EnumMap<ArmorItem.Type, Integer>)Util.m_137469_(new EnumMap<>(ArmorItem.Type.class), p_266654_ -> { p_266654_.put(ArmorItem.Type.BOOTS, Integer.valueOf(2)); p_266654_.put(ArmorItem.Type.LEGGINGS, Integer.valueOf(5)); p_266654_.put(ArmorItem.Type.CHESTPLATE, Integer.valueOf(8)); p_266654_.put(ArmorItem.Type.HELMET, Integer.valueOf(2)); }), 9, SoundEvents.f_11677_, 0.0F, 0.0F, () -> Ingredient.m_43929_(new ItemLike[] { (ItemLike)ModItems.FLUORITE_INGOT.get() }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     WOOD = new ModArmorMaterials("WOOD", 1, "wood", 8, (EnumMap<ArmorItem.Type, Integer>)Util.m_137469_(new EnumMap<>(ArmorItem.Type.class), p_266654_ -> { p_266654_.put(ArmorItem.Type.BOOTS, Integer.valueOf(2)); p_266654_.put(ArmorItem.Type.LEGGINGS, Integer.valueOf(3)); p_266654_.put(ArmorItem.Type.CHESTPLATE, Integer.valueOf(4)); p_266654_.put(ArmorItem.Type.HELMET, Integer.valueOf(2)); }), 9, SoundEvents.f_11675_, 0.0F, 0.0F, () -> Ingredient.m_204132_(ItemTags.f_13168_));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  44 */     CODEC = StringRepresentable.m_216439_(ArmorMaterials::values);
/*  45 */     HEALTH_FUNCTION_FOR_TYPE = (EnumMap<ArmorItem.Type, Integer>)Util.m_137469_(new EnumMap<>(ArmorItem.Type.class), p_266653_ -> {
/*     */           p_266653_.put(ArmorItem.Type.BOOTS, Integer.valueOf(13));
/*     */           p_266653_.put(ArmorItem.Type.LEGGINGS, Integer.valueOf(15));
/*     */           p_266653_.put(ArmorItem.Type.CHESTPLATE, Integer.valueOf(16));
/*     */           p_266653_.put(ArmorItem.Type.HELMET, Integer.valueOf(11));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   ModArmorMaterials(String pName, int pDurabilityMultiplier, EnumMap<ArmorItem.Type, Integer> pProtectionFunctionForType, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> repairMaterial) {
/*  61 */     this.name = pName;
/*  62 */     this.durabilityMultiplier = pDurabilityMultiplier;
/*  63 */     this.protectionFunctionForType = pProtectionFunctionForType;
/*  64 */     this.enchantmentValue = pEnchantmentValue;
/*  65 */     this.sound = pSound;
/*  66 */     this.toughness = pToughness;
/*  67 */     this.knockbackResistance = pKnockbackResistance;
/*  68 */     this.repairIngredient = repairMaterial;
/*     */   }
/*     */   
/*     */   public int m_266425_(ArmorItem.Type pType) {
/*  72 */     return ((Integer)HEALTH_FUNCTION_FOR_TYPE.get(pType)).intValue() * this.durabilityMultiplier;
/*     */   }
/*     */   
/*     */   public int m_7366_(ArmorItem.Type pType) {
/*  76 */     return ((Integer)this.protectionFunctionForType.get(pType)).intValue();
/*     */   }
/*     */   
/*     */   public int m_6646_() {
/*  80 */     return this.enchantmentValue;
/*     */   }
/*     */   
/*     */   public SoundEvent m_7344_() {
/*  84 */     return this.sound;
/*     */   }
/*     */   
/*     */   public Ingredient m_6230_() {
/*  88 */     return this.repairIngredient.get();
/*     */   }
/*     */   
/*     */   public String m_6082_() {
/*  92 */     return "druedams_expansion_mod:" + this.name;
/*     */   }
/*     */   
/*     */   public float m_6651_() {
/*  96 */     return this.toughness;
/*     */   }
/*     */   
/*     */   public float m_6649_() {
/* 100 */     return this.knockbackResistance;
/*     */   }
/*     */   
/*     */   public String getSerializedName() {
/* 104 */     return "druedams_expansion_mod:" + this.name;
/*     */   }
/*     */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\item\ModArmorMaterials.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */