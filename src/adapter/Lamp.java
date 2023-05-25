package adapter;

public class Lamp implements Pluggable{

    boolean power= false;

    @Override
    public void turOn() {
        power= true;
        System.out.println("lamp turned on");
    }

    @Override
    public void turnOff() {
        power= false;
        System.out.println("lamp turned off");
    }

    @Override
    public boolean isOn() {
        return power;
    }

}
