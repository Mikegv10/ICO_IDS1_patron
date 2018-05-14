package ico.Aragon.factory;


public class Motorola implements Mobile{
     private int Ram;
    private String Procesador;
    private String Red;
    
    public Motorola(int ramSize, String processor, String Red) {
        this.Ram = ramSize;
        this.Procesador = processor;
        this.Red = Red;
    }

    @Override
    public String toString() {
        return "Ram=" + Ram + ", Procesador=" + Procesador + ", Red=" + Red;
    }

    
}
