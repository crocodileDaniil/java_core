package les001;

public class Main {

	public static void main(String[] args) {
		String name = "Daniil";
		int x;
		x = 25;
		int y = 19;
		
		System.out.println("Hello, Eclipse " + name + " your age: "+ x);
		
		x = x + y - (y = x);
		
		System.out.println("x = " + x + " y = " + y);
		
	}

}
