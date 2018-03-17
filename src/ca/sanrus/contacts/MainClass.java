package ca.sanrus.contacts;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//1. Add Contact
		//2. Modify Contact
		//3. Delete Contact
		//4. Search
		//5. Exit Application
		
		System.out.println("======== CONTACTS CONSOLE BASED APPLICATION ===============");
		int option;
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		do {
			
			System.out.println("---------------------------------------------------");
			System.out.println("1. Add Contact");
			System.out.println("2. Modify Contact");
			System.out.println("3. Delete Contact");
			System.out.println("4. Search");
			System.out.println("5. Exit");
			System.out.println("---------------------------------------------------");
			System.out.print("Input Option >>>>>>>>> ");
			
			option = scanner.nextInt();
			
			switch (option) {
				case 1:
					System.out.println("---Add contact---");
					break;
					
				case 2:
					System.out.println("---Modify contact---");
					break;
					
				case 3:
					System.out.println("---Delete contact---");
					break;
					
				case 4:
					System.out.println("---Search---");
					break;
					
				case 5:
					System.out.println("Exiting console application.");
					continueLoop = false;
					break;
					
				default:
					System.out.println("Invalid input. Please try again.");
					break;
			}
			
		} while (continueLoop);
		
	}

}
