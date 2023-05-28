package ListSetHw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class CardTester {
    public static void main(String[] args) {
        /**
         * Create 3 objects of different card and store them into LinkedList.
         *  Using for loop/advanced for loop/ iterator access all methods of the class.
         */

        Card BOA= new Card(15.5,"Gold");
        Card WF= new Card(6.0,"Platinum");
        Card CB= new Card(20.0,"Silver");

        List<Card> cards= new LinkedList<>();
        cards.add(BOA);
        cards.add(WF);
        cards.add(CB);


        for(Card c:cards){
            c.printCardInfo();   // for loop enhanced/advanced way
        }
        System.out.println();

        for(int i=0;i<cards.size();i++){
            Card s=cards.get(i);   // regular for loop
            s.printCardInfo();
        }

        System.out.println();
        Iterator<Card> cardIterator= cards.iterator();
        while(cardIterator.hasNext()){
            Card d=cardIterator.next(); // iterator way
            d.printCardInfo();
        }
    }
}
