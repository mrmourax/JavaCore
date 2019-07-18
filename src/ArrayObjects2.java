public class ArrayObjects2 {
    public static void main(String[] args) {
        MyDog2[] dogs = new MyDog2[3];
        dogs[0] = new MyDog2("Billy", 11);
        dogs[1] = new MyDog2("Tommy", 5);
        dogs[2] = new MyDog2("Michael", 12);
        for(MyDog2 md : dogs){
            System.out.println(md.getName() + " - " + md.getAge());
        }
        MyDog2 md1 = new MyDog2();
        md1.voice();
    }
}

class MyDog2 extends MyAnimal{
    private String name;
    private int age;
    String breed;

    MyDog2(String name, int age){
        this.name = name;
        this.age = age;
    }

    MyDog2(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    void voice(){
        System.out.println("I am barking...");
    }
}

abstract class MyAnimal{
    abstract void voice();
}


