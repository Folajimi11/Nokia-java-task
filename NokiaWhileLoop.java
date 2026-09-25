import java.util.Scanner;
public class NokiaWhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mainPrompt;
		do{
			String mainMenu = """
==================== Main Menu ==========================
1    Phone book
2    Messages
3    Chat
4    Call register
5    Tones
6    Settings
7    Call divert
8    Music
9    Games
10   Calculater
11   Remainders
12   Clock
13   Profiles
14   Services
15   Sim Services
0 Exit
========================================================

""";
		
			System.out.println(mainMenu);
			mainPrompt = input.nextInt();
		
			switch(mainPrompt){
				case 1 -> {System.out.println("Phone book");
					int phoneBookChoice;
					do{
						String phoneBookPrompt = """
1 Search
2 Service Nos. 
3 Add name
4 Erase
5 Edit
6 Copy
7 Assign tone
8 Send b’card
9 Options
10 Speed dials
11 Voice tags
0. Back
""";
						System.out.println(phoneBookPrompt);
		                System.out.println("Enter any option (1-11):");
					    phoneBookChoice = input.nextInt();

					    switch(phoneBookChoice){

							case 1 -> System.out.println("Search"); 
							case 2 -> System.out.println("Service NOS.1"); 
							case 3 -> System.out.println("Add name");
				            case 4 -> System.out.println("Erase"); 
				            case 5 -> System.out.println("Edit"); 
				            case 6 -> System.out.println("Copy"); 
				            case 7 -> System.out.println("Assign tone"); 
				            case 8 -> System.out.println("Send b'card'");
				            case 0 -> System.out.println("Exit");
			            }
					} while(phoneBookChoice != 0);
					}
				case 0 -> System.out.println("Exit"); 
				default -> System.out.println("Invalid input");
			}
		
		} while(mainPrompt != 0);
	}
}
