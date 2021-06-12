package dailywork;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc   =   new Scanner(System.in);
		System.out.println(" Enter Array size : ");
		int size  =  sc.nextInt();
		
		int arr[]  =  new int[size];
		for(int i  =  0;i<arr.length;i++) {
			System.out.print(" Value "+(i+1)+" : ");
			arr[i]  =  sc.nextInt();
		}
				
		for(int i = 0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length-i-j;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				
				}
			}
		}	
		
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}