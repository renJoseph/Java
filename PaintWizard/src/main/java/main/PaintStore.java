package main;

import java.util.*;

public class PaintStore {
	
	private List<Paint> paints = new ArrayList<>();
	
	private List<Integer> paintCoverage = Arrays.asList(210, 480, 176, 220);
	
	public PaintStore() {
		super();
	}
	public boolean addPaint(Paint paint) {
		return this.paints.add(paint);
	}
	public boolean removePaint(Paint paint) {
		return this.paints.remove(paint);
	}
	public void printPaints() {
		for (Paint p : paints) {
			System.out.println(p);
		}
		
	}
	public String minWaste(List<Integer> paints) {
		for (Paint p : paints) {
		}
}
}
