/******************************************************************************

OPTIMIZED bubbleSort!!
*******************************************************************************/
public class Main
{
    
    static void bubbleSort(int arr[])
    {
        //outer loop for pass
        for(int i=0;i<arr.length;i++)
        {   boolean swapped=false;
            //inner loop for swapping
            for(int j=0;j<arr.length-i-1;j++)
            {   if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            //if no swapping took place then the array is already sorted
             if(swapped==false)
            break;
           
        }
        
        
    }
	public static void main(String[] args) {
            int[] array=new int[]{100,90,80,70,56,22,565};
            //sort the array
            bubbleSort(array);
            //display the array
            for(int i=0;i<array.length;i++)
            {
                System.out.println(array[i]);
            }
            
	}
}