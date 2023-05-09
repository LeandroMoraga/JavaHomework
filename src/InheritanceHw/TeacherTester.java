package InheritanceHw;

public class TeacherTester {
    public static void main(String[] args) {
     /*
    task: Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
     */
      MathTeacher jorge= new MathTeacher();
       jorge.name="Jorge Mendez";
       jorge.age=33;
       jorge.gender="Male";
       jorge.likesCoffee=true;
       jorge.bigClass=true;
       jorge.eating();
       jorge.teaching();

       PianoTeacher mandy= new PianoTeacher();
       mandy.name="Mandy Velazquez";
       mandy.age=24;
       mandy.gender="Female";
       mandy.likesCoffee=false;
       mandy.bigClass=true;
       mandy.writing();
       mandy.speaking();

       ChemistryTeacher edward= new ChemistryTeacher();
       edward.name="Edward Rodriguez";
       edward.age=55;
       edward.gender="Male";
       edward.likesCoffee=true;
       edward.bigClass=false;
       edward.teaching();
       edward.writing();

       Teacher teacher= new Teacher();
       teacher.name="Laura Gomez";
       teacher.eating();
    }
}
