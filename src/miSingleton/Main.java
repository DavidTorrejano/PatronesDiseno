package miSingleton;

public class Main {
    public static void main(String[] args) {

        CarroFamiliar carro= CarroFamiliar.getInstance();
        carro.setColor("Azul");

        CarroFamiliar carro2= CarroFamiliar.getInstance();
        System.out.println(carro2.getColor());

    }
}
