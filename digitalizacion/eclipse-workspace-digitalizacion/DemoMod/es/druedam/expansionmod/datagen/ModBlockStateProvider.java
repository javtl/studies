/*    */ package es.druedam.expansionmod.datagen;
/*    */ 
/*    */ import es.druedam.expansionmod.block.ModBlocks;
/*    */ import es.druedam.expansionmod.block.custom.StrawberryCropBlock;
/*    */ import es.druedam.expansionmod.block.custom.TomatoCropBlock;
/*    */ import java.util.function.Function;
/*    */ import net.minecraft.data.PackOutput;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.CropBlock;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraftforge.client.model.generators.BlockModelBuilder;
/*    */ import net.minecraftforge.client.model.generators.BlockStateProvider;
/*    */ import net.minecraftforge.client.model.generators.ConfiguredModel;
/*    */ import net.minecraftforge.client.model.generators.ModelFile;
/*    */ import net.minecraftforge.common.data.ExistingFileHelper;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModBlockStateProvider
/*    */   extends BlockStateProvider
/*    */ {
/*    */   public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
/* 31 */     super(output, "druedams_expansion_mod", exFileHelper);
/*    */   }
/*    */ 
/*    */   
/*    */   public void makeTomatoCrop(CropBlock block, String modelName, String textureName) {
/* 36 */     Function<BlockState, ConfiguredModel[]> function = state -> tomatoStates(state, block, modelName, textureName);
/* 37 */     getVariantBuilder((Block)block).forAllStates(function);
/*    */   }
/*    */ 
/*    */   
/*    */   private ConfiguredModel[] tomatoStates(BlockState state, CropBlock block, String modelName, String textureName) {
/* 42 */     ConfiguredModel[] models = new ConfiguredModel[1];
/* 43 */     models[0] = new ConfiguredModel((ModelFile)((BlockModelBuilder)models().crop(modelName + modelName, new ResourceLocation("druedams_expansion_mod", "block/" + textureName + state
/* 44 */             .m_61143_((Property)((TomatoCropBlock)block).m_7959_())))).renderType("cutout"));
/* 45 */     return models;
/*    */   }
/*    */ 
/*    */   
/*    */   public void makeStrawberryCrop(CropBlock block, String modelName, String textureName) {
/* 50 */     Function<BlockState, ConfiguredModel[]> function = state -> strawberryStages(state, block, modelName, textureName);
/* 51 */     getVariantBuilder((Block)block).forAllStates(function);
/*    */   }
/*    */ 
/*    */   
/*    */   private ConfiguredModel[] strawberryStages(BlockState state, CropBlock block, String modelName, String textureName) {
/* 56 */     ConfiguredModel[] models = new ConfiguredModel[1];
/* 57 */     models[0] = new ConfiguredModel((ModelFile)((BlockModelBuilder)models().crop(modelName + modelName, new ResourceLocation("druedams_expansion_mod", "block/" + textureName + state
/* 58 */             .m_61143_((Property)((StrawberryCropBlock)block).m_7959_())))).renderType("cutout"));
/* 59 */     return models;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void registerStatesAndModels() {
/* 65 */     makeTomatoCrop((CropBlock)ModBlocks.TOMATO_CROP.get(), "tomato_stage", "tomato_stage");
/* 66 */     makeStrawberryCrop((CropBlock)ModBlocks.STRAWBERRY_CROP.get(), "strawberry_stage", "strawberry_stage");
/* 67 */     blockWithItem(ModBlocks.ORE_FLUORITE);
/* 68 */     blockWithItem(ModBlocks.DEEPSLATE_FLUORITE);
/*    */   }
/*    */ 
/*    */   
/*    */   private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
/* 73 */     simpleBlockWithItem((Block)blockRegistryObject.get(), cubeAll((Block)blockRegistryObject.get()));
/*    */   }
/*    */ }


/* Location:              C:\Users\JAVI\Downloads\druedams_expansion_mod-0.1-1.20.1.jar!\es\druedam\expansionmod\datagen\ModBlockStateProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */