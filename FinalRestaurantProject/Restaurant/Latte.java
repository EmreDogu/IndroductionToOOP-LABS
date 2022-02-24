
public class Latte extends CaffeineBeverage {
	public Latte(int f, boolean g) {
		super(f,g);
		this.cost(f, g);
	}

	public void cost(int i, boolean b) {
		if (i == 0) {
			if (b == true) {
				CaffeineBeverage.cCost = 6;
			}else {
				CaffeineBeverage.cCost = 5;
			}
		}if (i == 1) {
			if (b == true) {
				CaffeineBeverage.cCost = 7;
			}else {
				CaffeineBeverage.cCost = 6;
			}
		}if (i == 2) {
			if (b == true) {
				CaffeineBeverage.cCost = 8;
			}else {
				CaffeineBeverage.cCost = 7;
			}
		}
	}
	
	public String toString() {
		return "Latte";
	}
}
