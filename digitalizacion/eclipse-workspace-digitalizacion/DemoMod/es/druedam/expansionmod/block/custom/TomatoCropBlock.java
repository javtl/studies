/*    */ package es.druedam.expansionmod.block.custom;
/*    */ 
/*    */ import es.druedam.expansionmod.item.ModItems;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.CropBlock;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.IntegerProperty;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TomatoCropBlock
/*    */   extends CropBlock
/*    */ {
/*    */   public static final int MAX_AGE = 4;
/* 25 */   public static final IntegerProperty AGE = IntegerProperty.m_61631_("age", 0, 4);
/*    */ 
/*    */ 
/*    */   
/*    */   public TomatoCropBlock(BlockBehaviour.Properties pProperties) {
/* 30 */     super(pProperties);
/*    */   }
/*    */ 
/*    */   
/*    */   protected ItemLike m_6404_() {
/* 35 */     return (ItemLike)ModItems.TOMATO_SEEDS.get();
/*    */   }
/*    */ 
/*    */   
/*    */   public IntegerProperty m_7959_() {
/* 40 */     return AGE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7419_() {
/* 45 */     return 4;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> pBuilder) {
/* 50 */     pBuilder.m_61104_(new Property[] { (Property)AGE });
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\block\custom\TomatoCropBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */