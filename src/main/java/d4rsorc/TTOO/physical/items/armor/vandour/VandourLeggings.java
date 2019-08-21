package d4rsorc.TTOO.physical.items.armor.vandour;

import d4rsorc.TTOO.system.bases.ArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class VandourLeggings extends ArmorBase {
	
	public static final String NAME = "vandour_leggings";
	
	public VandourLeggings() {
		super(NAME, 15, 5, 1.0f, EntityEquipmentSlot.LEGS);
	}

}