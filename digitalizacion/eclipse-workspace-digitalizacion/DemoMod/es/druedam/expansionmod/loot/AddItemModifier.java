/*    */ package es.druedam.expansionmod.loot;
/*    */ 
/*    */ import com.google.common.base.Suppliers;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
/*    */ import net.minecraftforge.common.loot.IGlobalLootModifier;
/*    */ import net.minecraftforge.common.loot.LootModifier;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AddItemModifier
/*    */   extends LootModifier
/*    */ {
/* 26 */   public static final Supplier<Codec<AddItemModifier>> CODEC = (Supplier<Codec<AddItemModifier>>)Suppliers.memoize(() -> RecordCodecBuilder.create(()));
/*    */ 
/*    */   
/*    */   private final Item item;
/*    */ 
/*    */   
/*    */   public AddItemModifier(LootItemCondition[] conditionsIn, Item item) {
/* 33 */     super(conditionsIn);
/* 34 */     this.item = item;
/*    */   }
/*    */ 
/*    */   
/*    */   public Codec<? extends IGlobalLootModifier> codec() {
/* 39 */     return (Codec<? extends IGlobalLootModifier>)CODEC.get();
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
/* 45 */     for (LootItemCondition condition : this.conditions) {
/*    */       
/* 47 */       if (!condition.test(context))
/*    */       {
/* 49 */         return generatedLoot;
/*    */       }
/*    */     } 
/*    */     
/* 53 */     generatedLoot.add(new ItemStack((ItemLike)this.item));
/*    */ 
/*    */     
/* 56 */     return generatedLoot;
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\loot\AddItemModifier.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */