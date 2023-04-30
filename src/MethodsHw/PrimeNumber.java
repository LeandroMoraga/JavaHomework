package MethodsHw;

public class PrimeNumber {
    /*
    task:Write a method to return whether given number is prime or not?
     */

    boolean prime(int num) {
            int count=0;
            boolean isprime=false;
            for (int i = 1; i <=num; i++) {
                if(num%i==0)
                    count++;
            }

            if(count==2) {
                isprime=true;
            }

            return isprime;
    }

    public static void main(String[] args) {
        PrimeNumber primeNum= new PrimeNumber();
        int num=3;
        boolean num1=primeNum.prime(num);
        System.out.println(num1);

        PrimeNumber numPrime= new PrimeNumber();
        boolean num2=numPrime.prime(16);
        System.out.println(num2);
    }
}
