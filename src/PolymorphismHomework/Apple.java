package PolymorphismHomework;

public class Apple extends Computer{

    Apple(String color,String make,String model, int yearOfComputer,String inch){
        super(color, make, model, yearOfComputer, inch);
    }

    @Override
    void on(){
        System.out.println("Turning on "+make+" "+model+" and see's the Apple logo come up");
    }
    @Override
    void type(){
        System.out.println("Typing on my "+make+" "+model);
    }

    @Override
    void click(){
        System.out.println("Clicking onto new web browsers for Homework");
    }

    void prepTouchID(){
        System.out.println("Setting up touch ID on my "+make+" "+model+" so everytime I log in, I can use my finger");
    }
}
