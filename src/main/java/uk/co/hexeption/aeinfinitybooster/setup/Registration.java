package uk.co.hexeption.aeinfinitybooster.setup;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.co.hexeption.aeinfinitybooster.AEInfinityBooster;

/**
 * Registration
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 22/12/2021 - 08:50 am
 */
public class Registration {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AEInfinityBooster.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

        ModItems.register();
    }

}
