import java.util.Scanner;

public class Central {
	
	public enum GameState {MENU,AI,TWOPLAYER,TUTORIAL,QUIT};

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Boolean gameon = true;
		int gameselect;
		GameState gamestate = GameState.MENU;
		while(gameon) {
			if (gamestate == GameState.MENU) {
				String[] options = {"AI Game","2-Player","Tutorial","Quit"};
				
				System.out.println("=======================================================");
				System.out.println("  _______         ______              ______         \n"
						+ " /_  __(_)____   /_  __/___ ______   /_  __/___  ___ \n"
						+ "  / / / / ___/    / / / __ `/ ___/    / / / __ \\/ _ \\\n"
						+ " / / / / /__     / / / /_/ / /__     / / / /_/ /  __/\n"
						+ "/_/ /_/\\___/    /_/  \\__,_/\\___/    /_/  \\____/\\___/ \n"
						+ "                                                     ");
				System.out.println("=======================================================\n");
				System.out.println("Welcome to Tic Tac Toe!");
				gameselect = Methods.Menu(options);
				
				if(gameselect == 1) {
					gamestate = GameState.AI;
				} else if (gameselect == 2) {
					gamestate = GameState.TWOPLAYER;
				} else if (gameselect == 3) {
					gamestate = GameState.TUTORIAL;
				} else if (gameselect == 4) {
					gamestate = GameState.QUIT;
				}
				
			} else if (gamestate == GameState.AI) {
				System.out.println("");
				Game.aiPlayerTTT();
				gamestate = GameState.MENU;
				
			} else if (gamestate == GameState.TWOPLAYER) {
				Game.twoPlayerTTT();
				gamestate = GameState.MENU;
				
			} else if (gamestate == GameState.TUTORIAL) {
				System.out.println("\n\nWelcome to Tic Tace Toe! The rules are simple, but I'll teach you how to play!"
						+ "\nYou must select a space based on the number and letter! For example for top right"
						+ "\nit's \"1A\". Got it? Press ENTER to return to the menu.");
				@SuppressWarnings("unused")
				String bogus = scnr.nextLine();
				gamestate = GameState.MENU;
				
			} else if (gamestate == GameState.QUIT) {
				System.out.println("");
				System.out.println("Thanks for playing Tic Tac Toe!");
				System.out.println("Come back soon! Press ENTER to quit.");
				@SuppressWarnings("unused")
				String bogus = scnr.nextLine();
				gameon = false;
				scnr.close();
			}
		}
	}

}
