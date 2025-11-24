/*    */ package es.druedam.expansionmod.command;
/*    */ 
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.commands.Commands;
/*    */ import net.minecraft.core.BlockPos;
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
/*    */ public class SetHomeCommand
/*    */ {
/*    */   public SetHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
/* 25 */     dispatcher.register((LiteralArgumentBuilder)Commands.m_82127_("home").then(Commands.m_82127_("save")
/* 26 */           .executes(this::execute)));
/*    */   }
/*    */ 
/*    */   
/*    */   private int execute(CommandContext<CommandSourceStack> context) {
/* 31 */     ServerPlayer player = ((CommandSourceStack)context.getSource()).m_230896_();
/* 32 */     BlockPos playerPos = player.m_20183_();
/* 33 */     String positionString = "(" + playerPos.m_123341_() + "," + playerPos.m_123342_() + "," + playerPos.m_123343_() + ")";
/*    */     
/* 35 */     player.getPersistentData().m_128385_("expansionmod.homepos", new int[] { playerPos
/* 36 */           .m_123341_(), playerPos.m_123342_(), playerPos.m_123343_() });
/* 37 */     ((CommandSourceStack)context.getSource()).m_288197_(() -> Component.m_237113_(player.m_7755_().getString() + " has setted his home at " + player.m_7755_().getString()), true);
/* 38 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\command\SetHomeCommand.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */