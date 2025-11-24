/*    */ package es.druedam.expansionmod.loot;
/*    */ 
/*    */ import com.mojang.serialization.Codec;
/*    */ import net.minecraftforge.common.loot.IGlobalLootModifier;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
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
/*    */ 
/*    */ 
/*    */ public class ModLootModifiers
/*    */ {
/* 22 */   public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, "druedams_expansion_mod");
/*    */   
/* 24 */   public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM = LOOT_MODIFIER_SERIALIZERS
/* 25 */     .register("add_item", AddItemModifier.CODEC);
/*    */ 
/*    */   
/*    */   public static void register(IEventBus eventBus) {
/* 29 */     LOOT_MODIFIER_SERIALIZERS.register(eventBus);
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\loot\ModLootModifiers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */