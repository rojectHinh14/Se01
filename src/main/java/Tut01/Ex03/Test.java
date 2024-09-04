package Tut01.Ex03;

public class Test {
    public static void main(String[] args) {
        try{
            Bus bus = new Bus("City Bus", 2.5, 3.0, 8.0, 10000.0, 50, 101, "BUS1234");
            Car car = new Car("Sedan", 1.8, 1.4, 3.0, 1500.0, 5, "John Doe", "CAR567");
            IronSuit suit = new IronSuit("Iron Man Suit", 1.0, 2.0, 1.5, 120.0, 1, "SUIT001", 300.0);
            System.out.println(bus);
            System.out.println(car);
            suit.fly("New York", "Los Angeles", 15);
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
}
