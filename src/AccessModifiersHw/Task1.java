package AccessModifiersHw;

public class Task1 {
    /*
task: Create a method that will accept an array as parameters and will return a sum of all elements from that array.
 Method should be visibly only within same package and accessible by the creating an instance of the class.
 */
    int sumArr(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
}
