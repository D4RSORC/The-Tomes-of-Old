package d4rsorc.TTOO.system.init;

import d4rsorc.TTOO.ethereal.capabilities.alignment.Alignment;
import d4rsorc.TTOO.ethereal.capabilities.alignment.AlignmentProvider;
import d4rsorc.TTOO.ethereal.capabilities.alignment.AlignmentStorage;
import d4rsorc.TTOO.ethereal.capabilities.alignment.IAlignment;
import d4rsorc.TTOO.ethereal.capabilities.mana.IMana;
import d4rsorc.TTOO.ethereal.capabilities.mana.Mana;
import d4rsorc.TTOO.ethereal.capabilities.mana.ManaProvider;
import d4rsorc.TTOO.ethereal.capabilities.mana.ManaStorage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CapabilityRegistration {
	
	//called in proxy
	public static void registerCapabilities() {
		CapabilityManager.INSTANCE.register(IMana.class, new ManaStorage(), Mana::new);
		CapabilityManager.INSTANCE.register(IAlignment.class,new AlignmentStorage(), Alignment::new);
	}
	
	@SubscribeEvent
	public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event)
	{
		if(event.getObject() instanceof EntityPlayer)
		{
			event.addCapability(IMana.RL, new ManaProvider());
			event.addCapability(IAlignment.RL, new AlignmentProvider());
		}
	}

}
