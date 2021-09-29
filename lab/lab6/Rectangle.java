public class Rectangle {
    int sideA, sideB;
    Point topLeft;

    public Rectangle (int a, int b, Point p) {
        this.topLeft = p;
        this.sideA = a;
        this.sideB = b;
    }

    public int area() {
        return sideA*sideB;
    }

    public int perimeter() {
        return sideA*2 + sideB*2;
    }
    
    public Point[] corners() {
        Point topRight = new Point(topLeft.xCoord + sideA, topLeft.yCoord);
        Point bottomLeft = new Point(topLeft.xCoord, topLeft.yCoord - sideB);
        Point bottomRight = new Point(topLeft.xCoord + sideA, topLeft.yCoord - sideB); 
        Point[] corners = new Point[4];
        corners[0] = topLeft;
        corners[1] = topRight;
        corners[2] = bottomLeft;
        corners[3] = bottomRight;
        return corners;    
    }
}
