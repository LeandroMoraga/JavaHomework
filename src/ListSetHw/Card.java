package ListSetHw;

public class Card {
    /*
     * task:
     * Create a Card class that will have interest rate field and card type
     *   and a constructor that will initialize the fields.
     *   Create 3 objects of different card and store them into LinkedList.
     *   Using for loop/advanced for loop/ iterator access all methods of the class.
     */

    private double interestRate;
    private String card;

    Card(double interestRate,String card){
        this.interestRate=interestRate;
        this.card=card;
    }

    public void printCardInfo(){
        System.out.println("Your interest rate is "+interestRate+"% and the card you're using is "+card);
    }
}
