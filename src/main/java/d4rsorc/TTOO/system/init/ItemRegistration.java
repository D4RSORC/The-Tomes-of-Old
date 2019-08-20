package d4rsorc.TTOO.system.init;

import d4rsorc.TTOO.physical.items.armor.vandour.VandourHelm;
import d4rsorc.TTOO.system.bases.ArmorBase;
import d4rsorc.TTOO.system.utils.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
@ObjectHolder(Reference.MODID)
public class ItemRegistration {
	
	//Step one create object holder
	//public static final ItemBase item = null;
	public static final ArmorBase vandour_helm = null;

	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		final IForgeRegistry<Item> registry = event.getRegistry();
		//step two register item
		//registry.register(new Item());
		registry.register(new VandourHelm());
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event) {
		
		//step three register model
		//registerModel(item);
		registerModel(vandour_helm);

		
	}
	
	public static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
