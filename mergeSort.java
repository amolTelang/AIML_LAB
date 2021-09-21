/******************************************************************************
Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.


*******************************************************************************/
// { Driver Code Starts
// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] a=new int[n1];
        int[] b=new int[n2];
        //copy all the elemts
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[l+i];
            
        }
        for(int j=0;j<n2;j++)
        {
            b[j]=arr[m+1+j];
        }
        
        //sort and merge
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                arr[k]=a[i];
                i++;
                
            }
            else
            {
                arr[k]=b[j];
                j++;
              
            }
            k++;
        }
        //place all the remaining elements in the array
        while(i<n1)
        {
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
            j++;
            k++;
        }
    }
    void mergeSort(int arr[], int l, int r)
    {   
        if(l<r)
        {
             int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
             merge(arr,l,mid,r);
        }
       
    }
}

