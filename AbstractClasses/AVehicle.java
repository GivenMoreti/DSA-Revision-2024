package AbstractClasses;

public abstract class AVehicle {
    private int licence,noWheels;
    private String name;

    public AVehicle(){
        this.name = "AVehicleName";
        this.noWheels = 0;
        this.licence = 0;
    }
    //constructor of an abstract class
    public AVehicle(int licence, int noWheels,String name){
        this.licence = licence;
        this.noWheels = noWheels;
        this.name = name;
    }

    //getters
    public String getName(){
        return this.name;
    }
    public int getLicense(){
        return this.licence;
    }

    public int getNoWheels(){
        return this.noWheels;
    }

    //setters
    void setName(String name){
        this.name = name;
    }
    void setWheels(int wheels){
        this.noWheels = wheels;
    }

    void setLicence(int license){
        this.licence = license;
    }

    //CUSTOM METHODS
    abstract void start();
    abstract void stop();
    //to string
    public String toString(){
        System.out.println("----------------------");
        return "Wheels: " + this.getNoWheels() + "\nLicense: " + this.getLicense() + "\nName: " + this.getName();
    }
}
