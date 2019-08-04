import java.io.IOException;
import java.text.ParseException;

public class Exceptions3 {
    public static void main(String[] args) {
        //checked exception (compile time exception)
        //unchecked (runtime exception)
        try {
            run();
        } catch (IOException | ParseException e) { //multicatch
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException{

    }
}
