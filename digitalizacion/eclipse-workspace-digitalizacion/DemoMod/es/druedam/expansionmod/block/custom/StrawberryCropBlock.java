/*    */ package es.druedam.expansionmod.block.custom;
/*    */ 
/*    */ import es.druedam.expansionmod.item.ModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.CropBlock;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.IntegerProperty;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.phys.shapes.CollisionContext;
/*    */ import net.minecraft.world.phys.shapes.VoxelShape;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class StrawberryCropBlock
/*    */   extends CropBlock
/*    */ {
/*    */   public static final int MAX_AGE = 7;
/* 29 */   public static final IntegerProperty AGE = IntegerProperty.m_61631_("age", 0, 7);
/* 30 */   private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[] { Block.m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D), Block.m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D), Block.m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D), Block.m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D) };
/*    */ 
/*    */ 
/*    */   
/*    */   public StrawberryCropBlock(BlockBehaviour.Properties pProperties) {
/* 35 */     super(pProperties);
/*    */   }
/*    */ 
/*    */   
/*    */   public VoxelShape m_5940_(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
/* 40 */     return SHAPE_BY_AGE[m_52305_(pState)];
/*    */   }
/*    */ 
/*    */   
/*    */   protected ItemLike m_6404_() {
/* 45 */     return (ItemLike)ModItems.STRAWBERRY_SEEDS.get();
/*    */   }
/*    */ 
/*    */   
/*    */   public IntegerProperty m_7959_() {
/* 50 */     return AGE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7419_() {
/* 55 */     return 7;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> pBuilder) {
/* 60 */     pBuilder.m_61104_(new Property[] { (Property)AGE });
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\block\custom\StrawberryCropBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */