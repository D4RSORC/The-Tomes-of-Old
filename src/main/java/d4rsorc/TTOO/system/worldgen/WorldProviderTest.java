package d4rsorc.TTOO.system.worldgen;

import d4rsorc.TTOO.system.init.DimensionRegistration;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

public class WorldProviderTest extends WorldProvider{

	@Override
	public DimensionType getDimensionType() {
		return DimensionRegistration.TEST_DIM_TYPE;
	}

}
