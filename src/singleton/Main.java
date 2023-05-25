package singleton;

public class Main {
    public static void main(String[] args) {

        Aplicacion app = Aplicacion.getInstance();
        Aplicacion app2 = Aplicacion.getInstance();

        app.Run();
        app2.Run();
    }
}