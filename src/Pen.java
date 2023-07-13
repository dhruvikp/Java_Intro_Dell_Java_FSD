
public class Pen {

	String refill;

	public void draw() {
		System.out.println("Drawing using " + refill);
	}

	public static void main(String[] args) {
		Pen pen = new Pen();
		pen.refill = "blue";
		pen.draw();
	}
}
