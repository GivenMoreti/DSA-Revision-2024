package AbstractClasses;

public class Main {

    public static void main(String[] args)
    {
        Car car = new Car(1234,4,"Car");
        System.out.println(car);
        car.start();
        car.stop();

        Bike bike = new Bike(122,2,"bike");
        System.out.println(bike);
        bike.start();
        bike.stop();

        AVehicle bc = new Bicycle(12,2,"bicycle");
        System.out.println(bc);
        bc.start();
        bc.stop();

        //polymorphism
        AVehicle aVehicle = new Bike(33,8,"truck");
        System.out.println(aVehicle);

    }
}
