package Project10Tasks;

public class Task8 {
    public static void main(String[] args) {
        /*
        Task: Maximum and minimum number in the array?
         */

        int [] numbers={3,45,20010,1,30002};
        int minimum=numbers[0];
        int maximun=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>maximun){
                maximun=numbers[i];
            }else if(numbers[i]<minimum){
                minimum=numbers[i];
            }
        }
        System.out.println("Maximum number:"+maximun);
        System.out.println("Minimum number:"+minimum);
    }
}
