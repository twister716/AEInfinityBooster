
package uk.co.hexeption.aeinfinitybooster.datagen;

import appeng.core.definitions.AEItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import uk.co.hexeption.aeinfinitybooster.AEInfinityBooster;
import uk.co.hexeption.aeinfinitybooster.setup.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * RecipeGenerator
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 14/02/2021 - 06:35 pm
 */
public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INFINITY_CARD.get())
                .pattern("ERE").pattern("RSR").pattern("NNN")
                .define('E', Items.ENDER_EYE)
                .define('R', AEItems.WIRELESS_BOOSTER.asItem())
                .define('S', Items.NETHER_STAR)
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy("has_item", has(Items.NETHERITE_INGOT))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(AEInfinityBooster.MODID, "infinity_card"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIMENSION_CARD.get())
                .pattern("RNR").pattern("NEN").pattern("RNR")
                .define('R', ModItems.INFINITY_CARD.get())
                .define('E', Items.ENDER_EYE)
                .define('N', Items.NETHER_STAR)
                .unlockedBy("has_item", has(ModItems.INFINITY_CARD.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(AEInfinityBooster.MODID, "dimension_card"));
    }

}
