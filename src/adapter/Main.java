package adapter;

public class Main {

    public static void main(String[] args) {

        Oven oven= new Oven();
        Lamp lamp= new Lamp();
        PowerAdapter lightbulb= new PowerAdapter();

        turnOn(oven);
        turnOn(lamp);
        turnOn(lightbulb);

        turnOff(lightbulb);
        System.out.println(isOn(lightbulb));

    }

    public static void turnOn(Pluggable pluggable){
        pluggable.turOn();
    }

    public static void turnOff(Pluggable pluggable){
        pluggable.turnOff();
    }

    public static boolean isOn(Pluggable pluggable){
        return pluggable.isOn();
    }
}
