package test.TreasureHunt;

import java.util.Random;
import java.util.Scanner;

public class storage {

	private int distance;
	private String command;
	private int width;
	private int hight;
	private int positionW;
	private int positionH;
	int count;
	int endCounter = 100;
	private Scanner sa = new Scanner(System.in);
	private Scanner sb = new Scanner(System.in);
	private Scanner sc = new Scanner(System.in);

	public void startGame() {

		System.out.println("Would you like to play Treasure Hunt? (Y/N)");

		String play = sa.nextLine().toLowerCase();
		if (play.equals("yes") || play.equals("y")) {
			System.out.println(
					"Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins."
							+ "\n Some black plants barely poke out of the shallow water. Tell me where you want to search for the treasure ('north', 'south', 'east', or 'west')");
		} else {
			System.out.println("I'm sorry you didn't want to play. "
					+ "\n If you want to play in the future just start me up again");

			endCounter = 0;

		}
	}

	public void directions() {

		System.out.println("So where do you want to go now?");
		command = sc.nextLine();
		command = command.toLowerCase();

		if (command.equals("north") || command.equals("n")) {
			System.out.println("Alright, let's go north");
		} else if (command.equals("south") || command.equals("s")) {

			System.out.println("Alright, let's go south");
		} else if (command.equals("east") || command.equals("e")) {

			System.out.println("Alright let's go east");
		} else if (command.equals("west") || command.equals("w")) {
			System.out.println("Alright let's go west");
		} else {
			System.out.println(
					"It was a simple question, Where do you want to go? ('north', 'south', 'east', or 'west')");
		}
	}

	public void movement() {

		System.out.println("How far do you want to go?");

		distance = sb.nextInt();

		if (command.equals("north") || command.equals("n")) {

			System.out.println("Alright " + distance + " steps north");
			positionH = positionH + distance;

		} else if (command.equals("south") || command.equals("s")) {

			System.out.println("Alright " + distance + " steps south");

			positionH = positionH - distance;
		} else if (command.equals("east") || command.equals("e")) {

			System.out.println("Alright " + distance + " steps east");
			positionW = positionW + distance;

		} else if (command.equals("west") || command.equals("w")) {

			System.out.println("Alright " + distance + " steps west");
			positionW = positionW - distance;
		}

	}

	public void distanceTo() {

		if (positionH == hight && positionW == width) {
			count = 42;
			System.out.println("You've found the treasure!!!");

		} else {
			System.out.println("You are " + (positionH - hight) + " steps north/south from the treasure");
			System.out.println(
					" and you are " + (positionW - width) + " steps east/west from the treasure.\n You can do it");
		}

	}

	public void treaurePos() {
		int j = new Random().nextInt(30) - 15;
		int k = new Random().nextInt(30) - 15;
		hight = j;
		width = k;

	}

}

