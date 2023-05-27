package Project210Tasks;

public class CarTester {
    public static void main(String[] args) {
        Sedan hondaCivic= new Sedan(8250,"Red",25);
        double price=hondaCivic.carPrice();
        System.out.println("Total price with discount on Honda Civic is: "+price);

        Truck tacoma=new Truck(7500,"Black",2500);
        double price2=tacoma.carPrice();
        System.out.println("Total price with discount on Tacoma is: "+price2);
    }
}
