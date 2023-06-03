package MapsHw;

public class Person {
    /*
      task:
      Create a Person class with following private fields: name, lastName, age, salary.
      Variables should be initialized through constructor.
      Inside the class also create a method to print user details.
     */
    private String name;
    private String lastName;
    private int age;
    private int salary;

   public Person(String name,String lastName, int age,int salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    public void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
