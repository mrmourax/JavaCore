package Enum;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal);

        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());

        switch (animal){
            case CAT:
                System.out.println("It is a cat");
                break;
            case DOG:
                System.out.println("It is a dog");
                break;
        }

        Seasons season = Seasons.WINTER;
        System.out.println(season.ordinal());
        System.out.println(season.name());
        System.out.println(season.getTemperature());


        System.out.println(season instanceof Seasons);//proverjaem SUMMER eto objekt klassa SEASON
        System.out.println(season instanceof Enum);//proverjaem SUMMER eto objekt klassa ENUM
        System.out.println(season.getClass());//polu4aem klass objekta


        if(season == Seasons.AUTUMN){
            System.out.println("It is autumn");
        }
        else if(season == Seasons.SPRING){
            System.out.println("It is spring");
        }
    }
}
