import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Tamagotchi  mytamagotchi = new Tamagotchi();

        System.out.println("Hi, here is a tamagotchi");



        Scanner myScanner = new Scanner(System.in);
        System.out.println("do you want to teach your tamagotchi a new word");

        String svar = myScanner.nextLine();

        if (svar.equals("y")){
            mytamagotchi.Teach();

            //System.out.println("new value " +myDice.sidesShowing);

            System.out.println("do you want to roll again? Y/N" );
        }
    }
}