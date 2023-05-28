package ListSetHw;

import java.util.HashSet;

public class Student {
    /**
     * task:
     * Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
     * Each student object should have name and studentID. Display name of each student.
     */
   private String name;
   private String id;

    Student(String name,String id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return name;
    }
}

class StudentTester{
    public static void main(String[] args) {

        HashSet<Student> students= new HashSet<>();
        students.add(new Student("Leandro","3454"));
        students.add(new Student("Axel","6107"));
        students.add(new Student("Adam","8384"));
        students.add(new Student("Vlad","5713"));
        students.add(new Student("Semir","0900"));
        students.add(new Student("Asghar","9434"));

        System.out.println(students);

        for(Student s:students){
            System.out.print(s+" ");
        }
    }
}
