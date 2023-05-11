package MethodOverRidingHw;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard card= new CreditCard(3500,0.3);
        card.calculateInterest();

        Visa visa= new Visa(10000,0.12);
        visa.calculateInterest();

        AX ax= new AX(4300,0.5);
        ax.calculateInterest();
    }
}
