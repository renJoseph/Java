package main;

import java.util.*;

public class Events {
	public Events() {
	}

	Random r = new Random();

	public void finish() {
		int a = r.nextInt(3);
		if (a == 0) {
			System.out.println(
					"You stumble across a large protruding object from the ground, at first confused by what this could be,");
			System.out.println(
					"you then realise there is a man beneath the surface. His arm reaches up, grabbing you by the ankle and");
			System.out.println(
					"entrapping you in dirty. You gasp for air only to suffocate on dirt, and as such is the end of your life.");
		} else if (a == 1) {
			System.out.println(
					"You come across a potion, desperate for an end to this torment you drink it, and wake up panting. It had");
			System.out.println("all been a bad dream. The end");
		} else if (a == 2) {
			System.out.println(
					"You come across a strange rock, a quiet noise eminating from it. You etch closer, and hear a voice. It");
			System.out.println(
					"tells you to place your palms upon it. As you do so, the world turns upside down and you find yourself");
			System.out.println(
					"back in the insane asylum you've lived your entire life. Sometimes reality is worse than dreams.");
		} else if (a == 3) {
			System.out.println(
					"As you reach the location, a cage falls down upon you. Second by second it grows smaller, until you are");
			System.out.println("crushed into nothing. The end.");
		}
	}
}