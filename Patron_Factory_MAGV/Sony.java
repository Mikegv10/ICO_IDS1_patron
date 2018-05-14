package ico.Aragon.factory;


public class Sony implements Mobile{
    private int ramSize;
	private String processor;
	
	public Sony(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}

    @Override
    public String toString() {
        return "Memoria RAM=" + ramSize + ", Procesador=" + processor;
    }
        
        
}