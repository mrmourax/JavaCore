public class AbstractClass {
    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();
        cat.voice();
        dog.voice();
    }
}

abstract class Animals{
    abstract void voice();
}

class Cats extends Animals{
    void voice() {
        System.out.println("Meow!");
    }
}

class Dogs extends Animals{
    void voice() {
        System.out.println("Bark!");
    }
}

//Если в одном файле, то только один паблик может быть. Если в 3-х разных, можешь делать все пабликами.

//Final классы наследовать нельзя, а абстрактный как бы для наследования :)

//Public final по умолчанию константы в интерфейсах, но никак не абстрактные классы

//Package-private by default all classes