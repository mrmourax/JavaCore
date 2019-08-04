import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        File file = new File("asd");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        }
        System.out.println("After Try Catch");
    }

    public void readFile(){

    }
}
