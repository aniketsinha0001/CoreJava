import java.util.Arrays; 
  
public class TestArraySort{ 
    public static void main(String[] args) 
    { 
        int arr[] = { 10, 20, 15, 22, 35 }; 
  
       	Arrays.sort(arr); //Array is sorted
	
  	System.out.println(Arrays.toString(arr));// printing sorted array

	// Traversing using Foreach Loop & printing
	for(int x:arr){
		System.out.println("SortedArray: "+x);
	
	}
	// To Binary Seach element in sorted Array
        int intKey = 35; 
  
	System.out.println("Binary Search Element Key found at: " +Arrays.binarySearch(arr,intKey));
    } 
} 