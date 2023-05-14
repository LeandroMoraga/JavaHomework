package PolymorphismHomework;

public class HP extends Computer{
    HP(String color,String make,String model, int yearOfComputer,String inch){
        super(color, make, model, yearOfComputer, inch);
    }
    @Override
    void on(){
        System.out.println("Turning on "+make+" "+model+" and see the blue hp logo");
    }
    @Override
    void type(){
        System.out.println("Typing on my "+make+" "+model);
    }

    @Override
    void click(){
        System.out.println("Clicking onto Google Chrome, feels alright on the "+make+" "+model);
    }


    void webCamera(){
        System.out.println("Clicking on the web camera option and HD Camera pops up");
    }
}
