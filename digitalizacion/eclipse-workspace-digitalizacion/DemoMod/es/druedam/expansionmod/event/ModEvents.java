/*     */ package es.druedam.expansionmod.event;
/*     */ 
/*     */ import es.druedam.expansionmod.command.ReturnHomeCommand;
/*     */ import es.druedam.expansionmod.command.SetHomeCommand;
/*     */ import es.druedam.expansionmod.item.ModItems;
/*     */ import es.druedam.expansionmod.villager.ModVillagers;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import java.util.List;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.npc.VillagerProfession;
/*     */ import net.minecraft.world.entity.npc.VillagerTrades;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.item.trading.MerchantOffer;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraftforge.event.RegisterCommandsEvent;
/*     */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*     */ import net.minecraftforge.event.village.VillagerTradesEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.server.command.ConfigCommand;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber(modid = "druedams_expansion_mod")
/*     */ public class ModEvents
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void addCustomTrades(VillagerTradesEvent event) {
/*  36 */     if (event.getType() == VillagerProfession.f_35590_) {
/*     */       
/*  38 */       Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
/*     */ 
/*     */       
/*  41 */       ((List<VillagerTrades.ItemListing>)trades.get(1)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 1), new ItemStack((ItemLike)ModItems.STRAWBERRY.get(), 3), 10, 8, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  47 */       ((List<VillagerTrades.ItemListing>)trades.get(1)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 1), new ItemStack((ItemLike)ModItems.TOMATO.get(), 3), 10, 16, 0.035F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  53 */       ((List<VillagerTrades.ItemListing>)trades.get(2)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 1), new ItemStack((ItemLike)ModItems.CHEESE.get(), 3), 10, 16, 0.035F));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  60 */     if (event.getType() == ModVillagers.MICHAEL_JACKSON.get()) {
/*     */       
/*  62 */       Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
/*     */ 
/*     */       
/*  65 */       ((List<VillagerTrades.ItemListing>)trades.get(1)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 3), new ItemStack((ItemLike)Items.f_42752_, 1), 3, 15, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  71 */       ((List<VillagerTrades.ItemListing>)trades.get(1)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 3), new ItemStack((ItemLike)Items.f_42710_, 1), 3, 15, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  77 */       ((List<VillagerTrades.ItemListing>)trades.get(1)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 3), new ItemStack((ItemLike)Items.f_220217_, 1), 3, 15, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  83 */       ((List<VillagerTrades.ItemListing>)trades.get(2)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 5), new ItemStack((ItemLike)Items.f_42702_, 1), 3, 50, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  89 */       ((List<VillagerTrades.ItemListing>)trades.get(2)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 5), new ItemStack((ItemLike)Items.f_42705_, 1), 3, 50, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  95 */       ((List<VillagerTrades.ItemListing>)trades.get(2)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 5), new ItemStack((ItemLike)Items.f_42704_, 1), 3, 50, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 101 */       ((List<VillagerTrades.ItemListing>)trades.get(3)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 7), new ItemStack((ItemLike)Items.f_42708_, 1), 3, 75, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 107 */       ((List<VillagerTrades.ItemListing>)trades.get(3)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 7), new ItemStack((ItemLike)Items.f_42709_, 1), 3, 75, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 113 */       ((List<VillagerTrades.ItemListing>)trades.get(3)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 7), new ItemStack((ItemLike)Items.f_42707_, 1), 3, 75, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 119 */       ((List<VillagerTrades.ItemListing>)trades.get(4)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 10), new ItemStack((ItemLike)Items.f_42706_, 1), 3, 100, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 125 */       ((List<VillagerTrades.ItemListing>)trades.get(4)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 10), new ItemStack((ItemLike)Items.f_42701_, 1), 3, 100, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 132 */       ((List<VillagerTrades.ItemListing>)trades.get(4)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 10), new ItemStack((ItemLike)Items.f_283830_, 1), 3, 100, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 138 */       ((List<VillagerTrades.ItemListing>)trades.get(5)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 12), new ItemStack((ItemLike)Items.f_42711_, 1), 3, 150, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 144 */       ((List<VillagerTrades.ItemListing>)trades.get(5)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 12), new ItemStack((ItemLike)Items.f_42712_, 1), 3, 150, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 150 */       ((List<VillagerTrades.ItemListing>)trades.get(5)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 12), new ItemStack((ItemLike)Items.f_42703_, 1), 3, 150, 0.02F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 156 */       ((List<VillagerTrades.ItemListing>)trades.get(5)).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack((ItemLike)Items.f_42417_, 20), new ItemStack((ItemLike)Items.f_186363_, 1), 3, 200, 0.02F));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onCommandsRegister(RegisterCommandsEvent event) {
/* 167 */     new SetHomeCommand(event.getDispatcher());
/* 168 */     new ReturnHomeCommand(event.getDispatcher());
/*     */     
/* 170 */     ConfigCommand.register(event.getDispatcher());
/*     */   }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerCloned(PlayerEvent.Clone event) {
/* 176 */     event.getEntity().getPersistentData()
/* 177 */       .m_128385_("expansionmod.homepos", event.getOriginal().getPersistentData()
/* 178 */         .m_128465_("expansionmod.homepos"));
/*     */   }
/*     */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\event\ModEvents.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */