package MethodsOverLoadHw;

public class ProgrammingTester {
    public static void main(String[] args) {
        /*
        task:
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    Example, if we pass "Java", then "I love Java" should be printed.
         */
       Programming obj= new Programming();
       Programming java= new Programming("Java");
       Programming python= new Programming("Python");
       Programming c= new Programming("C++");
       Programming javaScript= new Programming("Java Script");
    }
}
