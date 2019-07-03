public class ToString {
    public static void main(String[] args) {
        Human3 h = new Human3("Bob", 40);
        System.out.println(h);
    }
}


class Human3{
    private String name;
    private int age;

    public Human3(String name, int age){
        this.name = name;
        this.age = age;
    }

    //pereopredelaem metod toString
    public String toString(){
        return name + age;
    }
}