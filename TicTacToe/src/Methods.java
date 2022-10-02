import java.util.Scanner;

public class Methods {
	public static int Menu(String[] options) {
		int selection = 0;
		Scanner scnr = new Scanner(System.in);
		for(int i = 0; i < options.length; i++) {
			System.out.println((i+1) + ") " + options[i]);
		}
		while(true) {
			System.out.print("> ");
			selection = scnr.nextInt();
			if(selection < 1 || selection > options.length) {
				System.out.println("Invalid selection");
			} else {
				break;
			}
		}
		return selection;		
	}
}
