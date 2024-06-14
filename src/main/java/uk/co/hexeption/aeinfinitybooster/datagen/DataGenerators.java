package uk.co.hexeption.aeinfinitybooster.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import uk.co.hexeption.aeinfinitybooster.AEInfinityBooster;

/**
 * RSInfinityBoosterDataGen
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 14/02/2021 - 06:48 pm
 */
@EventBusSubscriber(modid = AEInfinityBooster.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class DataGenerators {

    private DataGenerators() {
    }

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        generator.addProvider(true, (DataProvider.Factory<RecipeGenerator>) p_253851_ -> new RecipeGenerator(generator.getPackOutput(), event.getLookupProvider()));
    }
}
