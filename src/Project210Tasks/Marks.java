package Project210Tasks;

public abstract class Marks {
    /**
     * tasK: We have to calculate the average of marks obtained in three subjects by student A and by student B.
     * Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
     * Provide implementation of abstract method in classes 'A' and 'B'.
     * The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects
     * as its parameters for student B. Test your code
     */

    public abstract void getPercentage();

}
class studentA extends Marks{
   private double chemistry;
   private double math;
   private double english;
studentA(double chemistry,double math,double english){
    this.chemistry=chemistry;
    this.math=math;
    this.english=english;
}
@Override
public void getPercentage(){
    double result=(chemistry+math+chemistry)/3;
  //  result=result*100;
    System.out.println("Average percentage for Student A is: "+result+"%");
}

}
class studentB extends Marks{
   private double chemistry;
   private double math;
   private double english;
   private double art;
    studentB(double chemistry,double math,double english,double art){
        this.chemistry=chemistry;
        this.math=math;
        this.english=english;
        this.art=art;
    }
    @Override
    public void getPercentage(){
        double result=(chemistry+math+english+art)/4;
       // result=result*100;
        System.out.println("Average percentage for Student B is: "+result+"%");
    }
}
