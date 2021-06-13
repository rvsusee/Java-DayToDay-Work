package collection;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListCollection {

	public static void main(String[] args) {
//		Set<Integer> UserIDs  = new HashSet<Integer>();
		
		ArrayList<Integer> UserIDs  = new ArrayList<Integer>();
		ArrayList<String> Names  = new ArrayList<String>();
		
		Scanner input  = new Scanner(System.in);
		while(true) {
			System.out.println(" --------------------- ");
			System.out.println(" 1. New Student ");
			System.out.println(" 2. Update Student ");
			System.out.println(" 3. View Student ");
			System.out.println(" 4. Delete Student ");
			System.out.println(" 5. Exit ");
			System.out.print(" Enter Option : ");
			int option  = input.nextInt();
			int userid;
			boolean check;
			switch(option) {
				//New Student
				case 1:
					System.out.print(" Enter Student ID : ");
					userid = input.nextInt();
					check = UserIDs.contains(userid);
					if(check == false ) {
						UserIDs.add(userid);
						System.out.print(" Enter Student Name : ");
						Names.add(input.next());
					}else {
						System.out.println(" UserID is already found !");
						continue;
					}
					break;
				//Update Student
				case 2 :
					if(UserIDs.isEmpty()) {
						System.out.println("No Students Found !");
					}else {
						System.out.print(" Enter Student ID : ");
						userid = input.nextInt();
						check = UserIDs.contains(userid);
						if(check  == true) {
							System.out.print(" Enter Student Name : ");
							Names.add(UserIDs.indexOf(userid), input.next());
						}else {
							System.out.println(" UserID is Not found !");
						}
					}
					break;
				//View Student
				case 3:
					if(UserIDs.isEmpty()) {
						System.out.println("No Students Found !");
					}else {
						System.out.println("\t UserId  Name");
						for(int i = 0; i < UserIDs.size(); i++) {
							System.out.println("\t "+UserIDs.get(i)+"\t "+Names.get(i));
						}
						
					}
					break;
				//Delete Student
				case 4:
					if(UserIDs.isEmpty()) {
						System.out.println("No Students Found !");
					}else {
						
						System.out.print(" Enter Student ID : ");
						userid =input.nextInt();
						check  = UserIDs.contains(userid);
						if(check  == true) {
							int index = UserIDs.indexOf(userid);
							System.out.println(" ID : "+userid+" Name : "+Names.get(UserIDs.indexOf(userid))+" Removed !");
							UserIDs.remove(index);
							Names.remove(index);
						}else
							System.out.println(" Invalid Student ID !!");
					}
					break;
				case 5:
					System.out.println(UserIDs+""+Names);
					System.out.println(" Exiting ...");
					System.exit(0);
					break;
				default:
					System.out.println(" Enter Valid Option ");
				}
		
		}
	}
}