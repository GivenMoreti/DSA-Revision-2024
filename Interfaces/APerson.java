package Interfaces;

public abstract class APerson {
    String pName;
    public APerson(String pName){
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Name: " + this.pName;
    }
}
