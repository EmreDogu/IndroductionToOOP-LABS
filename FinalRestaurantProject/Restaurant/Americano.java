
public class Americano extends CaffeineBeverage {
	public Americano(int f, boolean g) {
		super(f,g);
		this.cost(f, g);
	}

	public void cost(int a, boolean d) {
		if (i == 0) {
			if (b == true) {
				CaffeineBeverage.cCost = 8;
			}else {
				CaffeineBeverage.cCost = 7;
			}
		}if (i == 1) {
			if (b == true) {
				CaffeineBeverage.cCost = 9;
			}else {
				CaffeineBeverage.cCost = 8;
			}
		}if (i == 2) {
			if (b == true) {
				CaffeineBeverage.cCost = 10;
			}else {
				CaffeineBeverage.cCost = 9;
			}
		}
		
	}
	
	public String toString() {
		return "Americano";
	}
}
