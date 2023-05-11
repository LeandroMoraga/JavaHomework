package MethodOverRidingHw;

public class Masters extends Degree{
     /*
    task:
    Create a class 'Degree' having a method 'getPrerequisite' that prints "To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes.
     */
    @Override
    public void getPrerequisite(){
        System.out.println("All master's degrees require the completion of a bachelor's degree and usually require an undergraduate GPA of 3.0.");
    }
}
