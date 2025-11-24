/*     */ package es.druedam.expansionmod.block.custom;
/*     */ 
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.stats.Stats;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.LevelReader;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.StateDefinition;
/*     */ import net.minecraft.world.level.block.state.properties.BlockStateProperties;
/*     */ import net.minecraft.world.level.block.state.properties.IntegerProperty;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.gameevent.GameEvent;
/*     */ import net.minecraft.world.level.pathfinder.PathComputationType;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraft.world.phys.shapes.CollisionContext;
/*     */ import net.minecraft.world.phys.shapes.VoxelShape;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PizzaBlock
/*     */   extends Block
/*     */ {
/*     */   public static final int MAX_BITES = 6;
/*  47 */   public static final IntegerProperty BITES = BlockStateProperties.f_61412_;
/*  48 */   public static final int FULL_CAKE_SIGNAL = getOutputSignal(0);
/*     */   protected static final float AABB_OFFSET = 1.0F;
/*     */   protected static final float AABB_SIZE_PER_BITE = 2.0F;
/*  51 */   protected static final VoxelShape[] SHAPE_BY_BITE = new VoxelShape[] { Block.m_49796_(1.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D), Block.m_49796_(3.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D), Block.m_49796_(5.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D), Block.m_49796_(7.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D), Block.m_49796_(9.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D), Block.m_49796_(11.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D), Block.m_49796_(13.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D) };
/*     */   
/*     */   public PizzaBlock(BlockBehaviour.Properties pProperties) {
/*  54 */     super(pProperties);
/*  55 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)BITES, Integer.valueOf(0)));
/*     */   }
/*     */   
/*     */   public VoxelShape m_5940_(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
/*  59 */     return SHAPE_BY_BITE[((Integer)pState.m_61143_((Property)BITES)).intValue()];
/*     */   }
/*     */   
/*     */   public InteractionResult m_6227_(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
/*  63 */     ItemStack itemstack = pPlayer.m_21120_(pHand);
/*     */     
/*  65 */     if (pLevel.f_46443_) {
/*  66 */       if (eat((LevelAccessor)pLevel, pPos, pState, pPlayer).m_19077_()) {
/*  67 */         return InteractionResult.SUCCESS;
/*     */       }
/*     */       
/*  70 */       if (itemstack.m_41619_()) {
/*  71 */         return InteractionResult.CONSUME;
/*     */       }
/*     */     } 
/*     */     
/*  75 */     return eat((LevelAccessor)pLevel, pPos, pState, pPlayer);
/*     */   }
/*     */   
/*     */   protected static InteractionResult eat(LevelAccessor pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
/*  79 */     if (!pPlayer.m_36391_(false)) {
/*  80 */       return InteractionResult.PASS;
/*     */     }
/*  82 */     pPlayer.m_36220_(Stats.f_12942_);
/*  83 */     pPlayer.m_36324_().m_38707_(5, 0.5F);
/*  84 */     pPlayer.m_7292_(new MobEffectInstance(MobEffects.f_19603_, 2000, 3));
/*     */     
/*  86 */     int i = ((Integer)pState.m_61143_((Property)BITES)).intValue();
/*  87 */     pLevel.m_142346_((Entity)pPlayer, GameEvent.f_157806_, pPos);
/*  88 */     if (i < 6) {
/*  89 */       pLevel.m_7731_(pPos, (BlockState)pState.m_61124_((Property)BITES, Integer.valueOf(i + 1)), 3);
/*     */     } else {
/*  91 */       pLevel.m_7471_(pPos, false);
/*  92 */       pLevel.m_142346_((Entity)pPlayer, GameEvent.f_157794_, pPos);
/*     */     } 
/*     */     
/*  95 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BlockState m_7417_(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
/* 106 */     return (pFacing == Direction.DOWN && !pState.m_60710_((LevelReader)pLevel, pCurrentPos)) ? Blocks.f_50016_.m_49966_() : super.m_7417_(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
/*     */   }
/*     */   
/*     */   public boolean m_7898_(BlockState pState, LevelReader pLevel, BlockPos pPos) {
/* 110 */     return pLevel.m_8055_(pPos.m_7495_()).m_280296_();
/*     */   }
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> pBuilder) {
/* 114 */     pBuilder.m_61104_(new Property[] { (Property)BITES });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int m_6782_(BlockState pBlockState, Level pLevel, BlockPos pPos) {
/* 125 */     return getOutputSignal(((Integer)pBlockState.m_61143_((Property)BITES)).intValue());
/*     */   }
/*     */   
/*     */   public static int getOutputSignal(int pEaten) {
/* 129 */     return (7 - pEaten) * 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m_7278_(BlockState pState) {
/* 138 */     return true;
/*     */   }
/*     */   
/*     */   public boolean m_7357_(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
/* 142 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_214162_(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {
/* 148 */     if (pRandom.m_188503_(5) == 0)
/* 149 */       for (int i = 0; i < pRandom.m_188503_(1) + 1; i++)
/* 150 */         pLevel.m_7106_((ParticleOptions)ParticleTypes.f_123777_, pPos.m_123341_() + 0.0D + pRandom.m_188500_() + 0.2D, pPos.m_123342_() + 0.5D, pPos.m_123343_() + 0.0D + pRandom.m_188500_() + 0.2D, 0.0D, 0.01D, 0.0D);  
/*     */   }
/*     */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\block\custom\PizzaBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */