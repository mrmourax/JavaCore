import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        ////// Java 5 ///////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);

        ////// Generics ///////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);


        /////// Java 7 ///////
        List<String> animals3 = new ArrayList<>(); // Mozno ne ukazivat v skobkax tip dannix
    }
}
