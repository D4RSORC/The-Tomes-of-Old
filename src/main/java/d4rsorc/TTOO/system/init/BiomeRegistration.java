package d4rsorc.TTOO.system.init;

import d4rsorc.TTOO.system.utils.Reference;
import d4rsorc.TTOO.system.worldgen.BiomeTest;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
@ObjectHolder(Reference.MODID)
public class BiomeRegistration {
	
	 public final static BiomeTest test = null;
	
	@SubscribeEvent
    public static void onEvent(final RegistryEvent.Register<Biome> event)
    {
        final IForgeRegistry<Biome> registry = event.getRegistry();

        System.out.println("Registering biomes");
        
        registry.register(new BiomeTest().setRegistryName(Reference.MODID, DimensionRegistration.DIM_NAME));
    }
}
