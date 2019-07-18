public class ArrayObjects {
    public static void main(String[] args) {
        MyDog[] dogs = new MyDog[2];
        dogs[0] = new MyDog("Max");
        dogs[1] = new MyDog("Bob");
        for(MyDog d: dogs){
            System.out.println(d.getName());
        }
    }
}



class MyDog {
     private String name;

    MyDog(String dogName){
        this.name = dogName;
    }

    public String getName() {
        return name;
    }
}