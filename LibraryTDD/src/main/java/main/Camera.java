package main;

public class Camera extends Item {
	private int megaPixels;

	public Camera(int itemID, boolean available, int megaPixels) {
		super(itemID, available);
		this.megaPixels = megaPixels;
	}

	public int getMegaPixels() {
		return megaPixels;
	}

	public void setMegaPixels(int megaPixels) {
		this.megaPixels = megaPixels;
	}
}
