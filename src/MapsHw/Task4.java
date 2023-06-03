package MapsHw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        /*
          task:
          Create a collection of integers in which you can keep duplicates.
          Write a logic to find sum of all integers
         */

        List<Integer> numbers= new ArrayList<>();
        numbers.add(22);
        numbers.add(22);
        numbers.add(9000);
        numbers.add(9000);
        numbers.add(76);
        numbers.add(69);


        int sum=0;
        for (int i = 0; i <numbers.size() ; i++) {
            sum = sum + numbers.get(i);
        }
        System.out.println(sum);
    }
}
