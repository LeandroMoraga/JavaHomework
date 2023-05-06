package ConstructorsHw;

public class ConstructorsTest {
    /*
    task: Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
      and observe result.

     */
    Constructors obj= new Constructors(); // access default in different class
    Constructors obj2= new Constructors("Fries"); // access public in different class
    Constructors obj3= new Constructors(true); // access protected in different class

    // unable to access private constructor in different class

    /*
     only able to access public constructor in different package/class
      Constructors obj = new Constructors("Pizza");
      to see, go to "AccessModifiersHw" and click on class "ConstructorsTest2"
     */
}
