import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {


    public Game() {
        start();
    }

    private void start() {
        boolean isAlive = true;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hi, here is your Tamagotchi");

        System.out.println("what do you want to name it?");

        String input = myScanner.nextLine();

        Tamagotchi mytamagotchi = new Tamagotchi(input);


        while (isAlive) { // medan tamagotchin lever

            mytamagotchi.PrintStats();
            System.out.println(" ");
            System.out.println("1: do you want to teach " + mytamagotchi.tamName + " a new word ");
            System.out.println("2: do you want " + mytamagotchi.tamName + " to say a word");
            System.out.println("3: do you want to feed " + mytamagotchi.tamName);
            System.out.println("4: ");

            System.out.println("if you want to kill " + mytamagotchi.tamName + " press k");


            boolean bool = false;
            String yes = myScanner.nextLine();
            if (yes.equals("1")) {
                mytamagotchi.Teach();
            }
            if (yes.equals("2")) {
                mytamagotchi.Hi();
            }
            if (yes.equals("3")) {
                mytamagotchi.Feed();
            }
            if (yes.equals("k")) {
                isAlive = false;
            }

            isAlive = mytamagotchi.Tick();
        }
        System.out.println(mytamagotchi.tamName + " is dead");
    }
}


