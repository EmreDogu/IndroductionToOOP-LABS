
public class Beverage {

	public static final int SMALL = 0;
	public static final int MEDIUM = 1;
	public static final int LARGE = 2;
	protected int i;
	protected boolean b;
	
	public Beverage(int i, boolean b) {
		if (i == Beverage.SMALL) {
			this.i = Beverage.SMALL;
			this.b = b;
		}if (i == Beverage.MEDIUM) { 
			this.i = Beverage.MEDIUM;
			this.b = b;
		}if (i == Beverage.LARGE) {
			this.i = Beverage.LARGE;
			this.b = b;
		}
	}
	
	public int getSize() {
		return this.i;
	}

	public boolean getWith() {
		return this.b;
	}
}
