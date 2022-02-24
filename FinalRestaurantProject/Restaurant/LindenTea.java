
public class LindenTea extends TeaBeverage {
	public LindenTea(int a, boolean d) {
		super(a,d);
		this.cost(a, d);
	}

	public void cost(int i, boolean b) {
		if (i == 0) {
			if (b == true) {
				TeaBeverage.tCost = 6;
			}else {
				TeaBeverage.tCost = 5;
			}
		}if (i == 1) {
			if (b == true) {
				TeaBeverage.tCost = 7;
			}else {
				TeaBeverage.tCost = 6;
			}
		}if (i == 2) {
			if (b == true) {
				TeaBeverage.tCost = 8;
			}else {
				TeaBeverage.tCost = 7;
			}
		}	
	}
	
	public String toString() {
		return "Linden Tea";
	}
}
