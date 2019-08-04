package Enum;

public enum Seasons {
    SUMMER(30), WINTER(-30), AUTUMN(10), SPRING(20);

    private int temperature;
    Seasons(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}
