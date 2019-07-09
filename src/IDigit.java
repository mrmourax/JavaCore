public interface IDigit {
    void sum();
    void minus();
    void multiple();
}

class CeloeChislo implements IDigit{
    public void sum(){
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);
    }

    public void minus(){
        int a = 1;
        int b = 2;
        int sum = a - b;
        System.out.println(sum);
    }

    public void multiple(){
        int a = 1;
        int b = 2;
        int sum = a * b;
        System.out.println(sum);
    }
}

class VeshestvennoeChislo implements IDigit{
    public void sum(){
        double a = 1;
        double b = 2;
        double sum = a + b;
        System.out.println(sum);
    }

    public void minus(){
        double a = 1;
        double b = 2;
        double sum = a - b;
        System.out.println(sum);
    }

    public void multiple(){
        double a = 1;
        double b = 2;
        double sum = a * b;
        System.out.println(sum);
    }
}

class MainProgram{
    public static void main(String[] args) {
        // VARIANT 1
        CeloeChislo c = new CeloeChislo();
        c.minus();
        c.multiple();
        c.sum();

        VeshestvennoeChislo v = new VeshestvennoeChislo();
        v.minus();
        v.multiple();
        v.sum();


        //VARIANT2
        IDigit i = new CeloeChislo();
        i.sum();
        i.multiple();
        i.minus();

        IDigit i2 = new VeshestvennoeChislo();
        i2.minus();
        i2.multiple();
        i2.sum();
    }
}


//В общем, используй переменную типа интерфейса, если нужно работать с методами, которые описаны в интерфейсе. Если же нужно работать с методами, которые есть в классе, но отсутствуют в интерфейсе, то используй переменную типа конкретного класса.