package Interfaces;

public class Media implements IMedia{
    @Override
    public void play() {
        System.out.println("music playing");
    }

    @Override
    public void stop() {
        System.out.println("music stopped");
    }
}
