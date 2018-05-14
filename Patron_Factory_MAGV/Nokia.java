package ico.Aragon.factory;


public class Nokia implements Mobile {

    private double Pantalla;
    private String Procesador;
    private String Sistema;

    public Nokia(double pantalla, String processor, String Sistema) {
        this.Pantalla=pantalla;
        this.Procesador = processor;
        this.Sistema=Sistema;
    }

    @Override
    public String toString() {
        return  "Pantalla=" + Pantalla + ", Procesador=" + Procesador + ", Sistema=" + Sistema;
    }

   
}
