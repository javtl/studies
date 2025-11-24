/*    */ package es.druedam.expansionmod;
/*    */ 
/*    */ import es.druedam.expansionmod.block.ModBlocks;
/*    */ import es.druedam.expansionmod.item.CreativeModeTabs;
/*    */ import es.druedam.expansionmod.item.ModItems;
/*    */ import es.druedam.expansionmod.loot.ModLootModifiers;
/*    */ import es.druedam.expansionmod.painting.ModPaintings;
/*    */ import es.druedam.expansionmod.sound.ModSounds;
/*    */ import es.druedam.expansionmod.villager.ModVillagers;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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
/*    */ @Mod("druedams_expansion_mod")
/*    */ public class ExpansionModMain
/*    */ {
/*    */   public static final String MOD_ID = "druedams_expansion_mod";
/*    */   
/*    */   public ExpansionModMain() {
/* 31 */     IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
/*    */ 
/*    */     
/* 34 */     CreativeModeTabs.register(modEventBus);
/* 35 */     ModItems.register(modEventBus);
/* 36 */     ModBlocks.register(modEventBus);
/* 37 */     ModLootModifiers.register(modEventBus);
/* 38 */     ModVillagers.register(modEventBus);
/* 39 */     ModPaintings.register(modEventBus);
/* 40 */     ModSounds.register(modEventBus);
/*    */ 
/*    */     
/* 43 */     MinecraftForge.EVENT_BUS.register(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\ExpansionModMain.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */