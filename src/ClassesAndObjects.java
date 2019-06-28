public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Vitali";
        person1.age = 29;
        //System.out.println("My name is " + person1.name + "," + "I am " + person1.age);
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Julia";
        person2.age = 31;
        //System.out.println("My name is " + person2.name + "," + "I am " + person2.age);
        person2.speak();
        int year1 = person2.calculate();
        System.out.println("Pervomu cheloveku do pensii " + year1);
    }
}

class Person{
    //У клвссв монут быть 1) данные(поля)  м действия (методы)
    String name;
    int age;

    void speak(){
        System.out.println("My name is " + name + "," + "I am " + age);
    }

    void sayHello(){
        System.out.println("Hello");
    }

    int calculate(){
        int years = 65-age;
        return years;
    }
}
