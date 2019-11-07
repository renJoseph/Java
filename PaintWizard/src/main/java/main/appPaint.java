package main;

import java.util.*;

public class appPaint {
	public static void main(String[] args) {
		PaintStore p = new PaintStore();
		p.addPaint(new Paint("CheapoMax", 210, 19.99));
		p.addPaint(new Paint("ThatOneWithTheDog", 480, 34.38));
		p.addPaint(new Paint("AverageJoes", 176, 17.99));
		p.addPaint(new Paint("DuluxurousPaints", 220, 25.00));
		p.printPaints();
	}

}
