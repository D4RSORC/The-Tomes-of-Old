package d4rsorc.TTOO.ethereal.capabilities.mana;

import d4rsorc.TTOO.system.utils.Reference;
import net.minecraft.util.ResourceLocation;

public interface IMana {
	
	public final String MANA = "mana";
	ResourceLocation RL = new ResourceLocation(Reference.MODID, MANA);
	
    public void consumeMana(float points);

    public void fillMana(float points);

    public void setMana(float points);

    public float getMana();
    
    public void setManaRate(float rate);

	public float getManaRate();

}
