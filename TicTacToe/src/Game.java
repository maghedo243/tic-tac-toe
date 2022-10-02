import java.util.Random;
import java.util.Scanner;

public class Game {
	public enum PlayState {PLAYERONE,PLAYERTWO,AI};
	
	private static void spaceChoice(Scanner scnr, PlayState turn, String[] top, String[] mid, String[] low) {
		String choice;
		while(true) {
			System.out.print("> ");
			choice = scnr.next().toUpperCase();
			if(!choice.equals("1A") && !choice.equals("1B") && !choice.equals("1C") && !choice.equals("2A") && !choice.equals("2B") && !choice.equals("2C") && !choice.equals("3A") && !choice.equals("3B") && !choice.equals("3C")) {
				System.out.println("That's not a valid space");
				continue;
			} 
			if(choice.equals("1A") && !top[0].equals("-")) {
				System.out.println("This space is already taken. Try another one.");
				continue;
			} else if(choice.equals("1B") && !top[1].equals("-")) {
				System.out.println("This space is already taken. Try another one.");
				continue;
			} else if(choice.equals("1C") && !top[2].equals("-")) {
				System.out.println("This space is already taken. Try another one.");
				continue;
			} else if(choice.equals("2A") && !mid[0].equals("-")) {
				System.out.println("This space is already taken. Try another one.");
				continue;
			} else if(choice.equals("2B") && !mid[1].equals("-")) {
				System.out.println("This space is already taken. Try another one.");
				continue;
			} else if(choice.equals("2C") && !mid[2].equals("-")) {
				System.out.println("This space is already taken. Try another one.");
				continue;
			} else if(choice.equals("3A") && !low[0].equals("-")) {
				System.out.println("This space is already taken. Try another one.");
				continue;
			} else if(choice.equals("3B") && !low[1].equals("-")) {
				System.out.println("This space is already taken. Try another one.");
				continue;
			} else if(choice.equals("3C") && !low[2].equals("-")) {
				System.out.println("This space is already taken. Try another one.");
				continue;
			}
			
			if(choice.equals("1A")) {
				if(turn == PlayState.PLAYERONE) {
					top[0] = "X";
				} else {
					top[0] = "O";
				}
				break;
			} else if(choice.equals("1B")) {
				if(turn == PlayState.PLAYERONE) {
					top[1] = "X";
				} else {
					top[1] = "O";
				}
				break;
			} else if(choice.equals("1C")) {
				if(turn == PlayState.PLAYERONE) {
					top[2] = "X";
				} else {
					top[2] = "O";
				}
				break;
			} else if(choice.equals("2A")) {
				if(turn == PlayState.PLAYERONE) {
					mid[0] = "X";
				} else {
					mid[0] = "O";
				}
				break;
			} else if(choice.equals("2B")) {
				if(turn == PlayState.PLAYERONE) {
					mid[1] = "X";
				} else {
					mid[1] = "O";
				}
				break;
			} else if(choice.equals("2C")) {
				if(turn == PlayState.PLAYERONE) {
					mid[2] = "X";
				} else {
					mid[2] = "O";
				}
				break;
			} else if(choice.equals("3A")) {
				if(turn == PlayState.PLAYERONE) {
					low[0] = "X";
				} else {
					low[0] = "O";
				}
				break;
			} else if(choice.equals("3B")) {
				if(turn == PlayState.PLAYERONE) {
					low[1] = "X";
				} else {
					low[1] = "O";
				}
				break;
			} else if(choice.equals("3C")) {
				if(turn == PlayState.PLAYERONE) {
					low[2] = "X";
				} else {
					low[2] = "O";
				}
				break;
			}
			
		}
	}
	
	private static String winCheck(String[] top, String[] mid, String[] low, String winner) {
		if(top[0] == top[1] && top[1] == top[2] && !top[1].equals("-")) {
			winner = top[0];
			return winner;
		} else if(mid[0] == mid[1] && mid[1] == mid[2] && !mid[1].equals("-")) {
			winner = mid[0];
			return winner;
		} else if(low[0] == low[1] && low[1] == low[2] && !low[1].equals("-")) {
			winner = low[0];
			return winner;
		} else if(top[0] == mid[0] && mid[0] == low[0] && !top[0].equals("-")) {
			winner = top[0];
			return winner;
		} else if(top[1] == mid[1] && mid[1] == low[1] && !mid[1].equals("-")) {
			winner = mid[1];
			return winner;
		} else if(top[2] == mid[2] && mid[2] == low[2] && !low[2].equals("-")) {
			winner = low[2];
			return winner;
		} else if(top[0] == mid[1] && mid[1] == low[2] && !mid[1].equals("-")) {
			winner = mid[1];
			return winner;
		} else if(top[2] == mid[1] && mid[1] == low[0] && !low[0].equals("-")) {
			winner = low[0];
			return winner;
		} else if(!top[0].equals("-") && !top[1].equals("-") && !top[2].equals("-") && !mid[0].equals("-") && !mid[1].equals("-") && !mid[2].equals("-") && !low[0].equals("-") && !low[1].equals("-") && !low[2].equals("-")) {
			winner = "C";
			return winner;
		}
		
		
		return "";
		
	}
	
