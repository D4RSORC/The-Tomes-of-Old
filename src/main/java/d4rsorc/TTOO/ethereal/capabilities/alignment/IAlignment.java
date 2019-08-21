package d4rsorc.TTOO.ethereal.capabilities.alignment;

import d4rsorc.TTOO.system.utils.Reference;
import net.minecraft.util.ResourceLocation;

public interface IAlignment {

	public final String ALIGNMENT = "alignment";
	ResourceLocation RL = new ResourceLocation(Reference.MODID, ALIGNMENT);
	
	public void setVandouranAlignment(int alignment);
	public void setGratyiAlignment(int alignment);
	public void setHainAlignment(int alignment);
	public void setUtmaAlignment(int alignment);
	
	public int getVandouranAlignment();
	public int getGratyiAlignment();
	public int getHainAlignment();
	public int getUtmaAlignment();
	
	public void raiseVandouranAlignment(int alignment);
	public void raiseGratyiAlignment(int alignment);
	public void raiseHainAlignment(int alignment);
	public void raiseUtmaAlignment(int alignment);
	
	public void lowerVandouranAlignment(int alignment);
	public void lowerGratyiAlignment(int alignment);
	public void lowerHainAlignment(int alignment);
	public void lowerUtmaAlignment(int alignment);
	
}
