package d4rsorc.TTOO.system.worldgen;

import d4rsorc.TTOO.system.init.DimensionRegistration;
import net.minecraft.world.biome.Biome;

public class BiomeTest extends Biome{

	public BiomeTest() {
		super(new BiomeProperties(DimensionRegistration.DIM_NAME)
                .setBaseHeight(1.0F)
                .setHeightVariation(0.2F)
                .setTemperature(0.2F));
	}

}
