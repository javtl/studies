/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import es.druedam.expansionmod.item.ModItems;
/*    */ import es.druedam.expansionmod.loot.AddItemModifier;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
/*    */ import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
/*    */ import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
/*    */ import net.minecraftforge.common.data.GlobalLootModifierProvider;
/*    */ import net.minecraftforge.common.loot.IGlobalLootModifier;
/*    */ import net.minecraftforge.common.loot.LootTableIdCondition;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModGlobalLootModifiersProvider
/*    */   extends GlobalLootModifierProvider
/*    */ {
/*    */   public ModGlobalLootModifiersProvider(PackOutput output) {
/* 43 */     super(output, "druedams_expansion_mod");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void start() {
/* 49 */     add("tomato_seeds_from_grass", (IGlobalLootModifier)new AddItemModifier(new LootItemCondition[] {
/* 50 */             LootItemBlockStatePropertyCondition.m_81769_(Blocks.f_50034_).m_6409_(), 
/* 51 */             LootItemRandomChanceCondition.m_81927_(0.1F).m_6409_() }, (Item)ModItems.TOMATO_SEEDS
/* 52 */           .get()));
/*    */     
/* 54 */     add("strawberry_seeds_from_grass", (IGlobalLootModifier)new AddItemModifier(new LootItemCondition[] {
/* 55 */             LootItemBlockStatePropertyCondition.m_81769_(Blocks.f_50034_).m_6409_(), 
/* 56 */             LootItemRandomChanceCondition.m_81927_(0.1F).m_6409_() }, (Item)ModItems.STRAWBERRY_SEEDS
/* 57 */           .get()));
/*    */     
/* 59 */     add("pepsi_from_zombie", (IGlobalLootModifier)new AddItemModifier(new LootItemCondition[] { (new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")))
/* 60 */             .m_6409_(), 
/* 61 */             LootItemRandomChanceCondition.m_81927_(0.4F).m_6409_() }, (Item)ModItems.PEPSI
/* 62 */           .get()));
/*    */     
/* 64 */     add("fluorite_sword_from_village_weaponsmith", (IGlobalLootModifier)new AddItemModifier(new LootItemCondition[] { (new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_weaponsmith")))
/* 65 */             .m_6409_(), 
/* 66 */             LootItemRandomChanceCondition.m_81927_(0.35F).m_6409_() }, (Item)ModItems.FLUORITE_SWORD
/*    */           
/* 68 */           .get()));
/*    */     
/* 70 */     add("fluorite_pickaxe_from_village_toolsmith", (IGlobalLootModifier)new AddItemModifier(new LootItemCondition[] { (new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_toolsmith")))
/* 71 */             .m_6409_(), 
/* 72 */             LootItemRandomChanceCondition.m_81927_(0.35F).m_6409_() }, (Item)ModItems.FLUORITE_PICKAXE
/*    */           
/* 74 */           .get()));
/*    */     
/* 76 */     add("fluorite_axe_from_village_toolsmith", (IGlobalLootModifier)new AddItemModifier(new LootItemCondition[] { (new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_toolsmith")))
/* 77 */             .m_6409_(), 
/* 78 */             LootItemRandomChanceCondition.m_81927_(0.25F).m_6409_() }, (Item)ModItems.FLUORITE_AXE
/*    */           
/* 80 */           .get()));
/*    */     
/* 82 */     add("fluorite_hoe_from_village_toolsmith", (IGlobalLootModifier)new AddItemModifier(new LootItemCondition[] { (new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_toolsmith")))
/* 83 */             .m_6409_(), 
/* 84 */             LootItemRandomChanceCondition.m_81927_(0.35F).m_6409_() }, (Item)ModItems.FLUORITE_HOE
/*    */           
/* 86 */           .get()));
/*    */     
/* 88 */     add("fluorite_shovel_from_village_toolsmith", (IGlobalLootModifier)new AddItemModifier(new LootItemCondition[] { (new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_toolsmith")))
/* 89 */             .m_6409_(), 
/* 90 */             LootItemRandomChanceCondition.m_81927_(0.45F).m_6409_() }, (Item)ModItems.FLUORITE_SHOVEL
/*    */           
/* 92 */           .get()));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModGlobalLootModifiersProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */