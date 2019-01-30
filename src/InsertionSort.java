import java.util.Scanner;

class InsertionSort 
{ 

	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=1; i<n; ++i) 
		{ 
			int key = arr[i]; 
			int j = i-1; 

			while (j>=0 && arr[j] > key) 
			{ 
				arr[j+1] = arr[j]; 
				j = j-1; 
			} 
			arr[j+1] = key; 
		} 
	} 


	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 


	public static void main(String args[]) 
	{		 
		Scanner k = new Scanner(System.in);
		System.out.println("Enter elements");
		String a[]=k.nextLine().split(" ");
		int n=a.length;
		int arr[]= new int[n];
		
		int i;
		for(i=0;i<n;i++)
			arr[i]=Integer.parseInt(a[i]);
		
		
		InsertionSort ob = new InsertionSort();		 
		ob.sort(arr); 
		
		printArray(arr); 
	} 
} /* This code is contributed by Rajat Mishra. */
