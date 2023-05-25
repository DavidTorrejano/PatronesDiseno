package adapter;

public class PowerAdapter implements Pluggable{

    public LightBulb lightBulb= new LightBulb();

    @Override
    public void turOn() {
        lightBulb.powerOn(110);
    }

    @Override
    public void turnOff() {
        lightBulb.powerOff();
    }

    @Override
    public boolean isOn() {
        return lightBulb.isPowered();
    }
}
