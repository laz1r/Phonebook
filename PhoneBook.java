package com.phonebook;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class PhoneBook {
	
	private static boolean appState = true; 
	private static List<Person> person = new LinkedList<Person>();

 
	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("");
		System.out.println("Console Phonebook v1.0");
		System.out.println("Made with <3 by Erick");

		
		while(appState) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Select number option:");
			System.out.println("");
			System.out.println("");
			
			System.out.println("SEARCH");
			System.out.println("----------------------------------------------");
			
			System.out.println("1) Search by first name");
			System.out.println("2) Search by last name");
			System.out.println("3) Search by full name"); // array of person objects
			System.out.println("4) Search by telephone number");
			System.out.println("5) Search by city or state");
			System.out.println("6) Show all records in ascending order");
			System.out.println("");
			
			System.out.println("UPDATE");
			System.out.println("----------------------------------------------");
			System.out.println("7) Add new entry"); // Person object
			System.out.println("8) Update record for given telephone number");
			System.out.println("9) Delete record for given telephone number");
			System.out.println("");
			
			System.out.println("EXIT");
			System.out.println("----------------------------------------------");
			System.out.println("0) Exit");
			System.out.println("");
			System.out.print("Enter number: ");
			System.out.print("");
			
			Scanner s = new Scanner(System.in);
			int option = s.nextInt();
			
			// Check if anything in list
			if(option != 7 && person.size() == 0) {
				
				option = 7;
				System.out.println("There are no entries.");
				System.out.println(" ");
			}

			
			if(option == 1) { 
				System.out.println("Search by first name: ");
				boolean nameInList = false;
				Scanner name = new Scanner(System.in);
				String n = name.nextLine();
				
				// Iterate thru linked list
				// - If matches name , print each one
				for(int i = 0; i < person.size(); i++ ) {
					
					if(person.get(i).getFirstName().equals(n)) { 
						
						// Print record
						nameInList = true;
						System.out.println(person.get(i).getFullName() + ", " + person.get(i).getAddress().getStreet() + 
								          ", " + person.get(i).getAddress().getCity() + ", " + person.get(i).getAddress().getState() + 
								          ", " + person.get(i).getAddress().getZip() + ", " + person.get(i).getTelephone());

					}
				}
				if(nameInList == false) {
					System.out.println("Name not in record."); 
				}
				
			} else if(option == 2) {
				System.out.println("Search by last name: ");
				boolean lastNameInList = false;
				Scanner name = new Scanner(System.in);
				String n = name.nextLine();
				
				// Iterate thru linked list,
				// - If matches last name, print each
				for(int i = 0; i < person.size(); i++ ) {
					
					if(person.get(i).getLastName().equals(n)) {
						
						// Print record
						lastNameInList = true;
						System.out.println(person.get(i).getFullName() + ", " + person.get(i).getAddress().getStreet() + 
						          ", " + person.get(i).getAddress().getCity() + ", " + person.get(i).getAddress().getState() + 
						          ", " + person.get(i).getAddress().getZip() + ", " + person.get(i).getTelephone());		
					}
				}
				if(lastNameInList == false) {
					System.out.println("Last name not in record.");
				}
				
			}else if (option == 3) {
				System.out.println("Search by full name: ");
				boolean fullNameInList = false;
				Scanner name = new Scanner(System.in);
				String n = name.nextLine();
				
				// Create string fullName and put in constructor 
				for(int i = 0; i < person.size(); i++ ) {
					
					if(person.get(i).getFullName().equals(n)) {
						
						fullNameInList = true;
						System.out.println(person.get(i).getFullName() + ", " + person.get(i).getAddress().getStreet() + 
						          ", " + person.get(i).getAddress().getCity() + ", " + person.get(i).getAddress().getState() + 
						          ", " + person.get(i).getAddress().getZip() + ", " + person.get(i).getTelephone());			
					}
				}
				if(fullNameInList == false) {
					System.out.println("Name not in records."); 
				}
				
				
			} else if (option == 4) {
				System.out.println("Search by telephone number: ");
				boolean teleInList = false;
				Scanner number = new Scanner(System.in);
				Long n = number.nextLong();
				
				for(int i = 0; i < person.size(); i++ ) {
					
					if(person.get(i).getTelephone() == n) {
						// Print record
						teleInList = true;
						System.out.println(person.get(i).getFullName() + ", " + person.get(i).getAddress().getStreet() + 
						          ", " + person.get(i).getAddress().getCity() + ", " + person.get(i).getAddress().getState() + 
						          ", " + person.get(i).getAddress().getZip() + ", " + person.get(i).getTelephone());			
					}
				}
				if(teleInList == false) {
					System.out.println("Telephone number not in record.");
				}
				
			} else if(option == 5) {
				System.out.println("Search by city or state: ");
				boolean cityStateInList = false;
				Scanner name = new Scanner(System.in);
				String n = name.nextLine();
				// Iterate
				for(int i = 0; i < person.size(); i++ ) {
					
					if(person.get(i).getAddress().getCity().equals(n) || person.get(i).getAddress().getState().equals(n)) {
						
						cityStateInList = true;
						System.out.println(person.get(i).getFullName() + ", " + person.get(i).getAddress().getStreet() + 
						          ", " + person.get(i).getAddress().getCity() + ", " + person.get(i).getAddress().getState() + 
						          ", " + person.get(i).getAddress().getZip() + ", " + person.get(i).getTelephone());			
					}
				}
				if(cityStateInList == false) {
					System.out.println("City or State not in record.");
				}
				
			} else if(option == 6) {
				// Iterate thru all records, and print each
				for(int i = 0; i < person.size(); i++ ) {
				
					System.out.println(person.get(i).getFullName() + ", " + person.get(i).getAddress().getStreet() + 
					          ", " + person.get(i).getAddress().getCity() + ", " + person.get(i).getAddress().getState() + 
					          ", " + person.get(i).getAddress().getZip() + ", " + person.get(i).getTelephone());			
					
				}
				
			} else if(option == 7) {
				System.out.println("Add new entry: ");
				
				Scanner str = new Scanner(System.in);
				String line = str.nextLine(); 
				
				String[] splitString = line.split(",");
				String regex = "^\\s+"; // regex to delete leading whitespaces
				String newString;
				Long zip = 0L;
				Long tn = 0L;
				
				// split user input into arrays of strings, take out leading white space,
				//  put back into array
				for(int i = 0; i < splitString.length; i++) {
					
					newString = splitString[i].replaceAll(regex, "");
					splitString[i] = newString;		
				}

				String[] splitFullName = splitString[0].split(" "); // split name at the spaces
				// get first name
				String fname = splitFullName[0]; 
				// get last name
				String lname = splitFullName[splitFullName.length-1]; 
				String fullName = splitString[0];
				
				
				// Convert splitString 4,5 to long 
				//          zip and telephone strings to long int
				zip = Long.parseLong(splitString[4]);
													
				tn = Long.parseLong(splitString[5]);
				System.out.println("tn: " + tn);
				
				//   0             1            2      3    4        5
				// John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
				Address a = new Address(splitString[1], splitString[2], splitString[3], zip);
				Person p = new Person(fname, lname, splitString[0], tn, a);
				System.out.println("p.getTelephone(): " + p.getTelephone());
				person.add(p);


			} else if (option == 8) {
				
				// test for while loop
				boolean entryProgram = true;
				
				while(entryProgram) {
					
					System.out.println("Enter telephone number of record to update "); // fix UI here
					System.out.println("or");
					System.out.println("Press 0 to exit"); // fix UI here
					System.out.println("");
					
					// test to check if user input TN within the list
					boolean userInputTnInsideList = false;
					
					Scanner number = new Scanner(System.in);
					Long tn = number.nextLong(); 
					System.out.println("tn: " + tn);
					
					// break if user pressed 0 to exit
					if(tn == 0) {
						break;
					}
					
					for(int i = 0; i < person.size(); i++) { 
						
						System.out.println("print out inside for loop: " + person.get(i).getTelephone());
						if(tn.equals(person.get(i).getTelephone())) {
							
							userInputTnInsideList = true;
							
							System.out.println("Enter new record information: "); 
							Scanner n = new Scanner(System.in);
							String str = n.nextLine();
							
							// Update record at this index
							// 1. collect index number
							int indexNumber = i;
							// 2. delete the record
							person.remove(indexNumber);
							
							// method to split string and place in splitString array
							String[] splitString = str.split(","); // split user input by the spaces
							String regex = "^\\s+"; // regex to delete leading whitespaces
							String newString;
							Long zip = 0L;
							Long tn2 = 0L;
							
							// split user input into arrays of strings, take out leading white space,
							//  put back into array
							for(int j = 0; j < splitString.length; j++) {
								
								newString = splitString[j].replaceAll(regex, "");
								splitString[j] = newString;	
								
							}
							
							// method to split full name into array of strings
							String[] splitFullName = splitString[0].split(" "); // split name at the spaces
							
							// get first name
							String fname = splitFullName[0]; 
							
							// get last name
							String lname = splitFullName[splitFullName.length-1]; 
							String fullName = splitString[0];
							
							
							// Convert splitString 4,5 to long 
							//          zip and telephone strings to long int
							zip = Long.parseLong(splitString[4]); 
							tn2 = Long.parseLong(splitString[5]);
							System.out.println("tn2: " + tn2);
							
							//   0             1            2      3    4        5
							// John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
							Address a = new Address(splitString[1], splitString[2], splitString[3], zip);
							Person p = new Person(splitFullName[0], splitFullName[splitFullName.length-1], splitString[0], tn2,
													a);
							
							person.add(i, p); // add new Person object at previously deleted element 
							
						}
					}
					if(userInputTnInsideList == true) {
						entryProgram = false;
					}else { // Fix UI below 
						System.out.println("Telephone number is not inside phonebook."); // change string
						System.out.println("");
						System.out.println("");
						System.out.println("");	
					}
					
				}
				
				
			}else if (option == 9) {
				System.out.println("Enter telephone number of record to delete: ");
				Scanner number = new Scanner(System.in);
				Long tn = number.nextLong();
				

				int countOfTnsRemoved = 0;
				for(int i = 0; i < person.size(); i++) {
					
					if(person.get(i).getTelephone().equals(tn)) {
						// delete record
						person.remove(i);
						countOfTnsRemoved++;
					}
				}
				if(countOfTnsRemoved > 1) {
					System.out.println(countOfTnsRemoved + " record(s) deleted.");
				}else {
					System.out.println("Phone number not in records.");
				}
				
			}else if( option == 0) {
				appState = false;
				System.out.println("Exiting Console Phonebook v1.0 ..."); 
			}					
		}
	}
}
