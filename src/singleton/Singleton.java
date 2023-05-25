package singleton;

public class Singleton {

    private static Singleton singleton;
    int contador;

    private Singleton(){}
//    Para que no puedan iniciar una instancia de la classe como Clase nombre= new Clase();
//    creamos el constructor de la clase como privado

    public static Singleton getInstance(){
        if(singleton== null) {
            singleton= new Singleton();
        }
        return singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
