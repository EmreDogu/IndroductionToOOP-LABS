import java.util.ArrayList;
import java.util.List;

public class Order {
	List<String> list1 = new ArrayList<String>();

	public void add(OrderItem orderItem) {
		list1.add(orderItem.s);	
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int counter = 0; counter < list1.size(); counter++) { 		      
	          result.append(list1.get(counter));
	          result.append("\n");
	      }
		result.append("Total : " + OrderItem.total + " TL");
		return result.toString();   		
	}

}
