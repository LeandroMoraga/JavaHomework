package MethodsHw;

public class HelloLanguage {
   /*
   task: Create a method that will say Hello in different language based
   on the country that will be passed when method is executed.
    */
    void hello(String country){
        switch (country){
            case "USA":
                System.out.println("Hello");
                break;
            case "Spain":
                System.out.println("Hola");
                break;
            case "Germany":
                System.out.println("Hallo");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Japan":
                System.out.println("こんにちは");
                break;
            case "China":
                System.out.println("你好");
                 break;
            case "Russia":
                System.out.println("привет");
                break;
            case "Korea Of Republic":
                System.out.println("안녕하세요");
                break;
            case "Italy":
                System.out.println("Ciao");
                break;
            case "Ukraine":
                System.out.println("привіт");
                break;
            case "India":
                System.out.println("Namaste");
            case "Brazil":
                System.out.println("Olá");
        }
    }
}

