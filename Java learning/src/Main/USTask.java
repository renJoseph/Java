package Main;

public class USTask {
	public int UniqueSum(int a, int b, int c) {
		if (a!=b && a!=c && b!=c) 
			return (a + b + c);
		else if (a == b && b == c)
			return 0;
		else if (a == b)
			return c;
		else if (a == c)
			return b;
		else if (b == c)
			return a;
		else
			return 0;
		}
	}


