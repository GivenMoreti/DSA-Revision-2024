package AbstractClasses;

class Car extends AVehicle{
    public Car(int license,int noWheels,String name){
        super(license,noWheels,name);
    }

    @Override
    void start() {
        System.out.println("start car");
    }

    @Override
    void stop() {
        System.out.println("stop car");
    }
}

class Bike extends AVehicle{
    public Bike(int license,int noWheels,String name){
        super(license,noWheels,name);
    }

    @Override
    void start() {
        System.out.println("start bike");
    }

    @Override
    void stop() {
        System.out.println("stop bike");
    }
}

class Bicycle extends AVehicle{
    public Bicycle(int license,int noWheels,String name){
        super(license,noWheels,name);
    }

    @Override
    void start() {
        System.out.println("start bicycle");
    }

    @Override
    void stop() {
        System.out.println("stop bicycle");
    }
}

