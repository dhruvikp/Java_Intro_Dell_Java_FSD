
public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		
	}

}

class Computer {
	private String RAM = "RAM";
	private String Processor;
	private String SSD;
	
	public void setRAM(String ram) {
		this.RAM = ram;
	}
	
	public String getRAM() {
		return this.RAM;
	}
	
	
}
