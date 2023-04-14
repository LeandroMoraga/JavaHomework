package TwoDArraysHomework;

public class TwoDArrayHw3 {
    public static void main(String[] args) {
      /*
      Using 2D array create a grocery list.
      Inside you should have an array of veggies,
      fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
       */
        String [][] groceryList={
                {"Broccoli","Tomatoes","Lettuce","Onions"},
                {"Apples","Bananas","Mango","Blue Berries"},
                {"Milk","Cheese","Yogurt"},
                {"Gushers","Gummy Bears","Sour Patch","Soda"}
        };
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(String[] list:groceryList){
            for(String grocery:list){
                System.out.print(grocery+" ");
            }
            System.out.println();
        }
    }
}
