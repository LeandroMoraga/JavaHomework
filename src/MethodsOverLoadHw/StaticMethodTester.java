package MethodsOverLoadHw;

public class StaticMethodTester {
    public static void main(String[] args) {
        /*
     task:
     Create 1 class with a static method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
         */
        StaticMethod.subtract(34,12);
        StaticMethod.subtract(4554L,2344L);
        StaticMethod.subtract(109.4,30.5);
        StaticMethod.subtract(68,35.5);
        /*
        It's working like a static method, outside the class, calling the method
        by class name and passing arguments. Works good.
         */
    }
}
