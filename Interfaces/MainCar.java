package Interfaces;


public class MainCar {
    Media media;
    public MainCar(){
      this.media = new Media();
    }
    public void updgradeMedia(){
        this.media = new Media();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.noPlate = "Test plate";
        System.out.println(car.noPlate);
        car.start();
        car.stop();
        car.acc();
    }

}
