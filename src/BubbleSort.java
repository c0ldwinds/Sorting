import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter elements");
		String a[]=k.nextLine().split(" ");
		int n=a.length;
		int arr[]= new int[n];
		int i,j,t;
		for(i=0;i<n;i++)
			arr[i]=Integer.parseInt(a[i]);
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
			
		
		

	}

}