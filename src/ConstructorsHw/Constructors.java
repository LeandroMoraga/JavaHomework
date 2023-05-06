package ConstructorsHw;

public class Constructors {
/*
task:
Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
and create 4 objects of this class:
 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.

 */
String food;

int num;

boolean isTired;

public Constructors(String food){
    this.food=food;
    System.out.println(this.food);
}


private Constructors(int num){
    this.num=num;
    System.out.println(this.num);
}

Constructors(){
    System.out.println("Default constructor");
}


protected Constructors(boolean isTired){
    this.isTired=isTired;
    System.out.println(this.isTired);
}

    public static void main(String[] args) {

    Constructors obj= new Constructors(); // able to access default in same class
    Constructors obj2= new Constructors(false); // able to access protected in same class
    Constructors obj3= new Constructors(45); // able to access private in same class
    Constructors obj4= new Constructors("Burgers"); // able to access public in same class

    }
}
