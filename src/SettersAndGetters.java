public class SettersAndGetters {
    public static void main(String[] args){
        MyPerson person1 = new MyPerson();
        person1.setName("Alexei");
        person1.setAge(31);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
    }

    void temp() {
        MyPerson mp = new MyPerson();
        mp.setName("asd");
    }
}


class MyPerson{
   private String name;
   private int age;

   //setter
    public void setName(String name){
        this.name = name;
    }
    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setAge(int age){
        this.age = age;
    }
    //getter
    public int getAge(){
        return age;
    }
}