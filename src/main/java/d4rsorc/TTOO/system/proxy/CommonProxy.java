package d4rsorc.TTOO.system.proxy;

import d4rsorc.TTOO.system.init.CapabilityRegistration;
import d4rsorc.TTOO.system.init.TileEntityRegistration;
import net.minecraftforge.fml.common.event.FMLStateEvent;

public class CommonProxy {
	
	public void PreInit(FMLStateEvent event)
	{
		TileEntityRegistration.registerTileEntities();
		CapabilityRegistration.registerCapabilities();
	}
	
	public void Init(FMLStateEvent event)
	{
		
	}
	
	public void PostInit(FMLStateEvent event)
	{
		
	}

}
