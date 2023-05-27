package Project210Tasks;

public class ShapeTester {
    public static void main(String[] args) {
        Circle c= new Circle(5);
        c.calculateArea();
        c.calculatePerimeter();
        System.out.println();
        Square s= new Square(2);
        s.calculateArea();
        s.calculatePerimeter();
    }
}
