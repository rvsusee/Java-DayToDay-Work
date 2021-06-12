package june8;

import java.util.Scanner;

public class RemoveDuplicateValue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of inputs : ");
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i = 0; i<size; i++) {
			System.out.println(" Enter "+(i+1)+" in "+size+" : ");	
			input[i]=sc.nextInt();
		}
		
		int length=input.length;
		boolean samevaluefirsttime = true;
		for(int i = 0 ; i < length; i++) {
			
			for(int j = 0 ; j < length; j++) {
			
				if(input[i] == input[j]) {	
					
					if(input[i] == input[j] && samevaluefirsttime == true) {
						samevaluefirsttime=false;
					}else {
						for(int k = j; k < length-1; k++) {
							input[k]=input[k+1];
						}
						j--;
						length--;
					}
				}
			}
			samevaluefirsttime=true;
		}
		
		for(int i = 0; i < length; i++) {
			System.out.print(input[i]+" ");
		}
	}
}