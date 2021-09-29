public class Main {
    public static void main(String args[]){
    System.out.println("RECTANGLE PART:");
    Point p = new Point(4,6);
    Rectangle r = new Rectangle(5,9,p);
    System.out.println("Area of rectangle: " + r.area());
    System.out.println("Perimeter of rectangle: " + r.perimeter());
    System.out.println("Points of rectangle: ");
    Point[] points = r.corners();
        for(int i=0;i<4;i++) {
            Point a = points[i];
            System.out.println(a.xCoord + "," + a.yCoord);
        }
    System.out.println("");
    System.out.println("CIRCLE PART:");
    Point b = new Point(4,6);
    Point f = new Point(2,5);
    Circle C1 = new Circle(5,b);
    System.out.println("Area of circle1: " + C1.area());
    System.out.println("Perimeter of circle1: " + C1.perimeter());
    Circle C2 = new Circle(3,f);
    System.out.println("Does circles are intersect? " + C1.intersect(C1,C2));
    }
}
