package Project10Tasks;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.
         */
        int [] temperatures={89,63,95,75,82,55,66};
        int lowest=temperatures[0];
        int highest=temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if(temperatures[i]>highest){
                highest=temperatures[i];
            }else if(temperatures[i]<lowest){
                lowest=temperatures[i];
            }
        }
        System.out.println("The highest temperature:"+highest);
        System.out.println("The lowest temperature:"+lowest);
    }
}
