package june8;

public class Intersection {
	static int length;
	public static void main(String[] args) {
		int arr1[] = new int[] {2,4,5,17,15};
		int arr2[] = new int[] {3,4,7,5,16,15,2,2};
		
		Intersection ins=new Intersection();
		int arr3[] = ins.removeduplicate(arr1);
		int length3 = length;
		int arr4[] = ins.removeduplicate(arr2);
		int length4 = length;
	
		int result[] = new int[length3+length4];
		int position = 0;
		for(int i = 0; i < length3; i++) {
			for(int j = 0; j < length4; j++) {
				if(arr3[i] == arr4[j]) {
					result[position]=arr3[i];
					position++;
					break;
				}
			}
		}
		for(int i = 0; i < position; i++) {
			System.out.println(result[i]);		
		}
	}
	
	//remove dublicates in array
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
