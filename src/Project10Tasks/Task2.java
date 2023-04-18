package Project10Tasks;

public class Task2 {
    public static void main(String[] args) {
   /*
    Create an array of integer values. After the array is created,
    calculate the sum of all stored elements in that array.
    */
        int [] numbers={45,34,1001,45000,34,6733};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
           sum=sum+numbers[i];
        }
        System.out.println("The sum is:"+sum);
    }
}
