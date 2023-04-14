package TwoDArraysHomework;

public class TwoDArrayHw6 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops and calculate how many total countries been stored.
         */
        String[][] countries={
                {"United States","Mexico","Guatemala","Dominican Republic"},
                {"Argentina","Brazil","Columbia","Uruguay","Chile"},
                {"England","Germany","Italy","France","Beligum"},
                {"Japan","China","Indonesia","Vietnam"},
                {"South Africa","Nigeria","Cameroon"}
        };
        int count=0; // created a variable to keep count on the amount of countries
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                count++;
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Total amount of countries:"+count); // printed out the total of countries
        System.out.println();
        System.out.println();
        int count1=0;
        for(String[]Countries:countries){
            for(String CountrieS:Countries){
                count1++;
                System.out.print(CountrieS+" ");
            }
            System.out.println();
        }
        System.out.println("Total amount of countries:"+count1);
    }
}
