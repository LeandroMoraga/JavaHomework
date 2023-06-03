package MapsHw;

import javax.print.DocFlavor;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
       /*
        task:
        In Test Class create a Map that will store key in ascending order.
        In that map store personId and a Person Object. Print each object details.
        */

        Map<Integer,Person> information= new TreeMap<>();
        information.put(123,new Person("Leandro","Moraga",19,100000));
        information.put(124,new Person("Adamn","Ubazi",20,90000));
        information.put(125,new Person("Axel","Moraga",19,85000));
        information.put(126, new Person("Aghar","Asgharinni",30,125000));


        for(Map.Entry<Integer,Person> i:information.entrySet()){
            i.getValue().printInfo();
        }
    }
}
