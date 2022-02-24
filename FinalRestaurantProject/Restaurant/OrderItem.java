
public class OrderItem {
	String s;
	static int total;

	public OrderItem(CaffeineBeverage cBeverage, int amount) {
		if (cBeverage.getSize() == 0) {
			if (cBeverage.getWith() == true) {
				s = (Integer.toString(amount) + " Small " + cBeverage + " with Milk " + Integer.toString(amount * CaffeineBeverage.cCost) + " TL");
				OrderItem.total += amount * CaffeineBeverage.cCost;
			}else {
				s = (Integer.toString(amount) + " Small " + cBeverage + " without Milk " + Integer.toString(amount * CaffeineBeverage.cCost) + " TL"); 
				OrderItem.total += amount * CaffeineBeverage.cCost;
			}
		}if (cBeverage.getSize() == 1) {
			if (cBeverage.getWith() == true) {
				s = (Integer.toString(amount) + " Medium " + cBeverage + " with Milk " + Integer.toString(amount * CaffeineBeverage.cCost) + " TL"); 
				OrderItem.total += amount * CaffeineBeverage.cCost;
			}else {
				s = (Integer.toString(amount) + " Medium " + cBeverage + " without Milk " + Integer.toString(amount * CaffeineBeverage.cCost) + " TL"); 
				OrderItem.total += amount * CaffeineBeverage.cCost;
			}
		}if (cBeverage.getSize() == 2) {
			if (cBeverage.getWith() == true) {
				s = (Integer.toString(amount) + " Large " + cBeverage + " with Milk " + Integer.toString(amount * CaffeineBeverage.cCost) + " TL"); 
				OrderItem.total += amount * CaffeineBeverage.cCost;
			}else {
				s = (Integer.toString(amount) + " Large " + cBeverage + " without Milk " + Integer.toString(amount * CaffeineBeverage.cCost) + " TL"); 
				OrderItem.total += amount * CaffeineBeverage.cCost;
			}
		}
	}

	public OrderItem(TeaBeverage tBeverage, int amount) {
		if (tBeverage.getSize() == 0) {
			if (tBeverage.getWith() == true) {
				s = (Integer.toString(amount) + " Small " + tBeverage + " with Lemon " + Integer.toString(amount * TeaBeverage.tCost) + " TL"); 
				OrderItem.total += amount * TeaBeverage.tCost;
			}else {
				s = (Integer.toString(amount) + " Small " + tBeverage + " without Lemon " + Integer.toString(amount * TeaBeverage.tCost) + " TL"); 
				OrderItem.total += amount * TeaBeverage.tCost;
			}
		}if (tBeverage.getSize() == 1) {
			if (tBeverage.getWith() == true) {
				s = (Integer.toString(amount) + " Medium " + tBeverage + " with Lemon " + Integer.toString(amount * TeaBeverage.tCost) + " TL"); 
				OrderItem.total += amount * TeaBeverage.tCost;
			}else {
				s = (Integer.toString(amount) + " Medium " + tBeverage + " without Lemon " + Integer.toString(amount * TeaBeverage.tCost) + " TL"); 
				OrderItem.total += amount * TeaBeverage.tCost;
			}
		}if (tBeverage.getSize() == 2) {
			if (tBeverage.getWith() == true) {
				s = (Integer.toString(amount) + " Large " + tBeverage + " with Lemon " + Integer.toString(amount * TeaBeverage.tCost) + " TL"); 
				OrderItem.total += amount * TeaBeverage.tCost;
			}else {
				s = (Integer.toString(amount) + " Large " + tBeverage + " without Lemon " + Integer.toString(amount * TeaBeverage.tCost) + " TL"); 
				OrderItem.total += amount * TeaBeverage.tCost;
			}
		}
	}
}
