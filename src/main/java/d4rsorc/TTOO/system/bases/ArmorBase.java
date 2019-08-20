package d4rsorc.TTOO.system.bases;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorBase extends ItemArmor implements ISpecialArmor{

	public ArmorBase(String name,int durability,int protection, int toughness, EntityEquipmentSlot equipmentSlotIn) {
		super(getArmorMaterial(name,durability,protection,toughness), 0, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	private static ArmorMaterial getArmorMaterial(String name,int durability, int protection, int toughness) {
		return EnumHelper.addArmorMaterial(name, name, durability, new int[]{protection, protection, protection, protection}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, toughness);
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage,
			int slot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
		// TODO Auto-generated method stub
		
	}

}
