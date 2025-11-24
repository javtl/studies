/*    */ package es.druedam.expansionmod.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.level.Level;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AppendTextItem
/*    */   extends Item
/*    */ {
/*    */   private final String appendText;
/*    */   
/*    */   public AppendTextItem(Item.Properties pProperties, String appendText) {
/* 31 */     super(pProperties);
/* 32 */     this.appendText = appendText;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
/* 38 */     pTooltipComponents.add(Component.m_237115_(this.appendText));
/* 39 */     super.m_7373_(pStack, pLevel, pTooltipComponents, pIsAdvanced);
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\item\AppendTextItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */