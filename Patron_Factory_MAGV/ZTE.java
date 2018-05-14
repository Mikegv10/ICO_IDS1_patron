package ico.Aragon.factory;


public class ZTE implements Mobile{
    private int ramTamaño;
    private String Procesador;
    private double precio;

    public ZTE(int Memoria, String Procesador, Double precio) {
        this.ramTamaño = Memoria;
        this.Procesador = Procesador;
        this.precio= precio;
    }

    @Override
    public String toString() {
        return "Memoria Ram=" + ramTamaño + ", Procesador=" + Procesador + ", precio=" + precio;
    }
    
    
}
