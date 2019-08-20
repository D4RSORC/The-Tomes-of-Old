package d4rsorc.TTOO.system.init;

import javax.annotation.Nonnull;

import d4rsorc.TTOO.TTOO;
import d4rsorc.TTOO.system.utils.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod.EventBusSubscriber
public class EntityRegistration {
	
	@SubscribeEvent
	public static void onRegisterEntitiesEvent(@Nonnull final RegistryEvent.Register<EntityEntry> event) {
		//registerEntity();
		registerEntityRenders();
	}
	
	public static void registerEntityRenders()
	{
		/*
		RenderingRegistry.registerEntityRenderingHandler(InvaderEnemy.class, new IRenderFactory<InvaderEnemy>()
		{
			@Override
			public Render<? super InvaderEnemy> createRenderFor(RenderManager manager) 
			{
				return new RenderInvader(manager);
			}
		});
		*/
	}
	
	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID,name), entity, name, id, TTOO.instance, range, 1, true, color1, color2);
	}
	
}
