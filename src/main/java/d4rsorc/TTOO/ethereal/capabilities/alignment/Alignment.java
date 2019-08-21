package d4rsorc.TTOO.ethereal.capabilities.alignment;

public class Alignment implements IAlignment {

	private int vandouranAlignment = 0;
	private int gratyiAlignment = 0;
	private int hainAlignment = 0;
	private int utmaAlignment = 0;
	
	private final int MAXALIGNMENT = 100;
	private final int MINALIGNMENT = -100;
	
	@Override
	public void setVandouranAlignment(int alignment) {
		this.vandouranAlignment = alignment;
		check();
	}
	
	@Override
	public void setGratyiAlignment(int alignment) {
		this.gratyiAlignment = alignment;
		check();
	}
	
	@Override
	public void setHainAlignment(int alignment) {
		this.hainAlignment = alignment;
		check();
	}
	
	@Override
	public void setUtmaAlignment(int alignment) {
		this.utmaAlignment = alignment;
		check();
	}
	
	@Override
	public int getVandouranAlignment() {
		check();
		return this.vandouranAlignment;
	}
	
	@Override
	public int getGratyiAlignment() {
		check();
		return this.gratyiAlignment;
	}
	
	@Override
	public int getHainAlignment() {
		check();
		return this.hainAlignment;
	}
	
	@Override
	public int getUtmaAlignment() {
		check();
		return this.utmaAlignment;
	}
	
	@Override
	public void raiseVandouranAlignment(int alignment) {
		this.vandouranAlignment += alignment;
		check();
	}
	
	@Override
	public void raiseGratyiAlignment(int alignment) {
		this.gratyiAlignment += alignment;
		check();
	}
	@Override
	public void raiseHainAlignment(int alignment) {
		this.hainAlignment += alignment;
		check();
	}
	@Override
	public void raiseUtmaAlignment(int alignment) {
		this.utmaAlignment += alignment;
		check();
	}
	@Override
	public void lowerVandouranAlignment(int alignment) {
		this.vandouranAlignment -= alignment;
		check();
	}
	@Override
	public void lowerGratyiAlignment(int alignment) {
		this.gratyiAlignment -= alignment;
		check();
	}
	@Override
	public void lowerHainAlignment(int alignment) {
		this.hainAlignment -= alignment;
		check();
	}
	@Override
	public void lowerUtmaAlignment(int alignment) {
		this.utmaAlignment -= alignment;
		check();
	}
	
	private void check(){
		if(this.hainAlignment > MAXALIGNMENT) {
			this.hainAlignment = MAXALIGNMENT;
		}
		if(this.gratyiAlignment > MAXALIGNMENT) {
			this.gratyiAlignment = MAXALIGNMENT;
		}
		if(this.utmaAlignment > MAXALIGNMENT) {
			this.utmaAlignment = MAXALIGNMENT;
		}
		if(this.vandouranAlignment > MAXALIGNMENT) {
			this.vandouranAlignment = MAXALIGNMENT;
		}
		
		if(this.hainAlignment < MINALIGNMENT) {
			this.hainAlignment = MINALIGNMENT;
		}
		if(this.gratyiAlignment < MINALIGNMENT) {
			this.gratyiAlignment = MINALIGNMENT;
		}
		if(this.utmaAlignment < MINALIGNMENT) {
			this.utmaAlignment = MINALIGNMENT;
		}
		if(this.vandouranAlignment < MINALIGNMENT) {
			this.vandouranAlignment = MINALIGNMENT;
		}
	}
	
	

}
