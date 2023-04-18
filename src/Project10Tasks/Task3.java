package Project10Tasks;

public class Task3 {
    public static void main(String[] args) {
        /*
         Create a 2D array of integer type where you will store odd and even numbers.
          Develop a program which will identify/print the even numbers only.
         */
      int [][] numbers={
              {44,68,2,90,12},
              {56,3,55,73,27},
              {90,1008,205,30022}
      };
        for (int i = 0; i< numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
