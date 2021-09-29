public class Circle {
    int radius;
    Point center;
	
    public Circle (int a, Point b) {
	this.radius = a;
	this.center = b;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    public boolean intersect(Circle C1, Circle C2) {
	Point x = C1.center;
	Point y = C2.center;
        if (C1.radius + C2.radius >= Math.sqrt((x.xCoord - y.xCoord) * (x.xCoord - y.xCoord)) + (x.yCoord - y.yCoord) * (x.yCoord - y.yCoord))
            return true;
        return false;
    }
}


            
