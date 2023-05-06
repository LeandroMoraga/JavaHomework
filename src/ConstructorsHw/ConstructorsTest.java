package ConstructorsHw;

public class ConstructorsTest {
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
