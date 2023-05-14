package PolymorphismHomework;

public class ComputerTester {
    public static void main(String[] args){
 Computer [] computers={new Apple("Matte Black","Macbook Pro","M2",2022,"13 inch"),
 new Lenovo("Silver","Levono","ThinkPad X1 Extreme",2022,"14 inch"),
 new HP("Blue","HP","Pavilion Plus",2021,"14 inch"),
 new Dell("Grey","Dell","XPS 15",2022,"15 inch")};

 for(Computer comp:computers){
     comp.on();
     comp.type();
     comp.click();

     if(comp instanceof Apple){
         ((Apple)comp).prepTouchID();
     }else if(comp instanceof Lenovo){
         ((Lenovo)comp).touchScreen();
     }else if(comp instanceof HP){
         ((HP)comp).webCamera();
     }else if(comp instanceof Dell ){
         ((Dell)comp).display();
     }
     System.out.println();
        }
    }
}
