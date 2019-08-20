package d4rsorc.TTOO.system.init;


import d4rsorc.TTOO.system.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
public class BlockRegistration {
	
	//Step one: create object holder
	//public static final Block test = null;
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		final IForgeRegistry<Block> registry = event.getRegistry();
		//step two register block
		//registry.register(new block());
		
	}
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		final IForgeRegistry<Item> registry = event.getRegistry();
		//step three register itemblock by passing in the object holder
		//registerItem(test,registry);
		
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event) {
		
		//step four register model with object holder
		//registerModel(test);
		
	}
	
	private static void registerModel(Block block) 
	{
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	private static void registerItem(Block block, IForgeRegistry<Item> registry) 
	{
		registry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


}
