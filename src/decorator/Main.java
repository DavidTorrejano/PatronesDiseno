package decorator;

public class Main {

    public static void main(String[] args) {

        TelefonoNextGen telefono= new TelefonoNextGen(
                new TelefonoInteligente(
                        new TelefonoBasico()
                )
        );


        telefono.crear();



    }
}