	private static void winOut(String winner, String[] row1, String[] row2, String[] row3) {
		printBoard(row1, row2, row3);
		if(winner.equals("X")) {
			System.out.println("   _  __    _         __  __                     _                       __\n"
					+ "  | |/ /   (_)____   / /_/ /_  ___     _      __(_)___  ____  ___  _____/ /\n"
					+ "  |   /   / / ___/  / __/ __ \\/ _ \\   | | /| / / / __ \\/ __ \\/ _ \\/ ___/ / \n"
					+ " /   |   / (__  )  / /_/ / / /  __/   | |/ |/ / / / / / / / /  __/ /  /_/  \n"
					+ "/_/|_|  /_/____/   \\__/_/ /_/\\___/    |__/|__/_/_/ /_/_/ /_/\\___/_/  (_)   \n"
					+ "                                                                           ");
		} else if (winner.equals("O")) {
			System.out.println("   ____     _         __  __                     _                       __\n"
					+ "  / __ \\   (_)____   / /_/ /_  ___     _      __(_)___  ____  ___  _____/ /\n"
					+ " / / / /  / / ___/  / __/ __ \\/ _ \\   | | /| / / / __ \\/ __ \\/ _ \\/ ___/ / \n"
					+ "/ /_/ /  / (__  )  / /_/ / / /  __/   | |/ |/ / / / / / / / /  __/ /  /_/  \n"
					+ "\\____/  /_/____/   \\__/_/ /_/\\___/    |__/|__/_/_/ /_/_/ /_/\\___/_/  (_)   \n"
					+ "                                                                           \n"
					+ "");
		} else if (winner.equals("C")) {
			System.out.println("    _   __                  _                       __\n"
					+ "   / | / /___     _      __(_)___  ____  ___  _____/ /\n"
					+ "  /  |/ / __ \\   | | /| / / / __ \\/ __ \\/ _ \\/ ___/ / \n"
					+ " / /|  / /_/ /   | |/ |/ / / / / / / / /  __/ /  /_/  \n"
					+ "/_/ |_/\\____/    |__/|__/_/_/ /_/_/ /_/\\___/_/  (_)   \n"
					+ "                                                      ");
		}
	}
	
	private static void printBoard(String[] toprow, String[] midrow, String[] lowrow) {
		
		System.out.println("   a     b     c");
		System.out.println("      |     |     ");
		System.out.println("1  " + toprow[0] + "  |  " + toprow[1] + "  |  " + toprow[2] + "  ");
		System.out.println(" _____|_____|_____");
		System.out.println("      |     |     ");
		System.out.println("2  " + midrow[0] + "  |  " + midrow[1] + "  |  " + midrow[2] + "  ");
		System.out.println(" _____|_____|_____");
		System.out.println("      |     |     ");
		System.out.println("3  " + lowrow[0] + "  |  " + lowrow[1] + "  |  " + lowrow[2] + "  ");
		System.out.println("      |     |     ");
	}
	
	public static void twoPlayerTTT() {
		Scanner scnr = new Scanner(System.in);
		Random randnum = new Random();
		Boolean tictactoe = false;
		String winner = "";
		PlayState player;
		String[] row1 = {"-","-","-"};
		String[] row2 = {"-","-","-"};
		String[] row3 = {"-","-","-"};
		if(randnum.nextInt(1,3) == 1) {
			player = PlayState.PLAYERONE;
		} else {
			player = PlayState.PLAYERTWO;
		}
		while(!tictactoe) {
			if(player == PlayState.PLAYERONE) {
				printBoard(row1, row2, row3);
				System.out.println("\nSelect a space: Player X");
				spaceChoice(scnr, player, row1, row2, row3);
				player = PlayState.PLAYERTWO;
				
			} else if (player == PlayState.PLAYERTWO){
				printBoard(row1, row2, row3);
				System.out.println("\nSelect a space: Player O");
				spaceChoice(scnr, player, row1, row2, row3);
				player = PlayState.PLAYERONE;
			}
			winner = winCheck(row1, row2, row3, winner);
			if(!winner.equals("")) {
				tictactoe = true;
			}
		}
		
		winOut(winner, row1, row2, row3);
		
		System.out.println("Press ENTER to continue...");
		Scanner scr = new Scanner(System.in);
		@SuppressWarnings("unused")
		String bogus = scr.nextLine();
		
		
		
	}
	
	public static void aiPlayerTTT() {
		TTTAI Bot = new TTTAI();
		int turn = 1;
		Scanner scnr = new Scanner(System.in);
		Boolean tictactoe = false;
		String winner = "";
		PlayState player;
		String[] row1 = {"-","-","-"};
		String[] row2 = {"-","-","-"};
		String[] row3 = {"-","-","-"};	
		player = PlayState.PLAYERONE;
		int difficulty;
		System.out.println("Which AI difficulty would you like?");
		difficulty = Methods.Menu(new String[]{"Easy","Medium","Hard(WIP)"});
		while(!tictactoe) {
			if(player == PlayState.PLAYERONE) {
				printBoard(row1, row2, row3);
				System.out.println("\nSelect a space: Human Player");
				spaceChoice(scnr, player, row1, row2, row3);
				player = PlayState.AI;
				
			} else if (player == PlayState.AI){
				if(difficulty == 1) {
					Bot.easyMove(row1, row2, row3);
				} else if (difficulty == 2) {
					Bot.mediumMove(row1, row2, row3);
				} else {
					Bot.hardMove(row1, row2, row3,turn);
				}
				
				player = PlayState.PLAYERONE;
				
			}
			winner = winCheck(row1, row2, row3, winner);
			if(!winner.equals("")) {
				tictactoe = true;
			}
			turn += 1;
		}
		
		winOut(winner, row1, row2, row3);
		
		System.out.println("Press ENTER to continue...");
		Scanner scr = new Scanner(System.in);
		@SuppressWarnings("unused")
		String bogus = scr.nextLine();
		
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String choice = scnr.next();
		if(choice.equals("2")) {
			twoPlayerTTT();
		} else {
			aiPlayerTTT();
		}
	}
}
