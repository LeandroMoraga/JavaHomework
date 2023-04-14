package TwoDArraysHomework;

public class TwoDArrayHw1 {
    public static void main(String[] args) {
        /*
        Create a 2D array(shorter way) in which first array will consist of 4
         names and second array will contain grades. Then your program should print
         name of the students that has A and B grade
         */
        String [][] nameGrades={
                {"Leandro","Axel","Alex","Asghar"},
                {"A","B","F","A"}
        };
        System.out.println(nameGrades[0][0]);
        System.out.println(nameGrades[0][1]);
        System.out.println(nameGrades[0][3]);
    }
}
