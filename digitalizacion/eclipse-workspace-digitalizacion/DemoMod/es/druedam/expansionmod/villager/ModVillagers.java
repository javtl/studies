/*    */ package es.druedam.expansionmod.villager;
/*    */ 
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import es.druedam.expansionmod.sound.ModSounds;
/*    */ import java.util.Collection;
/*    */ import java.util.Set;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.world.entity.ai.village.poi.PoiType;
/*    */ import net.minecraft.world.entity.npc.VillagerProfession;
/*    */ import net.minecraft.world.level.block.Blocks;
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
/*    */ public class ModVillagers
/*    */ {
/* 28 */   public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, "druedams_expansion_mod");
/*    */ 
/*    */   
/* 31 */   public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, "druedams_expansion_mod");
/*    */ 
/*    */   
/* 34 */   public static final RegistryObject<PoiType> MUSIC_MICHAEL = POI_TYPES.register("sound_poi", () -> new PoiType((Set)ImmutableSet.copyOf((Collection)Blocks.f_50065_.m_49965_().m_61056_()), 1, 1));
/*    */ 
/*    */ 
/*    */   
/* 38 */   public static final RegistryObject<VillagerProfession> MICHAEL_JACKSON = VILLAGER_PROFESSIONS
/* 39 */     .register("michael_jackson", () -> new VillagerProfession("michael_jackson", (), (), ImmutableSet.of(), ImmutableSet.of(), (SoundEvent)ModSounds.MICHAEL_JACKSON_AMBIENT.get()));
/*    */ 
/*    */ 
/*    */   
/*    */   public static void register(IEventBus eventBus) {
/* 44 */     POI_TYPES.register(eventBus);
/* 45 */     VILLAGER_PROFESSIONS.register(eventBus);
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\villager\ModVillagers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */