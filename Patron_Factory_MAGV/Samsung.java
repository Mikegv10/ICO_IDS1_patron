package ico.Aragon.factory;


public class Samsung implements Mobile {

    private int ramSize;
    private String processor;
    
    

    public Samsung(int ramSize, String processor) {
        this.ramSize = ramSize;
        this.processor = processor;

    }

    @Override
    public String toString() {
        return " Memoria=" + ramSize + ", Procesador=" + processor;
    }

    
}
