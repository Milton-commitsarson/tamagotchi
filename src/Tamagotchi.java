import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    //Attributes
    private int hunger;
    private int boredom;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive;
    private Random generator = new Random();
    Scanner wordScanner = new Scanner(System.in);
    public String name;

    //Constructers


    //Methods
    public void Feed(){

    }
    public void Hi(){

    }
    public void Teach(String words){
        System.out.println("Write a word you want your tamagotchi to lern");
        this.words.add(wordScanner.next());
        System.out.println(words);

    }
    public void Tick(){

    }
    public void PrintStats(){

    }
    private void ReduceBoredom(){

    }

    // Setters & getters

}
