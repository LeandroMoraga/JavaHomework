package Project10Tasks;

public class Task9 {
    public static void main(String[] args) {
        /*
        Task: Write a java program to find the second-largest
           number in the array?
         */
        int [] numbers={45,309,2003,49599,30499494,23333344,24444444};
        int largestNumber=numbers[0];
        int secondLargest=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largestNumber){
                secondLargest=largestNumber;
                largestNumber=numbers[i];
            }else if(numbers[i]>secondLargest){
                secondLargest=numbers[i];
            }

        }
        System.out.println("Second largest number:"+secondLargest);
    }
}
