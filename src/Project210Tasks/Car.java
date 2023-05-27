package Project210Tasks;

public abstract class Car {
    /**
     * task:
     * Create a Class Car that would have the following fields: carPrice and color and
     * method calculateSalePrice() which should be returning a price of the car.
     * Create 2 subclasses: Sedan and Truck.
     */
   double carPrice;
   String color;

  abstract public double carPrice();
  Car(double carPrice,String color){
      this.carPrice=carPrice;
      this.color=color;
  }
}

class Sedan extends Car{
    /**
     * task:
     *The Sedan class has field as length and also does its own implementation of calculateSalePrice():
     * if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
    int length;
    Sedan(double carPrice,String color, int length){
        super(carPrice, color);
        this.length=length;
    }

    @Override
    public double carPrice(){
        double total;
        double discount;

        if(length>20){
            discount=0.05;
            discount=discount*carPrice;
            total=carPrice-discount;
        }else{
            discount=0.10;
            discount=discount*carPrice;
            total=carPrice-discount;
        }
        return total;
    }
}

class Truck extends Car{
    /**
     * task:
     * The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
     * in which returned price is calculated as following: if weight>2000 then returned price car should
     * include 10% discount, otherwise 20% discount.
     */
    int weight;
    Truck(double carPrice,String color,int weight){
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    public double carPrice() {
        double total;
        double discount;
        if(weight>2000){
            discount=0.10;
            discount=discount*carPrice;
            total=carPrice-discount;
        }else{
            discount=0.20;
            discount=discount*carPrice;
            total=carPrice-discount;
        }
        return total;
    }
}
