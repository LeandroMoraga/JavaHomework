package Project210Tasks;

public class Registration {
    /**
     * task:
     *  Create Registration Class in which you would have variables as email, userName and password that have an
     *  access scope only within its own class. After creating an object of the class user should be able to call
     *  methods and in each method separately pass values to set users email, username and password.
     */

   private String email;
   private String userName;
   private String password;

    /**
     * A. Valid email consider to be only yahoo
     */
   public void setEmail(String email){

       if(email.endsWith("@yahoo.com")){
           this.email=email;
       }else{
           System.out.println("Error: Must be a yahoo email");
       }
   }

    /**
     * B. Valid userName and password cannot be empty and should be of
     * length larger than 6 characters. Also, valid password cannot contain userName.
     */

   public void setUserName(String userName){
       if(!userName.isEmpty() && userName.length()>6){
           this.userName=userName;
       }else{
           System.out.println("Error: please make a Valid Username");
       }
   }

   public void setPassword(String password){
       if(!password.isEmpty() && password.length()>6 && !password.contains(userName)){
           this.password=password;
       }else{
           System.out.println("Error: please make a Valid Password");
       }
   }
}
