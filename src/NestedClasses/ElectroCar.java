package NestedClasses;

public class ElectroCar {
    private int id;

    // vlozennij nestati4eskij klass
    private class Motor{
        public void startMotor(){
            System.out.println("Motor" + id + " is starting...");
        }
    }

    //stati4eskij vlozennij klass
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public ElectroCar(int id){
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar" + id + " is starting...");

        final int x = 1;

        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
    }
}
