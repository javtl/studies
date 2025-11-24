/*    */ package es.druedam.expansionmod.painting;
/*    */ 
/*    */ import net.minecraft.world.entity.decoration.PaintingVariant;
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
/*    */ public class ModPaintings
/*    */ {
/* 20 */   public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, "druedams_expansion_mod");
/*    */   
/* 22 */   public static final RegistryObject<PaintingVariant> MOUSE = PAINTING_VARIANTS.register("mouse", () -> new PaintingVariant(16, 16));
/*    */ 
/*    */   
/* 25 */   public static final RegistryObject<PaintingVariant> SAD_MOUSE = PAINTING_VARIANTS.register("sad_mouse", () -> new PaintingVariant(32, 32));
/*    */ 
/*    */   
/* 28 */   public static final RegistryObject<PaintingVariant> ULTRAKILL = PAINTING_VARIANTS.register("ultrakill", () -> new PaintingVariant(32, 64));
/*    */ 
/*    */   
/* 31 */   public static final RegistryObject<PaintingVariant> RODRICK = PAINTING_VARIANTS.register("rodrick", () -> new PaintingVariant(32, 32));
/*    */ 
/*    */   
/* 34 */   public static final RegistryObject<PaintingVariant> SPAIN_FLAG = PAINTING_VARIANTS.register("spain_flag", () -> new PaintingVariant(32, 16));
/*    */ 
/*    */   
/* 37 */   public static final RegistryObject<PaintingVariant> BROCOLI = PAINTING_VARIANTS.register("brocoli", () -> new PaintingVariant(32, 16));
/*    */ 
/*    */   
/* 40 */   public static final RegistryObject<PaintingVariant> MICHAEL_JACKSON = PAINTING_VARIANTS.register("michael_jackson", () -> new PaintingVariant(48, 64));
/*    */ 
/*    */   
/* 43 */   public static final RegistryObject<PaintingVariant> AMONG_US = PAINTING_VARIANTS.register("among_us", () -> new PaintingVariant(16, 16));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void register(IEventBus eventBus) {
/* 50 */     PAINTING_VARIANTS.register(eventBus);
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\painting\ModPaintings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */