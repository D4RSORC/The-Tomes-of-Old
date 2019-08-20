package d4rsorc.TTOO.system.init;

import d4rsorc.TTOO.system.utils.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod.EventBusSubscriber
@ObjectHolder(Reference.MODID)
public class TileEntityRegistration {
	
	public static void registerTileEntities(){
		//GameRegistry.registerTileEntity(TileEntity.class, new ResourceLocation(Reference.MODID,"tile_entity"));
	}

}
