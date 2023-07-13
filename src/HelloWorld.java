
public class HelloWorld {

	static char a = 'a';

	public static void main(String[] args) {

		int number = 50;
		
		number += 10;
		

		String s = (number == 50) ? "fifty" : "sixty";
		System.out.println(s);
		

		/* 
		  byte, 
			short, 
			int, long, string

		 */
		
		switch (number) {

		case 10:
			System.out.println("10");
			break;

		case 20:
			System.out.println("20");
			break;

		case 30:
			System.out.println("30");
			break;

		default:
			System.out.println("Not in 10,20,30");

		}

		// Looping, for loop, while loop, do.. while loop

		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println("---");

		int i = 100;
		while (i <= 10) {
			System.out.print(i++);
		}

		int i1 = 100;
		do {
			System.out.print(i1++);
		} while (i1 <= 10);

		System.out.println("");
		// break statement, Continue statement

		for (int i2 = 1; i2 < 10; i2++) {
			if (i2 == 5) {
				continue;
			}
			System.out.print(i2);
		}

	}

	public void test1() {
		System.out.println(a);
	}

	public void test2() {
		System.out.println(a);
	}

}
