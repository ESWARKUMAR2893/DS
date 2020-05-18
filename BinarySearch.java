public class BinarySearch {
	
	public static void main(String[] args) {
		
		
		BinarySearch bs= new BinarySearch();
		
		int[] arr= {1,2,3,4,5,6,7,8,9,13,56};
		int arrLen=arr.length;
		int searchVal=13;
		int start=0;
		int x= bs.BinarySearchIndex(arr,start, arrLen-1, searchVal);
		
		
		if(x == -1) {
			System.out.println("search not found");
		}else {
			System.out.println("Found at index "+x);
		}
		
		
		
	}



	private int BinarySearchIndex(int[] arr, int start, int end, int searchVal) {



//  -- >> 1 3 5 6 7 8 11 14 15 19 20 22 24 
//  -- >> 0 1 2 3 4 5 6  7  8  9  10 11 12  

		
		while(start <= end) {
			int mid= end+(start-end)/2;
			
			if(arr[mid]==searchVal) {
				
				return mid;
			}else if (arr[mid] > searchVal) {
				
				end= mid-1;
			}else {
				start= mid+1;
			}
			
				
		}
		
		
		return -1;
	}
}
