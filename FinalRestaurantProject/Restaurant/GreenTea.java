
public class GreenTea extends TeaBeverage {
	public GreenTea(int a, boolean d) {
		super(a,d);
		this.cost(a, d);
	}

	public void cost(int i, boolean b) {
		if (i == 0) {
			if (b == true) {
				TeaBeverage.tCost = 5;
			}else {
				TeaBeverage.tCost = 4;
			}
		}if (i == 1) {
			if (b == true) {
				TeaBeverage.tCost = 6;
			}else {
				TeaBeverage.tCost = 5;
			}
		}if (i == 2) {
			if (b == true) {
				TeaBeverage.tCost = 7;
			}else {
				TeaBeverage.tCost = 6;
			}
		}
		
	}
	
	public String toString() {
		return "Green Tea";
	}
}
