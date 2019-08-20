package d4rsorc.TToO.physical.items.armor.vandour;

import d4rsorc.TToO.system.bases.ArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class VandourChest extends ArmorBase {
	
	public static final String NAME = "vandour_chest";
	
	public VandourChest() {
		super(NAME, 15, 6, 1.0f, EntityEquipmentSlot.CHEST);
	}

}
