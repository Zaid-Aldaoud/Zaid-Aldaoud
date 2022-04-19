package Demo;

public class Demo {

	public static void binarySearch(int arr[] , int first, int last , int key) {
		
		int mid = (first + last)/2;
	
	
	while(first <= last) {
		
	if(arr[mid] < key) {
		first = mid + 1;
	}
	else if(arr[mid]== key) {
		System.out.println("element is found as index " + mid);
		break;
	}
	else {
	last = mid-1;
	}
	mid = (first + last )/2;
	}
	
if(first>last) {
	System.out.println("element is not found");
}
	}
public static void main(String[] args) {

	int arr[] = {10,30,40,70,80};
	int key = 40;
	int last = arr.length-1;
	
	binarySearch(arr,0,last,key);
	
}	
}

