public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();

        //System.out.println("My name is " + person1.name + "," + "I am " + person1.age);
        //person1.speak();
        person1.sayHello();
        person1.setName("asd");
        person1.setAge(-8);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person person2 = new Person();

        //System.out.println("My name is " + person2.name + "," + "I am " + person2.age);
        person2.speak();
        int year1 = person2.calculate();
        System.out.println("Pervomu cheloveku do pensii " + year1);
    }
}

class Person{
    //У клвссв монут быть 1) данные(поля)  м действия (методы)
    private String name;
    private int age;

    //setter
    public void setName(String username){
        if(username.isEmpty()){
            System.out.println("ti vvel pustoe imja");
        }
        else{
            name = username;
        }

    }
    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setAge(int userage){
        if(userage<0){
            System.out.println("vozrast dolzen bit bolwe 0");
        }
        else{
            age = userage;
        }
    }
    //getter
    public int getAge(){
        return age;
    }



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
