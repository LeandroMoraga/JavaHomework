package Project210Tasks;

public class CountString {
    /**
     * task: Count the Number of Words in a String: Write a function to count the number of words in a given string.
     * Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
     */
    public static int countString(String str){
        String [] arr=str.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int total=countString("This is awesome, i love Java");
        System.out.println(total);

        int total2=countString("Hello, world!");
        System.out.println(total2);
    }
}
