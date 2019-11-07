package main;

public class App {
	public static void main(String[] args) {
		System.out.println("You awake from a deep slumber.");
		System.out.println(
				"Feeling disoriented, you look around, finding yourself in a deep fog which impairs your vision beyond a few metres ahead");
		System.out.println(
				"Your precious belongings are nowhere to be found, but upon searching your pocket you find a note saying 'your fate is in");
		System.out.println(
				"your hands now' and a magic compass with a spinning dial. You press a button on the side, the dial stops spinning.");

		Events event = new Events();
		Movement movement = new Movement();
		Compass compass = new Compass();
		
		Player player = new Player();
		Target target = new Target();
		
		
		compass.useCompass();
		movement.move();
		event.finish();
	}
}