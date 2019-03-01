import javax.sound.midi.Soundbank;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) throws AWTException {
        // Scanner class example
        /*
        String stop = "";
        System.out.println("Welcome to AnimalHospital");
        Scanner in = new Scanner(System.in);
        List<String> cats = new ArrayList<String>();
        do {
            System.out.print("Input city: ");
            String catCity = in.nextLine();
            System.out.print("Input breed: ");
            String catBreed = in.nextLine();

            System.out.println("Enter any key continue and press enter...");
            System.out.println("Enter 0 to exit and press enter...");

            if(!in.hasNextLine()){
                System.out.println("Sorry, this is not a string");
            }

            cats.add(catCity);
            cats.add(catBreed);
            for (int i = 0; i < cats.size(); i++) {
                System.out.println(cats.get(i));
            }
            System.out.println("\n");
        }
        while(!in.nextLine().equals("0"));
        in.close();
        */


        //
        Scanner in2 = new Scanner(System.in);

        do {
            System.out.println("Enter the number > 0:");

            int value = in2.nextInt();
            int flowerCount = 1;

            if(value <= 0){
                System.out.println("Value is incorrect. Stop.");
            }
            else if(value == 1){
                System.out.println("Flower count: 1");

            }
            else{
                flowerCount = value + (value - 1); // 0 +
                System.out.println("Flower count: " + flowerCount);

            }

            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_1);
            r.keyRelease(KeyEvent.VK_1);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);

            System.out.println("Enter -1 for exit");


        }
        while(in2.nextInt() != -1);

        in2.close();

    }
}
