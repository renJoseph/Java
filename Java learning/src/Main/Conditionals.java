package Main;

public class Conditionals {

	public int Conditional(int a, int b, boolean c) {
		if (c == true) {
			return (a + b);
		} else if (a%2 == 0 | b%2 == 0){
			return (0);
		}
		
		
		else {
			return (a * b);
		}
}

}
