package ListSetHw;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        /**
         * Create 3 objects of the subclasses and store them in ArrayList.
         * Using for loop/advanced for loop/ iterator access all methods of the class.
         */

    Insurance car= new Car("Geico","Honda Civic SI");
    Insurance pet= new Pet("Nationwide Pet Insurance","Cat");
    Insurance health= new Health("UnitedHealthcare");

        ArrayList<Insurance> insurances= new ArrayList<>();
        insurances.add(car);
        insurances.add(pet);
        insurances.add(health);

        for(Insurance i:insurances){
            i.getQuote();     // enhanced/advanced for loop way
            i.cancelInsurance();
        }
        System.out.println();


        for (int i = 0; i < insurances.size() ; i++) {
            Insurance n=insurances.get(i);    // regular for loop way
            n.getQuote();
            n.cancelInsurance();
        }
        System.out.println();


        Iterator<Insurance> in=insurances.iterator();
        while(in.hasNext()){
            Insurance sur=in.next(); // iterator way
            sur.getQuote();
            sur.cancelInsurance();
        }
    }
}
