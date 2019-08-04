public class EqualsStringPool {
    public static void main(String[] args) {
        Animal5 animal1 = new Animal5(1);
        Animal5 animal2 = new Animal5(1);

        System.out.println(animal1.equals(animal2)); //true

        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1.equals(string2));

        //esli sravnivaem primitivnij tip dannix , to ispolzuem ==
        //esli sravnivaem objekty , to equals()
    }
}


class Animal5{
    private int id;

    public Animal5(int id){
        this.id = id;
    }

    //pereopredelaem metod equals
    public boolean equals(Object obj){
        Animal5 otherAnimal = (Animal5) obj; //downcasting
        return this.id == otherAnimal.id;
    }
}