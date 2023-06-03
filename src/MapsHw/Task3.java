package MapsHw;


import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        /*
          task:
          3) Create the collection that will store single uniques Objects of a
          String type in which order is preserved.
          Write a logic to concatenate all string from the collection.
         */

        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Hello");
        words.add(" my");
        words.add(" name");
        words.add(" is");
        words.add(" Leandro");


        StringBuilder str = new StringBuilder();
        for (String w : words) {
           str.append(w);
        }
        System.out.println(str);
    }
}
