package Interfaces;

/*
    INTERFACE EXAMPLE
    ALLOWS MULTIPLE INHERITANCE WHICH WAS ONCE IMPOSSIBLE WITH ABSTRACTION
    E.G. PUBLIC CLASS CAR EXTENDS iMEDIA,iVEHICLE IS NOT POSSIBLE.


 */
public class Car implements IVehicle {

    String noPlate;

    @Override
    public void start() {
        System.out.println("start car");
    }

    @Override
    public void stop() {
        System.out.println("stop car");
    }

    @Override
    public void acc() {
        System.out.println("accelerating");
    }

    public static void main(String[] args) {
        // Car car = new Car();
        //
        // car.start();
        // car.acc();
        // car.stop();

        /*
         * METHODS ACCESS DEPENDS ON THE IVEHICLE VEH == REFERENCE VARIABLE
         * NEW CAR() IS USED TO ACHIEVE POLYMORPHISM
         */

        Car car = new Car();
        car.noPlate = "123LP";
        System.out.println(car.noPlate);

        IVehicle veh = new Car();
        veh.acc();
        veh.start();
        veh.stop();

        IMedia media = new Media();
        media.play();
        media.stop();

    }
}
