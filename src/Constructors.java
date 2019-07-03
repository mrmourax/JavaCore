public class Constructors {
    public static void main(String[] args){
        /*
        Humans human1 = new Humans("Nataly", 18);
        human1.setName("Tom");

        Humans.description = "Nice";
        Humans.getDescription();

        Humans h1 = new Humans("Kenny", 99);
        Humans.description = "Bad";

        h1.getAllFIelds();
        */

        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);

        Humans human1 = new Humans("Nataly", 18);
        Humans human2 = new Humans("Julia", 31);
        Humans human3 = new Humans("Alex", 35);
        Humans.printNumberOfPeople2();


    }
}

//stati4eskaja peremennaja sozdaetsa dlja vsex objektov klassa, a ne dlja konkretnogo
//stati4eskie metody vizivajutsa napramuju u klassa, a ne u objekta


class Humans{
    private String name;
    private int age;
    public static String description;
    private static int countPeople = 0; //by default will be 0

    public Humans(){
        this.name = "DefaultName";
        this.age = 0;
        System.out.println("Hello from 1 constructor");
    }

    public Humans(String name){
        System.out.println("Hello from 2 constructor");
        this.name = name;
    }

    public Humans(String name, int age){
        System.out.println("Hello from 3 constructor");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void getDescription(){
        System.out.println(description);
    }

    public void getAllFIelds(){
        System.out.println(name+age+description);
    }

    public void printNumberOfPeople(){
        System.out.println("Number of people " + countPeople);
    }

    public static void printNumberOfPeople2(){
        System.out.println("Number of people " + countPeople);
    }
}