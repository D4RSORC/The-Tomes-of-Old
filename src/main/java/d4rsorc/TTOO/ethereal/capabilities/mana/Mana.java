package d4rsorc.TTOO.ethereal.capabilities.mana;

public class Mana implements IMana {
	
	private float mana = 0f;
	private float manaRate = 0f;

	@Override
	public void consumeMana(float points) 
	{
		this.mana -= points;
		if(this.mana < 0.0F) this.mana = 0f;
	}

	@Override
	public void fillMana(float points)
	{
		this.mana = this.mana + points;
	}

	@Override
	public void setMana(float points) 
	{
		this.mana = points;
	}

	@Override
	public float getMana() 
	{
		return this.mana;
	}

	@Override
	public void setManaRate(float rate) 
	{
		this.manaRate = rate;
	}
	
	@Override
	public float getManaRate() 
	{
		return manaRate;
	}

}
