package compass;

public class Game {

	public static void main(String[] arg) {
		
		
		GameStart start = new GameStart();
		do {
		start.startGame();
		start.treaurePos();
		do{
	 if( start.endCounter == 0) {
		 break;
	 	}
	 	
	 		do{start.directions();
	 		}while (start.count != 0);
	 		do{start.movement();
	 		}while (start.count != 0);
			start.distanceTo();
	 		 
		
		}while(start.count != 42);
		
		
		}while(start.endCounter != 0);
		
	}
	
}
