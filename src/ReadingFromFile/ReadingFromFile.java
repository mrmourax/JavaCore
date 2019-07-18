package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "user" + separator + "Desktop" + separator + "qa.txt";
        String path2 = "C:" + separator + "Users" + separator + "user" + separator + "Desktop" + separator + "conf.txt";
        File file = new File(path);
        File file2 = new File(path2);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();

        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] numbersString = line.split(" "); // metod SPLIT razdelit stroku po probelam
        int[] arrays = Arrays.stream(numbersString).mapToInt(Integer::parseInt).toArray();
        for(int array : arrays){
            System.out.println(array);
        }

        //System.out.println(Arrays.toString(numbersString));

        scanner2.close();
    }
}
