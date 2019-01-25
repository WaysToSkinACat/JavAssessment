package test.TreasureHunt;

import java.util.Random;
import java.util.Scanner;

public class storageTwo {
	
	int distance;

	String command;
	int width;
	int hight;
	int positionW;
	int positionH;
	int count;
	Scanner sc = new Scanner(System.in);
	
	public void directions() {	
					
		System.out.println("Where do you want to go?");
			command = sc.nextLine();
			command = command.toLowerCase();
			
			
			if (command.equals("north") ||command.equals("n")) {
				System.out.println("Alright, let's go north");
			}else if (command.equals("south") ||command.equals("s")){
				
				System.out.println("Alright, let's go south");
			}else if (command.equals("east") ||command.equals("e")){
				
				System.out.println("Alright let's go east");
			}else if (command.equals("west") ||command.equals("w")) {
				System.out.println("Alright let's go west");
			}else {
				System.out.println("It was a simple question, Where do you want to go? ('north', 'south', 'east', or 'west')");
			}
	}
	public void movement() {
			
			System.out.println("How far do you want to go?");
			
			distance = sc.nextInt();

			
				if (command.equals("north") ||command.equals("n")) {
					
					System.out.println("Alright " + distance + " steps north");
					positionH = positionH + distance;
					
				}else if (command.equals("south") ||command.equals("s")){
					
					System.out.println("Alright " + distance + " steps south");
					
					positionH = positionH - distance;
				}else if (command.equals("east") ||command.equals("e")){
					
					System.out.println("Alright " + distance + " steps east");
					positionH = positionW + distance;
					
				}else if (command.equals("west") ||command.equals("w")) {
					
					System.out.println("Alright " + distance + " steps west");
					positionH = positionH - distance;
				}
			
	
}
	
	public void distanceTo() {
		
			if (positionH == hight && positionW == width) {
				count=42;	
			}else {
			System.out.println("You are " + (hight - positionH) +" steps north/south from the treasure");
			System.out.println(" and you are " + (width - positionW) + " steps east/west from the treasure.\n You can do it");
			}

		
	}
	
	
	
	public void startGame() {
		
		System.out.println("Would you like to play Treasure Hunt?");
		
		String play = sc.nextLine().toLowerCase();
		if (play.equals("yes") || play.equals("y")){
		System.out.println(
				"Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins."
				+ "\n Some black plants barely poke out of the shallow water. Try 'north', 'south', 'east', or 'west' "
				+ "\n You have device in your left hand. It has hands like a watch, but the hands don't seem to tell time.");
		}else { System.out.println("I'm sorry you didn't want to play, you just had to say yes or y. "
				+ "\n If you want to play in the future just start me up again");
		
		}
		}
	
	
	public void treaurePos() {
		int j = new Random().nextInt(30)-15;
		int k = new Random().nextInt(30)-15;
		hight = j;
		width = k;

			}
}