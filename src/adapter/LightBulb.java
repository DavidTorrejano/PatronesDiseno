package adapter;

public class LightBulb {

    boolean powered= false;
    int voltage;
    final int ZERO= 0;

    public void powerOn(int voltage){
        powered= true;
        this.voltage= voltage;
        System.out.println("lightbulb turned on, voltage is " + voltage);
    }

    public void powerOff(){
        powered= false;
        voltage= ZERO;
        System.out.println("lightbulb turned off, voltage is " + voltage);
    }

    public boolean isPowered(){
        return powered;
    }

}
