package june8;

import java.util.Scanner;

class RemoveDuplicatewithSort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of inputs : ");
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i = 0; i<size; i++) {
			System.out.println(" Enter "+(i+1)+" in "+size+" : ");	
			input[i]=sc.nextInt();
		}
		//sorting array
		for(int i = 0; i < input.length; i++){
			for(int j = i+1; j<input.length; j++){
				int left = input[i];
				int right = input[j];
				
				if(left > right){
					input[i] = right;
					input[j] = left;
				}
			}
		}
		//print sorted array
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");;
		}
		
		int inputlength = input.length;
		//remove duplicate values
		for(int i = 0; i < inputlength-1; i++) {
			
			if(input[i] == input[i+1]) {
				
				for(int j = i+1; j < input.length-1; j++) {
				
						input[j] = input[j+1];
				}
				i--;
				inputlength--;
			}
		}

		System.out.println();
		
		for(int i = 0; i < inputlength; i++) {
			System.out.print(input[i]+" ");
		}
	}
}