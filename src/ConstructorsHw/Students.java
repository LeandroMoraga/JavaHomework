package ConstructorsHw;

public class Students {
    /*
    task:Write a java Class Students that have a constructor which takes students name and 3 subject grades.
     Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with
      different marks. Your program should print an average mark of each student's name.
     */

    String studentName;
    double englishGrade;
    double mathGrade;
    double scienceGrade;
 public Students(String studentName, double englishGrade, double mathGrade, double scienceGrade){
        this.studentName=studentName;
        this.englishGrade=englishGrade;
        this.mathGrade=mathGrade;
        this.scienceGrade=scienceGrade;
    }

    public void averageGrade(){
      double total=(englishGrade)+(mathGrade)+(scienceGrade);
      total=total/3;
        System.out.println(studentName+":"+total);
    }
}
