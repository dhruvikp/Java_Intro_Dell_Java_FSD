
public class Adder {

	
	public int add (int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
	
		Adder adder  = new Adder();
		adder.add(1, 2);
		adder.add(1, 3, 4);
		
	}
}
