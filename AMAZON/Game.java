package AMAZON;

import java.lang.Thread;


public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to line game");
        int score = 0;
        int count = 10;

        try {

            while (score < count) {
                startGame();
                Thread.sleep(2000); // wait 2 seconds
                score++;
            }


            // print score
            System.out.println("Score: " + score);

        } catch (InterruptedException e) {
            System.out.println(e.fillInStackTrace());
        }

    }

    // game setup

    public static void startGame() {

        try {
            
            System.out.println("-->");
            // delay by 3 seconds
            Thread.sleep(3000);
            System.out.println("<--");

        } catch (InterruptedException e) {
            System.out.println(e.fillInStackTrace());
        }

    }

    public int printStats() {
        return 0;
    }
}
