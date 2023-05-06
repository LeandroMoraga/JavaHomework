package ConstructorsHw;

public class Constructors {

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
