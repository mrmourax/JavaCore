package Serialization;

import java.io.*;

//serializacija - eto zapis objektov v fail

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Tom");
        Person person2 = new Person(2, "Bob");

        Person[]people = {
                new Person(1, "Tom"),
                new Person(2, "Bob"),
                new Person(3, "Mike")
        };

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
