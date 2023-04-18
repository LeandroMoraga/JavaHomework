package Project10Tasks;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array.
         */
        int [][] numbers={
                {44,67,304,45},
                {38,65,902,53},
                {23,555,4}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven=sumEven+numbers[i][j];
                }else if(numbers[i][j]%2==1){
                    sumOdd=sumOdd+numbers[i][j];
                }
            }
        }
        System.out.println("Sum of Even numbers:"+sumEven);
        System.out.println("Sum od Odd numbers:"+sumOdd);
    }
}
