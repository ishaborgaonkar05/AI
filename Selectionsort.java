import java.io.*;
import java.lang.*;
import java.util.*;
public class Selectionsort {
	static void selectionSort(int[] A) {
        int[] U = A.clone();
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min_idx]) {
                    min_idx = j;
                }
            }
            int tmp = A[i];
            A[i] = A[min_idx];
            A[min_idx] = tmp;
        }

        System.out.printf("Selection Sort:\nUnsorted array: %s\nSorted array: %s", Arrays.toString(U), Arrays.toString(A));
        
        
        
    }
	
	public static void main(String ar[])
	{
		
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		Selectionsort obj=new Selectionsort();
        obj.selectionSort(arr);
		
	}

	
	

}
