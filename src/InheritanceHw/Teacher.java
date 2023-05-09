package InheritanceHw;

public class Teacher {
    /*
    task: Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
     */
    int age;
    String gender;
    String name;
    boolean likesCoffee;

    boolean bigClass;

    void teaching(){
        System.out.println(name+" is teaching, Listen Students!!");
    }

    void speaking(){
        System.out.println(name+" is speaking to the Students in the classroom");
    }

    void writing(){
        System.out.println(name+" is writing tasks for the next class");
    }

    void eating(){
        System.out.println(name+" is eating on lunch break. Munch munch Munch");
    }
}
