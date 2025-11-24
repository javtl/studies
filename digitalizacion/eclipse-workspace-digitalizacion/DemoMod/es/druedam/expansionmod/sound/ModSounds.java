/*    */ package es.druedam.expansionmod.sound;
/*    */ 
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
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
/*    */ 
/*    */ public class ModSounds
/*    */ {
/* 23 */   public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "druedams_expansion_mod");
/*    */   
/* 25 */   public static final RegistryObject<SoundEvent> MICHAEL_JACKSON_AMBIENT = registerSoundEvents("michael_jackson_ambient");
/*    */ 
/*    */   
/*    */   private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
/* 29 */     return SOUND_EVENTS.register(name, () -> SoundEvent.m_262824_(new ResourceLocation("druedams_expansion_mod", name)));
/*    */   }
/*    */ 
/*    */   
/*    */   public static void register(IEventBus eventBus) {
/* 34 */     SOUND_EVENTS.register(eventBus);
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\sound\ModSounds.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */