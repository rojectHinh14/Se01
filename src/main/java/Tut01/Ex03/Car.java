package Tut01.Ex03;

public class Car extends Vehicle {
    private String owner;

    public Car(String name, double width, double height, double length, double weight, int seatingCapacity, String owner, String registration) throws Exception {
        super(name, width, height, length, weight, seatingCapacity, registration);
        if (!isValidateLength(length)){
            throw new Exception("Car length should be a number");
        }
        if (!isValidateWeight(weight)){
            throw new Exception("Car weight should be a number");
        }
        if (!isValidateRegisration(registration)){
            throw new Exception("Car registration should be valid");
        }
        this.owner = owner;
    }
    @Override
    public boolean isValidateRegisration(String reg){
        return reg.matches("[a-zA-Z0-9]{1,6}");

    }

    @Override
    public boolean isValidateLength(double length){
        return length >=1.5 && length <= 3.5;
    }

    @Override
    public boolean isValidateWeight(double weight){
    return weight >=5000.0 && weight <= 20000.0;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Car{" +
                "owner='" + owner + '\'' +
                '}';
    }
}

