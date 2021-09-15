/******************************************************************************

implementation of linearSort!!
*******************************************************************************/
public class Main
{
    
    static void insertionSort(int arr[])
    {int j=0;
        //outer loop for pass
        for(int i=1;i<arr.length;i++)
        {   int temp=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
       
        }
        
        
    }
	public static void main(String[] args) {
            int[] array=new int[]{100,90,80,70,56,22,565};
            //sort the array
            insertionSort(array);
            //display the array
            for(int i=0;i<array.length;i++)
            {
                System.out.println(array[i]);
            }
            
	}
}