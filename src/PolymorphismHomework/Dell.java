package PolymorphismHomework;

public class Dell extends Computer{
    Dell(String color,String make,String model, int yearOfComputer,String inch){
        super(color, make, model, yearOfComputer, inch);
    }
    @Override
    void on(){
        System.out.println("Turning on "+make+" "+model+" and see' 'just a moment....' and the screen is loading");
    }
    @Override
    void type(){
        System.out.println("Typing on my "+make+" "+model);
    }

    @Override
    void click(){
        System.out.println("Clicking onto Amazon website, keyboard feels very responsive when I type");
    }

    void display(){
        System.out.println("Setting up my screen display, high resolutions with rich color panels");
    }
}
