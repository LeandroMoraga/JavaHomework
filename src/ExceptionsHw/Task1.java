package ExceptionsHw;

public class Task1 {
    /*
    task:
    Create a method to check age eligibility that will throw a runtime exception.
    Method should throw an exception age is less than 16.
     */

    public static void checkAge(int age){
        if(age<16){
           throw new RuntimeException("Age is less than 16, Not eligible sorry");
        }else{
            System.out.println("You're good to go, Eligible");
        }
    }


    public static void main(String[] args) {
     try{
         checkAge(1);
     }catch (RuntimeException r){
         System.out.println(r.getMessage());
     }
    }
  }
