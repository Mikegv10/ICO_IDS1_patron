package ico.Aragon.factory;


public class IPhone implements Mobile {

    private int Ram;
    private String Procesador;
    private String GPU;

    public IPhone(int ramSize, String processor, String GPU) {
        this.Ram = ramSize;
        this.Procesador = processor;
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "Ram=" + Ram + ", Procesador=" + Procesador + ", GPU=" + GPU;
    }

   
    
}
