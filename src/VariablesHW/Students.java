package VariablesHW;

public class Students {
    /*
    task:Create a Class called Students
   Create three  variables  Name , ID  and  numberOfStudents
   Create three objects of the Students Class
   Set the value for  studentName , studentID and increment  the numberOfStudents for each object
   Print out total number of students
     */
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students studentOne= new Students();
        studentOne.name="Leandro";
        studentOne.id="45235";
        studentOne.numberOfStudents++;

        Students studentTwo= new Students();
        studentTwo.name="Adam";
        studentTwo.id="95646";
        studentTwo.numberOfStudents++;

        Students studentThree= new Students();
        studentThree.name="Asghar";
        studentThree.id="88977";
        studentThree.numberOfStudents++;

        System.out.println("Total number of students in class:"+Students.numberOfStudents);
    }
}
