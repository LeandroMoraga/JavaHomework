package MethodsOverLoadHw;

public class Programming {
    /*
    task:
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    Example, if we pass "Java", then "I love Java" should be printed.
     */
     String code;
    Programming(){
        System.out.println("I love programming languages");
    }

    Programming(String code){
        this.code=code;
        System.out.println("I love "+this.code);
    }
}
