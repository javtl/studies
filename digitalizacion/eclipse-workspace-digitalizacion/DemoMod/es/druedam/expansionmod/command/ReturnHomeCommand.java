/*    */ package es.druedam.expansionmod.command;
/*    */ 
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.commands.Commands;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerPlayer;
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
/*    */ public class ReturnHomeCommand
/*    */ {
/*    */   public ReturnHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
/* 25 */     dispatcher.register((LiteralArgumentBuilder)Commands.m_82127_("home").then(Commands.m_82127_("return")
/* 26 */           .executes(this::execute)));
/*    */   }
/*    */ 
/*    */   
/*    */   private int execute(CommandContext<CommandSourceStack> context) {
/* 31 */     ServerPlayer player = ((CommandSourceStack)context.getSource()).m_230896_();
/* 32 */     boolean hasHomepos = ((player.getPersistentData().m_128465_("expansionmod.homepos")).length != 0);
/*    */     
/* 34 */     if (hasHomepos) {
/*    */       
/* 36 */       int[] playerPos = player.getPersistentData().m_128465_("expansionmod.homepos");
/* 37 */       player.m_6021_(playerPos[0], playerPos[1], playerPos[2]);
/*    */       
/* 39 */       ((CommandSourceStack)context.getSource()).m_288197_(() -> Component.m_237113_(player.m_7755_().getString() + " has returned to home"), true);
/* 40 */       return 1;
/*    */     } 
/*    */ 
/*    */     
/* 44 */     ((CommandSourceStack)context.getSource()).m_81352_((Component)Component.m_237113_("No home position has been set"));
/* 45 */     return -1;
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\command\ReturnHomeCommand.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */