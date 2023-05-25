package adapter;

public class Oven implements Pluggable{

    boolean power= false;

    @Override
    public void turOn() {
        power= true;
        System.out.println("Oven turned on");
    }

    @Override
    public void turnOff() {
        power= false;
        System.out.println("Oven turned off");
    }

    @Override
    public boolean isOn() {
        return power;
    }

}
