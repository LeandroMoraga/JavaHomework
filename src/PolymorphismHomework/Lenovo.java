package PolymorphismHomework;

public class Lenovo extends Computer{
    Lenovo(String color,String make,String model, int yearOfComputer,String inch){
        super(color, make, model, yearOfComputer, inch);
    }

    @Override
    void on(){
        System.out.println("Turning on "+make+" "+model+" and see's the Lenovo logo with white wording");
    }
    @Override
    void type(){
        System.out.println("Typing on my "+make+" "+model);
    }

    @Override
    void click(){
        System.out.println("Clicking onto Youtube to test out the audio");
    }

    void touchScreen(){
        System.out.println("Omg woww, the response time when touching the screen is seamless on the "+make+" "+model);
    }
}
