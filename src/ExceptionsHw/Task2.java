package ExceptionsHw;

public class Task2 {
    /*
    task:
    Create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters.
     */
    public static void checkUserName(String username){
        if(username.length()<5) {
            throw new RuntimeException("Username is less than 5 characters. Either make a new one or Update it");
        }else {
            System.out.println("Username is good");
        }
    }

    public static void main(String[] args) {
       try{
           checkUserName("Lean");
       }catch (RuntimeException r){
           System.out.println(r.getMessage());
       }
    }
 }
