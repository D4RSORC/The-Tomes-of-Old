package d4rsorc.TTOO.ethereal.capabilities.alignment;

import d4rsorc.TTOO.ethereal.capabilities.alignment.IAlignment;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class AlignmentStorage implements IStorage<IAlignment> {
	
	public final String VANDOURAN = "vandouran";
	public final String GRATYI = "gratyi";
	public final String HAIN = "hain";
	public final String UTMA = "utma";
	
    @Override
    public NBTBase writeNBT(Capability<IAlignment> capability, IAlignment instance, EnumFacing side)
    {
    	NBTTagCompound tag = new NBTTagCompound();
    	tag.setInteger(VANDOURAN, instance.getVandouranAlignment());
    	tag.setInteger(GRATYI, instance.getGratyiAlignment());
    	tag.setInteger(HAIN, instance.getHainAlignment());
    	tag.setInteger(UTMA, instance.getUtmaAlignment());
    	return tag;
    }

    @Override
    public void readNBT(Capability<IAlignment> capability, IAlignment instance, EnumFacing side, NBTBase nbt)
    {
    	instance.setGratyiAlignment(((NBTTagCompound) nbt).getInteger(GRATYI));
    	instance.setHainAlignment(((NBTTagCompound) nbt).getInteger(HAIN));
    	instance.setUtmaAlignment(((NBTTagCompound) nbt).getInteger(UTMA));
    	instance.setVandouranAlignment(((NBTTagCompound) nbt).getInteger(VANDOURAN));
    }

}
