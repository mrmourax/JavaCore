package Interfaces;

public class Person implements Info{
    public String name;

    public void sayHello(){
        System.out.println("Say hello");
    }

    public Person(String name){
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Name is " + this.name);
    }

}
