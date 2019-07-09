public class ToString {
    public static void main(String[] args) {
        Human3 h = new Human3("Bob", 40);
        System.out.println(h);

        Students h1 = new Students("POPOV", "1", "2", "3", "4", "5");
        System.out.println(h1);
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


class Students{
    private String fullName;
    private String n1;
    private String n2;
    private String n3;
    private String n4;
    private String n5;

    public Students(String fullName, String n1, String n2, String n3, String n4, String n5){
        this.fullName = fullName;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public String toString(){
        return fullName+n1+n2+n3+n4+n5;
    }
}