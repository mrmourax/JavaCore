package Interfaces;

public class Test {
    public static void main(String[] args) {
       // Animal animal1 = new Animal(1);
        // Person person1 = new Person("Bob");
        //animal1.showInfo();
        //person1.showInfo();

        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
    }
}


//kazdij klass nasleduetsa ot object
//Inteface - esli est obwee svoistvo naprimer Prigu4ij,
// eto mozet bit shina, mja4
// mi piwem metod void prigu4ij();