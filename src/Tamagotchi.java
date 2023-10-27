import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    //Attributes
    private int hunger = 0; // antal hunger
    private int boredom = 0; //antal boredom
    private ArrayList<String> words = new ArrayList<String>(); //ra
    private Random generator = new Random();
    Random randomInt = new Random();
    Scanner wordScanner = new Scanner(System.in);
    public String tamName;

    //Constructers
    Tamagotchi(String name) {
        this.tamName = name;
    }

    //Methods
    public void Feed() {// Detta matar Tamagotchin med ett random antal mat mellan 1 till 3, och ifall den är mätt så kan man inte mata den.
        int food = randomInt.nextInt(1, 3);
        if (hunger > 0) {
            hunger -= food;
        } else {
            hunger = 0;
            System.out.println(this.tamName + " is full");
        }
    }

    public void Hi() {//detta ger ett av random ord som man har lärt tamagotchin dessutom kan man lära tamagochin ett till ord.
        //   Collections.shuffle(words);
        while (true) {

            if (words.size() > 0) {
                if (generator.nextFloat(1) > 0.05) {
                    System.out.println("FUCK YOU");
                } else {
                    System.out.println(words.get(generator.nextInt(words.size())));

                }

            } else {
                System.out.println(this.tamName + " dosen't know any words yet");
            }

            System.out.println("do you want " + this.tamName + " to say another word y or n");
            String no = wordScanner.nextLine();
            if (no.equals("n")) {
                break;
            }

            ReduceBoredom();
        }

    }

    public void Teach() {// detta gör så att man kan lära tamagotchin ett nytt ord

        while (true) {
            System.out.println("What new word do you want " + this.tamName + " to lern?");
            String newWord = wordScanner.nextLine();
            words.add(newWord);
            System.out.println("do you want to ad another word? write y if not wite n ");
            String no = wordScanner.nextLine();
            if (no.equals("n")) {
                break;
            }
            ReduceBoredom();
        }
    }

    public boolean Tick() { // detta gör så att de läggs till ett random antal hunger och boredom mellan 1-3
        int more = randomInt.nextInt(1, 2);
        hunger += more;
        boredom += more;
        if (hunger >= 10 || boredom >= 10) {
            return false;
        }

        return true;
    }

    public void PrintStats() { //detta visar hunger och boredom
        System.out.println("Hunger: " + hunger + " Boredom: " + boredom);
    }

    private void ReduceBoredom() { // Detta tar bort ett random antal boredom mellan 1 till 3, och ifall den är är på 0 så kan man inte ta bort mer boredom
        int bored = randomInt.nextInt(1, 3);
        boredom -= bored;
        if (boredom > 0) {
            boredom -= bored;
        } else {
            boredom = 0;
            System.out.println(this.tamName + " is happy");
        }
    }

    // Setters & getters

}
