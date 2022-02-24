
public class Cappucino extends CaffeineBeverage {
	public Cappucino(int f, boolean g) {
		super(f,g);
		this.cost(f, g);	
	}

	public void cost(int k, boolean l) {
		if (i == 0) {
			if (b == true) {
				CaffeineBeverage.cCost = 7;
			}else {
				CaffeineBeverage.cCost = 6;
			}
		}if (i == 1) {
			if (b == true) {
				CaffeineBeverage.cCost = 8;
			}else {
				CaffeineBeverage.cCost = 7;
			}
		}if (i == 2) {
			if (b == true) {
				CaffeineBeverage.cCost = 9;
			}else {
				CaffeineBeverage.cCost = 8;
			}
		}
		
	}
	
	public String toString() {
		return "Cappucino";
	}
}
