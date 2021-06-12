package june8;
public class Union{
	public static int length;
	public static void main(String[] args) {
		int arr1[] = new int[] {2,4,5,5,17,15};
		int arr2[] = new int[] {3,4,7,5,16,15,2,2};
		
		int result[] = union(arr1,arr2);
		Union uni=new Union();
		
		int arr3[] = uni.removeduplicate(result);
		for(int i = 0; i < length; i++) {
			System.out.println(arr3[i]);
		}
		
	}
	//union function
	public static int[] union(int arr1[],int arr2[]) {
		int result[] = new int[arr1.length+arr2.length];
		int length = arr1.length;
		for(int i = 0; i < length; i++) {
			result[i] = arr1[i];
		}
		length += arr2.length;
		int temp = 0;
		for(int i = arr1.length; i < length; i++) {
			result[i] = arr2[temp];
			temp++;
		}
			
		return result;
	}
	//remove duplicate values
	int[] removeduplicate(int input[]) {
		length=input.length;
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
		
		return input;
	}
}