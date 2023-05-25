package factory;

public class PrecioFactory {

    Precio pr;

    @SuppressWarnings("unused")
    private PrecioFactory(){}

    public PrecioFactory(String pais){
        if (pais.equalsIgnoreCase("Alemania")){
            System.out.println("Alemania, precio EUR: ");
            pr = new PrecioEUR();
        }
        else if (pais.equalsIgnoreCase("Inglaterra")){
            System.out.println("Precio desde UK: ");
            pr= new PrecioGBP();
        }
        else{
            System.out.println("Países del mundo, precio USD: ");
            pr = new PrecioUSD();
        }
    }

    public double getPrecio(){
        return pr.getPrecio();
    }

}
