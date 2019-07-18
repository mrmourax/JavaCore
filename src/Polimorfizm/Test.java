package Polimorfizm;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
          new Cat(), new Dog(), new Cow()
        };

        for(Animal animal : animals){
            animal.getAnimal();
        }
    }
}



//https://www.youtube.com/watch?v=6Z-xPXs4tg4