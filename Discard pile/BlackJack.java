package Main;

public class BlackJack {
	public int play(int a, int b) {
		if (a>21)
			return b;
		return Math.max(a, b);
	}
/*
	public int play(int a, int b){
		if (a>21 && b>21)
			return 0;
		else if (a>21 && b<=21)
			return (b);
		else if (a<=21 && b>21)
			return (a);
		else if (a - b == 0)
			return (a);
		else if (a>b)
			return a;
		else if (b>a)
			return b;
		else
			return 0;
	}
*/
}
