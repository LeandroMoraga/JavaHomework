package MapsHw;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        /*
          task:
          2)Create a Map that will store Employee name and salary.
          Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
          John Smith=$100000
         */

        Map<String,Integer> info= new LinkedHashMap<>();
        info.put("Leandro Moraga",80000);
        info.put("Axel Moraga",75000);
        info.put("John Smith",100000);
        info.put("Lionel Messi",90000);
        info.put("Cristiano Ronaldo",50000);


        String name="";
        int biggestSalary=0;
        for (Map.Entry<String,Integer> n:info.entrySet()) {
            String employee=n.getKey();
            int salary=n.getValue();
            if(salary>biggestSalary){
                biggestSalary=salary;
                name=employee;
            }
        }
        System.out.println(name+"=$"+biggestSalary);
    }
}
