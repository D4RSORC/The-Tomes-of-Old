package d4rsorc.TTOO.physical.items.armor.vandour;

import d4rsorc.TTOO.system.bases.ArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class VandourBoots extends ArmorBase {

	public static final String NAME = "vandour_boots";
	
	public VandourBoots() {
		super(NAME, 15, 3, 1.0f, EntityEquipmentSlot.FEET);
	}

}
