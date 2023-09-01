package factory;

//Used when we have multiple sub-class of a super class &
//based on input we want to return one class instance

//Provides abstraction between implementation and client class
//Removes instantiation of client class from code

public class FactoryExample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);

        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }
}
