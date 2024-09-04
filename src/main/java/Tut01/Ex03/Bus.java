package Tut01.Ex03;

public class Bus extends Vehicle {
    private int route;

    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity, int route, String registration) throws Exception {
        super(name, width, height, length, weight, seatingCapacity,registration);

        if (!isValidateWeight(weight)){
            throw new Exception("Weight is invalid");
        }
        if (!isValidateLength(length)){
            throw new Exception("Length is invalid");
        }
        this.route = route;
if (!isValidateRegisration(registration)){
    throw new Exception("Registration is invalid");
}

    }

    @Override
    public boolean isValidateLength(double length){
        return length >= 4.0 && length <= 10.0;
    }
    @Override
    public boolean isValidateWeight(double weight){
          return weight >= 50;
    }

    @Override
    public boolean isValidateRegisration(String registrationNumber) {
        return registrationNumber.matches("[a-zA-Z0-9]{1,8}");
    }
    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    @Override
    public String toString() {
        super.toString();
        return "Bus{" +
                "route=" + route +
                '}';
    }
}
