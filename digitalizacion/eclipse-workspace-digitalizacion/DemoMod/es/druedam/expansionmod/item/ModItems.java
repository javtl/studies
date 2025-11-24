/*     */ package es.druedam.expansionmod.item;
/*     */ 
/*     */ import es.druedam.expansionmod.block.ModBlocks;
/*     */ import net.minecraft.world.item.ArmorItem;
/*     */ import net.minecraft.world.item.AxeItem;
/*     */ import net.minecraft.world.item.HoeItem;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemNameBlockItem;
/*     */ import net.minecraft.world.item.PickaxeItem;
/*     */ import net.minecraft.world.item.ShovelItem;
/*     */ import net.minecraft.world.item.SwordItem;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraftforge.eventbus.api.IEventBus;
/*     */ import net.minecraftforge.registries.DeferredRegister;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ import net.minecraftforge.registries.RegistryObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModItems
/*     */ {
/*  25 */   public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "druedams_expansion_mod");
/*     */   
/*  27 */   public static final RegistryObject<Item> FRIED_CHICKEN = ITEMS.register("fried_chicken", () -> new AppendTextItem((new Item.Properties()).m_41489_(ModFoods.FRIED_CHICKEN), "tooltip.expansion.fried_chicken"));
/*     */ 
/*     */   
/*  30 */   public static final RegistryObject<Item> RAW_FRIED_CHICKEN = ITEMS.register("raw_fried_chicken", () -> new Item((new Item.Properties()).m_41489_(ModFoods.RAW_FRIED_CHICKEN)));
/*     */ 
/*     */   
/*  33 */   public static final RegistryObject<Item> PEPSI = ITEMS.register("pepsi", () -> new Item((new Item.Properties()).m_41489_(ModFoods.PEPSI)));
/*     */ 
/*     */   
/*  36 */   public static final RegistryObject<Item> CAMPURRIANA = ITEMS.register("campurriana", () -> new AppendTextItem((new Item.Properties()).m_41489_(ModFoods.CAMPURRIANA), "tooltip.expansion.campurriana"));
/*     */ 
/*     */   
/*  39 */   public static final RegistryObject<Item> CROQUETTE = ITEMS.register("croqueta", () -> new Item((new Item.Properties()).m_41489_(ModFoods.CROQUETTE)));
/*     */ 
/*     */   
/*  42 */   public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new AppendTextItem((new Item.Properties()).m_41489_(ModFoods.STRAWBERRY), "tooltip.expansion.strawberry"));
/*     */ 
/*     */   
/*  45 */   public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item((new Item.Properties()).m_41489_(ModFoods.CHEESE)));
/*     */ 
/*     */   
/*  48 */   public static final RegistryObject<Item> CHOCOLATE_TABLE = ITEMS.register("chocolate_table", () -> new Item((new Item.Properties()).m_41489_(ModFoods.CHOCOLATE_TABLE)));
/*     */ 
/*     */   
/*  51 */   public static final RegistryObject<Item> CHOCOLATE_MILKSHAKE = ITEMS.register("chocolate_milkshake", () -> new Item((new Item.Properties()).m_41489_(ModFoods.CHOCOLATE_MILKSHAKE)));
/*     */ 
/*     */   
/*  54 */   public static final RegistryObject<Item> BOCATA_LOMO_QUESO = ITEMS.register("pork_cheese_sandwich", () -> new Item((new Item.Properties()).m_41489_(ModFoods.BOCATA_LOMO_QUESO)));
/*     */ 
/*     */ 
/*     */   
/*  58 */   public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item((new Item.Properties()).m_41489_(ModFoods.TOMATO)));
/*     */ 
/*     */   
/*  61 */   public static final RegistryObject<Item> DURUM = ITEMS.register("durum", () -> new AppendTextItem((new Item.Properties()).m_41489_(ModFoods.DURUM), "tooltip.expansion.durum"));
/*     */ 
/*     */   
/*  64 */   public static final RegistryObject<Item> BURGER = ITEMS.register("burger", () -> new AppendTextItem((new Item.Properties()).m_41489_(ModFoods.BURGER), "tooltip.expansion.burger"));
/*     */ 
/*     */   
/*  67 */   public static final RegistryObject<Item> FOOD_COMBINED = ITEMS.register("food_combined", () -> new Item((new Item.Properties()).m_41489_(ModFoods.FOOD_COMBINED).m_41487_(1)));
/*     */ 
/*     */   
/*  70 */   public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem((Block)ModBlocks.TOMATO_CROP.get(), new Item.Properties()));
/*     */ 
/*     */   
/*  73 */   public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds", () -> new ItemNameBlockItem((Block)ModBlocks.STRAWBERRY_CROP.get(), new Item.Properties()));
/*     */ 
/*     */   
/*  76 */   public static final RegistryObject<Item> FLUORITE_INGOT = ITEMS.register("fluorite_ingot", () -> new Item(new Item.Properties()));
/*     */ 
/*     */   
/*  79 */   public static final RegistryObject<Item> FLUORITE_SWORD = ITEMS.register("fluorite_sword", () -> new SwordItem(ModToolTiers.FLUORITE, 3, -1.5F, new Item.Properties()));
/*     */ 
/*     */   
/*  82 */   public static final RegistryObject<Item> FLUORITE_SHOVEL = ITEMS.register("fluorite_shovel", () -> new ShovelItem(ModToolTiers.FLUORITE, 1.0F, -2.5F, new Item.Properties()));
/*     */ 
/*     */   
/*  85 */   public static final RegistryObject<Item> FLUORITE_PICKAXE = ITEMS.register("fluorite_pickaxe", () -> new PickaxeItem(ModToolTiers.FLUORITE, 2, -3.0F, new Item.Properties()));
/*     */ 
/*     */   
/*  88 */   public static final RegistryObject<Item> FLUORITE_AXE = ITEMS.register("fluorite_axe", () -> new AxeItem(ModToolTiers.FLUORITE, 3.5F, -2.5F, new Item.Properties()));
/*     */ 
/*     */   
/*  91 */   public static final RegistryObject<Item> FLUORITE_HOE = ITEMS.register("fluorite_hoe", () -> new HoeItem(ModToolTiers.FLUORITE, 1, -2.5F, new Item.Properties()));
/*     */ 
/*     */   
/*  94 */   public static final RegistryObject<Item> FLUORITE_HELMET = ITEMS.register("fluorite_helmet", () -> new ArmorItem(ModArmorMaterials.FLUORITE, ArmorItem.Type.HELMET, new Item.Properties()));
/*     */ 
/*     */   
/*  97 */   public static final RegistryObject<Item> FLUORITE_CHESTPLATE = ITEMS.register("fluorite_chestplate", () -> new ArmorItem(ModArmorMaterials.FLUORITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
/*     */ 
/*     */   
/* 100 */   public static final RegistryObject<Item> FLUORITE_LEGGINGS = ITEMS.register("fluorite_leggings", () -> new ArmorItem(ModArmorMaterials.FLUORITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
/*     */ 
/*     */   
/* 103 */   public static final RegistryObject<Item> FLUORITE_BOOTS = ITEMS.register("fluorite_boots", () -> new ArmorItem(ModArmorMaterials.FLUORITE, ArmorItem.Type.BOOTS, new Item.Properties()));
/*     */ 
/*     */ 
/*     */   
/* 107 */   public static final RegistryObject<Item> WOOD_HELMET = ITEMS.register("wood_helmet", () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
/*     */ 
/*     */   
/* 110 */   public static final RegistryObject<Item> WOOD_CHESTPLATE = ITEMS.register("wood_chestplate", () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
/*     */ 
/*     */   
/* 113 */   public static final RegistryObject<Item> WOOD_LEGGINGS = ITEMS.register("wood_leggings", () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
/*     */ 
/*     */   
/* 116 */   public static final RegistryObject<Item> WOOD_BOOTS = ITEMS.register("wood_boots", () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void register(IEventBus eventBus) {
/* 123 */     ITEMS.register(eventBus);
/*     */   }
/*     */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\item\ModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */