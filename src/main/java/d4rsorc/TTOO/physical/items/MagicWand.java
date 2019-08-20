package d4rsorc.TTOO.physical.items;

import d4rsorc.TTOO.ethereal.capabilities.mana.IMana;
import d4rsorc.TTOO.system.bases.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public class MagicWand extends ItemBase {

	public static final String NAME = "magic_wand";
	
	public MagicWand() {
		super(NAME);
	}
	
	@CapabilityInject(IMana.class)
    public static final Capability<IMana> MANA_CAPABILITY = null;
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		
		if(playerIn.hasCapability(MANA_CAPABILITY, null)) {
			IMana capability = playerIn.getCapability(MANA_CAPABILITY, null);
			System.out.println("Current Mana: " + capability.getMana());
			capability.fillMana(10);
		}
		
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
