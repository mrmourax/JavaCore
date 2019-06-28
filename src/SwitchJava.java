import java.util.Scanner;

public class SwitchJava {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        int age = s.nextInt();
        /*
        if(age == 10){
            System.out.println("You study at school");
        }
        else if (age == 18){
            System.out.println("You finished school");
        }
        */
        switch(age) {
            case 0:
                System.out.println("You born");
                break;
            case 7:
                System.out.println("You went to school");
                break;
            case 18:
                System.out.println("You finished school");
                break;
            default:
                System.out.println("No matches");
        }
    }
}
