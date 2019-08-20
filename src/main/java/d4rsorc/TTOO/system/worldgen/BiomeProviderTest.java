package d4rsorc.TTOO.system.worldgen;

import d4rsorc.TTOO.system.init.BiomeRegistration;
import net.minecraft.world.biome.BiomeProviderSingle;

public class BiomeProviderTest extends BiomeProviderSingle{

	public BiomeProviderTest() {
		super(BiomeRegistration.test);
	}

}
