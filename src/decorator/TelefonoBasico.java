package decorator;

public class TelefonoBasico implements Telefono{
    @Override
    public void crear() {
        System.out.println("I am a basic phone, I have this characteristics: ");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){
        System.out.println("Basic Phone ->  I have GSM");
    }

    private void tengoSMS(){
        System.out.println("Basic Phone ->  I have SMS");
    }
}
