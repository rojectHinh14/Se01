package Tut01.Ex03;

public class Vehicle {
    private String name;
    private double width;
    private double height;
    private double length;
    private double weight;
    private int seatingCapacity;
    private String registration;
    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity, String registration)throws Exception {
       if(!isValidateName(name)){
           this.name=name;
       }
       if(!isValidateWidth(width)){
           this.width=width;
       }
       if(!isValidateHeight(height)){
           this.height=height;
       }
       if(!isValidateLength(length)){
           this.length=length;
       }
       if(!isValidateWeight(weight)){
           this.weight=weight;
       }
       if(!isValidateSeatingCapacity(seatingCapacity)){
           this.seatingCapacity=seatingCapacity;
       }

if (!isValidateRegisration(registration)) {
    this.registration=registration;
}
    }
    public String getRegistration(){
        return this.registration;
    }
    public void setRegistration(String registration) throws Exception{
        if(!isValidateName(registration)){
            throw new Exception("Invalid Registration");
        }
        this.registration=registration;
    }

    public String getName() {
        return name;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) throws Exception{
if (isValidateName(name)){
    throw new Exception("Name invalid");
}
else {
    this.name = name;
}
    }
    public void setWidth(double width) throws Exception{
        if(isValidateWidth(width)){
            throw new Exception("Width invalid");
        }
        else{
            this.width = width;
        }
    }
    public void setHeight(double height) throws Exception{
        if(isValidateHeight(height)){
            throw new Exception("Height invalid");
        }
        else{
            this.height = height;
        }
    }
    public void setLength(double length) throws Exception{
        if(isValidateLength(length)){
            throw new Exception("Length invalid");
        }
        else{
            this.length = length;
        }
    }

    public boolean isValidateRegisration(String reg){
        return reg.matches("[a-zA-Z0-9]{1,12}");
    }
    public void setWeight(double weight) throws Exception{
        if(isValidateWeight(weight)){
            throw new Exception("Weight invalid");
        }
        else{
            this.weight = weight;
        }
    }

    public void setSeatingCapacity(int seatingCapacity) throws Exception{
        if(isValidateSeatingCapacity(seatingCapacity)){
            throw new Exception("Seating capacity invalid");
        }
        else{
            this.seatingCapacity = seatingCapacity;
        }
    }
    public int getSeatingCapacity() {
      return seatingCapacity;
    }



    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", weight=" + weight +
                ", seatingCapacity=" + seatingCapacity +
                ", registration = " + registration +
                '}';
    }
    private boolean isValidateName(String name){
        return this.name.trim().length() <=100;
    }
    public boolean validateMin(double min){
        return min >=0;
    }
    public boolean isValidateWidth(double width){
        return !validateMin(width);
    }
    public boolean isValidateHeight(double height){
        return !validateMin(height);
    }
    public boolean isValidateLength(double length){
        return !validateMin(length);
    }
    public boolean isValidateWeight(double weight){
        return !validateMin(weight);
    }
    public boolean isValidateSeatingCapacity(int seatingCapacity){
        return seatingCapacity >=0;
    }
}
