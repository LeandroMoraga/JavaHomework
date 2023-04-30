package MethodsHw;

public class EmailTest {
    public static void main(String[] args) {
        /*
    task:Create a method createEmail(). Based on values of users firstName, lastName and email type,
     your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

     Email fullEmail= new Email();
     String email=fullEmail.createEmail("Leandro","Moraga","Yahoo");
     System.out.println(email);

     Email fullEmailTwo= new Email();
     String email2=fullEmailTwo.createEmail("Jocelyn","Rodriguez","Gmail");
     System.out.println(email2);

     Email fullEmailThree= new Email();
     String email3=fullEmailThree.createEmail("Sir","Asghar","icloud");
        System.out.println(email3);

    }
}
