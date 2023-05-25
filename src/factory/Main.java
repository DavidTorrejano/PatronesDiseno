package factory;

public class Main {
    public static void main(String[] args) {

        PrecioFactory precio= new PrecioFactory("Alemania");
        System.out.println(precio.getPrecio());

        PrecioFactory precio2= new PrecioFactory("Estados Unidos");
        System.out.println(precio2.getPrecio());

        PrecioFactory precio3= new PrecioFactory("Inglaterra");
        System.out.println(precio3.getPrecio());

    }
}
