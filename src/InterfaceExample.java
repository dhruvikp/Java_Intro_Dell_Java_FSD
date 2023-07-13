
public interface InterfaceExample {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
	}
}

interface Drawable {
	void draw();
}

class Rectangle implements Drawable {

	public void draw() {
		System.out.println("Rectangle is drawn");
	}
}

class Circle implements Drawable {

	public void draw() {
		System.out.println("Circle is drawn");
	}
}