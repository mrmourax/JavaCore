import java.io.IOException;
import java.util.Scanner;

public class Exceptions2  {

    public static void main(String[] args) throws ScannerException  {
        /*
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("User entered wrong value");
                }
            }
        }
        */

        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0) {
                throw new ScannerException("User entered not ZERO");
            }
        }

    }
}
