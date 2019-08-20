package d4rsorc.TTOO.system.init;

import javax.annotation.Nullable;

import d4rsorc.TTOO.system.utils.Reference;
import d4rsorc.TTOO.system.worldgen.WorldProviderTest;
import d4rsorc.TTOO.system.worldgen.WorldTypeTest;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod.EventBusSubscriber
public class DimensionRegistration {
	public static final String DIM_NAME = "test";
    public static final int TEST_DIM_ID = findFreeDimensionID();
    public static final DimensionType TEST_DIM_TYPE = DimensionType.register(DIM_NAME, "_"+DIM_NAME, TEST_DIM_ID, WorldProviderTest.class, true);
    public static final WorldType TEST_WORLD_TYPE = new WorldTypeTest();
    
    /**
     * Register dimensions.
     */
    public static final void registerDimensions()
    {
        DimensionManager.registerDimension(TEST_DIM_ID, TEST_DIM_TYPE);
    }
    
    @Nullable
    private static Integer findFreeDimensionID()
    {
        for (int i=2; i<Integer.MAX_VALUE; i++)
        {
            if (!DimensionManager.isDimensionRegistered(i))
            {
                // DEBUG
                System.out.println("Found free dimension ID = "+i);
                return i;
            }
        }
        
        // DEBUG
        System.out.println("ERROR: Could not find free dimension ID");
        return null;
    }

    /**
     * Register world generators.
     */
    public static void registerWorldGenerators()
    {
        // DEBUG
        System.out.println("Registering world generators");
        //GameRegistry.registerWorldGenerator(new WorldGenTest(), 10);
    }

}
