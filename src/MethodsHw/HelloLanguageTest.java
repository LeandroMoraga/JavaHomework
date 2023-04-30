package MethodsHw;

public class HelloLanguageTest {
    public static void main(String[] args) {
         /*
   task: Create a method that will say Hello in different language based
   on the country that will be passed when method is executed.
    */

        HelloLanguage languages= new HelloLanguage();
        languages.hello("Ukraine");

        HelloLanguage languages2= new HelloLanguage();
        languages2.hello("Japan");

        HelloLanguage languages3= new HelloLanguage();
        languages3.hello("Brazil");
    }
}
