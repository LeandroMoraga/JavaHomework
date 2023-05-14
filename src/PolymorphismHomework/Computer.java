package PolymorphismHomework;

public class Computer {
    /*
    task:
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    String color;
    String make;
    String model;
    int yearOfComputer;
    String inch;


    void on(){
        System.out.println("Computer is turning on");
    }

    void type(){
        System.out.println("Typing on the computer");
    }
    void click(){
        System.out.println("Clicking the touchpad of the Computer");
    }

    Computer(String color,String make,String model,int yearOfComputer, String inch){
        this.color=color;
        this.make=make;
        this.model=model;
        this.yearOfComputer=yearOfComputer;
        this.inch=inch;
    }
}
