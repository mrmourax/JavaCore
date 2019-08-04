package NestedClasses;

public class Test {
    public static void main(String[] args) {
        ElectroCar electrocar = new ElectroCar(1);
        electrocar.start();

        ElectroCar.Battery battery = new ElectroCar.Battery();
    }
}


