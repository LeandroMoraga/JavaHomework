package ListSetHw;

public abstract class Insurance {
    /*
     * task:
     * Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote
     * and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel
     * and Class Pet has petType attribute. Create 3 objects of the subclasses and store them in ArrayList.
     * Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String insuranceName;

    public abstract void getQuote();
    public abstract void cancelInsurance();

Insurance(String insuranceName){
    this.insuranceName=insuranceName;
}

}

class Car extends Insurance{
    /*
     *  Car class has its own attribute as carModel
     */
   private String carModel;

    Car(String insuranceName,String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote(){
        System.out.println("Car quote is free, Can get it through the phone or online");
    }
    @Override
    public void cancelInsurance(){
        System.out.println("Hello"+insuranceName+" i would like to cancel my plan on my "+carModel);
    }

}

class Pet extends Insurance{
    /*
     *  Class Pet has petType attribute.
     */

   private String petType;
    Pet(String insuranceName,String petType){
        super(insuranceName);
        this.petType=petType;
    }

    public void getQuote(){
        System.out.println("The monthly premium would be $35, and it covers accidents, illnesses, " +
                "and routine care such as vaccinations and annual check-ups.");
    }

    public void cancelInsurance(){
        System.out.println("Hello"+insuranceName+" i would like to cancel for my "+petType);
    }
}

class Health extends Insurance{

    Health(String insuranceName){
        super(insuranceName);
    }

    public void getQuote(){
        System.out.println("As a young adult, we can offer you a basic health insurance plan with a monthly premium of $150." +
                " The plan includes coverage for essential healthcare services such as doctor visits, emergency care,");
    }

    public void cancelInsurance(){
        System.out.println("Hello"+insuranceName+" i would like to cancel my plan");
    }
}
