package singleton;

public class Aplicacion {

    private static Aplicacion aplicacion;
    private boolean isRunning= false;

    //CONSTRUCTOR PRIVADO, ASÍ NO LO PUEDEN INSTANCIAR
    private Aplicacion(){}

    public static Aplicacion getInstance(){
        if (aplicacion== null){
            aplicacion= new Aplicacion();
        }
        return aplicacion;
    }

    //GETTER AND SETTER

    public boolean isRunning() {
        return isRunning;
    }

    public void Run() {
        if (!isRunning){
            isRunning= true;
        }else{
            System.out.println("Ya se encuentra en ejecución");
        }
    }

    public void Stop() {
        if (isRunning){
            isRunning= false;
        }else{
            System.out.println("Ya se encuentra detenida");
        }
    }
}
