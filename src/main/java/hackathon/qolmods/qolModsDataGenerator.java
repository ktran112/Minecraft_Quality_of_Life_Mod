package hackathon.qolmods;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class QoLModsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator gen) {
        // add providers here later, e.g. gen.createPack().addProvider(MyLootProvider::new);
        System.out.println("[QoLMods] datagen init");
    }
}
