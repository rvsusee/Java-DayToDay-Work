package june8;
class SortingArray{
	public static void main(String[] args) {
		int arr[] =  new int[]{23,43,6,4,36,76};

		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				int left = arr[i];
				int right = arr[j];
				
				if(left > right){
					arr[i] = right;
					arr[j] = left;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);;
		}
	}
}
