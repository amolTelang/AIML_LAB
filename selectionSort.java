/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
     void sort(int arr[])
     {
         for(int i=0;i<arr.length-1;i++)
         {
             int minIndex=i;
             for(int j=i+1;j<arr.length;j++)
             {
                 if(arr[j]<arr[minIndex])
                        minIndex=j;
             }
             int temp=arr[i];
             arr[i]=arr[minIndex];
             arr[minIndex]=temp;
         }
     }
    
     void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
	public static void main(String[] args) {
		 Main ob = new Main();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
	}
}
