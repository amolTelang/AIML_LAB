/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
    static int binarySearch(int arr[],int key,int first,int last)
    {   
        if(first<=last)
        {
        
         int mid=first+(last-first)/2;
         if(arr[mid]==key)
                return mid;
         else if(arr[mid]<key)
                return binarySearch(arr,key,mid+1,last);
        else    
                return binarySearch(arr,key,first,mid-1);
        }
        return -1;
        
    }
	public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int key=50;
        int last=arr.length-1;
        int res= binarySearch(arr,key,0,last);
        if(res==-1)
                System.out.println("not found");
        else
                System.out.println("found at" +res);
        
	}
}
