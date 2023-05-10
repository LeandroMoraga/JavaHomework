package MethodsOverLoadHw;

public class Area {
    /*
    task:
     Create 1 class in which create a methods that will calculate the area of Rectangle and Square,
     and Method name must be called calculateArea
     */
    public static void calculateArea(int length,int width){
        System.out.println(length*width);
    }

    public static void calculateArea(int square){
        System.out.println(square*square);
    }
}
