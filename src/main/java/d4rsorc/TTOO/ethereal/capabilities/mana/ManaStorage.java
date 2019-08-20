package d4rsorc.TTOO.ethereal.capabilities.mana;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class ManaStorage implements IStorage<IMana> {
	
	public final String MANARATE = "intentrate";
	public final String MANA = "intent";
	
    @Override
    public NBTBase writeNBT(Capability<IMana> capability, IMana instance, EnumFacing side)
    {
    	NBTTagCompound tag = new NBTTagCompound();
        tag.setFloat(MANARATE, instance.getManaRate());
        tag.setFloat(MANA, instance.getMana());
    	return tag;
    }

    @Override
    public void readNBT(Capability<IMana> capability, IMana instance, EnumFacing side, NBTBase nbt)
    {
    	instance.setMana(((NBTTagCompound) nbt).getFloat(MANA));
    	instance.setManaRate(((NBTTagCompound) nbt).getFloat(MANARATE));
    }

}
