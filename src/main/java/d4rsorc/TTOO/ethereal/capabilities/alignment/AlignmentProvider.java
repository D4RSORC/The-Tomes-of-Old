package d4rsorc.TTOO.ethereal.capabilities.alignment;

import d4rsorc.TTOO.ethereal.capabilities.alignment.IAlignment;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class AlignmentProvider implements ICapabilitySerializable<NBTBase> {
	
 	@CapabilityInject(IAlignment.class)
    public static final Capability<IAlignment> ALIGNMENT_CAPABILITY = null;

 	private IAlignment instance = ALIGNMENT_CAPABILITY.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        return capability == ALIGNMENT_CAPABILITY;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        return capability == ALIGNMENT_CAPABILITY ? ALIGNMENT_CAPABILITY.<T> cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT()
    {
        return ALIGNMENT_CAPABILITY.getStorage().writeNBT(ALIGNMENT_CAPABILITY, this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt)
    {
        ALIGNMENT_CAPABILITY.getStorage().readNBT(ALIGNMENT_CAPABILITY, this.instance, null, nbt);
    }

}
