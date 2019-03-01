import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args){
        // Scanner class example
        String stop = "";
        System.out.println("Welcome to AnimalHospital");
        Scanner in = new Scanner(System.in);
        List<String> cats = new ArrayList<String>();
        do {
            System.out.print("Input city: ");
            String catCity = in.nextLine();
            System.out.print("Input breed: ");
            String catBreed = in.nextLine();

            System.out.println("Enter any key continue...");
            System.out.println("Enter 0 to exit...");

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
    }
}
