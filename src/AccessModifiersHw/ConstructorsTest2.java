package AccessModifiersHw;

import ConstructorsHw.Constructors;

public class ConstructorsTest2 {
    /*
    task:Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
     and observe result.

     */
    public static void main(String[] args) {
        Constructors obj = new Constructors("Pizza");
        // only able to access public constructor from class 'Constructors'

    }
}
