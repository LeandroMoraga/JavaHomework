package Project10Tasks;

public class Task10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from an Array of Strings
         */
        String[] colors={"Orange","Red","Blue","Purple"};
        for (int i = 0; i < colors.length; i++) {
            for (int j = i+1; j < colors.length ; j++) {
                if(colors[i].equals(colors[j]));
                System.out.println("Duplicate color:"+colors[j]);
            }
        }
    }
}
