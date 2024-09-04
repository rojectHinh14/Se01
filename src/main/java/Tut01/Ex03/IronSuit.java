package Tut01.Ex03;

public class IronSuit extends Vehicle{

    private double flySpeed;
    public IronSuit(String name, double width, double height, double length, double weight, int seatingCapacity, String registration, double flySpeed) throws Exception {
        super(name, width, height, length, weight, seatingCapacity, registration);
        this.flySpeed = flySpeed;
    }

    public void fly(String pointA, String pointB, double distance){
        System.out.println(pointA);
        for (int i = 0; i< distance; i++){
            try{
                Thread.sleep(3000);
                System.out.println(".");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(pointB);
    }
    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

}
