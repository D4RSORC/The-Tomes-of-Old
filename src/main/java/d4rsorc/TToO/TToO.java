package d4rsorc.TToO;

import d4rsorc.TToO.system.proxy.CommonProxy;
import d4rsorc.TToO.system.utils.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TToO
{
	@Instance
	public static TToO instance;
	
	@SidedProxy(clientSide = "d4rsorc.TToO.system.proxy.ClientProxy", serverSide = "d4rsorc.TToO.system.proxy.ServerProxy")
	public static CommonProxy proxy;

    //private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //logger = event.getModLog();
        proxy.PreInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.Init(event);
    }
    
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		proxy.PostInit(event);
	}
}
