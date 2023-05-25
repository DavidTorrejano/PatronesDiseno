package miSingleton;

public class CarroFamiliar {

    static CarroFamiliar carroFamiliar;
    private int nPuertas;
    private String marca;
    private String color;
    private String nombre;

    private CarroFamiliar(){}

    public static CarroFamiliar getInstance(){
        if (carroFamiliar== null){
            carroFamiliar= new CarroFamiliar();
        }
        return carroFamiliar;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
