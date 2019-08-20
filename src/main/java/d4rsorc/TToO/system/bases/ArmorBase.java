package d4rsorc.TToO.system.bases;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorBase extends ItemArmor{

	public ArmorBase(String name,int durability,int protection, float toughness, EntityEquipmentSlot equipmentSlotIn) {
		super(getArmorMaterial(name,durability,protection,toughness), 0, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	private static ArmorMaterial getArmorMaterial(String name,int durability, int protection, float toughness) {
		return EnumHelper.addArmorMaterial(name, name, durability, new int[]{protection, protection, protection, protection}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, toughness);
	}

}
