package one.six.zero.days.dsa.arrays;

public class Day5NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void nextPermutation(int[] arr) {
        int pivot = -1;
        for(int i= arr.length-2 ; i>=0 ; i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        
        if(pivot==-1){
            reverseArr(arr,0,arr.length-1);
            return;
        }
        
        for(int i= arr.length-1; i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp = arr[i];
                arr[i]= arr[pivot];
                arr[pivot]= temp;
                break;
            }
        }
        
        reverseArr(arr,pivot+1,arr.length-1);
        
    }
    
     void reverseArr(int[] arr, int leftPointer, int rightPointer){
         
         int temp;
         while(leftPointer <rightPointer){
             temp= arr[leftPointer];
             arr[leftPointer]=arr[rightPointer];
             arr[rightPointer]=temp;
             leftPointer++;
             rightPointer--;
         }
     }
}
