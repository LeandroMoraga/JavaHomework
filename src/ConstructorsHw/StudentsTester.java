package ConstructorsHw;

public class StudentsTester {
    public static void main(String[] args) {
        /*
        task:Write a java Class Students that have a constructor which takes students name and 3 subject grades.
        Inside your class also have a method to Calculate Average Grade.
        Test Student class for 5 different students with different marks.
        Your program should print an average mark of each student's name.
         */
        Students leandro= new Students("Leandro",89,96,84);
        leandro.averageGrade();

        Students axel= new Students("Axel",75,92,90);
        axel.averageGrade();

        Students asghar= new Students("Asghar",96,100,88);
        asghar.averageGrade();

        Students adam= new Students("Adam",74,80,81);
        adam.averageGrade();

        Students vlad= new Students("Vlad",90,99,91);
        vlad.averageGrade();
    }
}
