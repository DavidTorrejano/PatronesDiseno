package Builder;

public class Main {

    public static void main(String[] args) {

        Vehiculo coche= new CocheBuilder("Toyota")
                .setPuertas(4)
                .setMotor("V12")
                .build();

        System.out.println(coche.getMotor());

    }
}
