package decorator;

public class TelefonoInteligente extends TelefonoDecorator{

    public TelefonoInteligente(Telefono telefono){
        super(telefono);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("Smart Phone ->  I also have 4G");
    }
}
