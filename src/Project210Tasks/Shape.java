package Project210Tasks;

public interface Shape {
    /**
     * task: Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
     * Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */
   void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
     // perimeter --> 2*3.14*Radius(Square)
    // area---> 3.14*Radius(Square)
    double radius;
    Circle(double radius){
        this.radius =radius;
    }

    @Override
    public void calculateArea(){
        System.out.println(3.14*(radius*radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*(3.14*radius));
    }
}

class Square implements Shape{
    // perimeter --> 4*side
    // area --> side(Square)

    double side;
    Square(double side){
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println(side*side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(4*side);
    }
}
