package Project10Tasks;

public class Task6 {
    public static void main(String[] args) {
        /*
         Write a java program to check whether a given number is prime or not?
         */
        int number=13;
        boolean prime=true;
        for (int i = 2; i <= number/2; i++) {
            if(number%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("Number is prime:"+number);
        }else{
            System.out.println("Number is not prime:"+number);
        }
    }
}

