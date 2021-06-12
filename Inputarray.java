package dailywork;
import java.util.Scanner;

class Inputarray{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Array size : ");
		int size=sc.nextInt();
		//input array
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print(" Value "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		
		int array[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			array[i]=arr[i];
		}
		System.out.print("Output Array :");
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		
	}
}                                                            