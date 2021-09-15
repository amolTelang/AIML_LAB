/******************************************************************************

Basic bubbleSort

*******************************************************************************/
public class Main
{
    static void bubbleSort(int arr[])
    {
        //outer loop for passes 
        for(int i=0;i<arr.length;i++)
        {
            //inner loop for swapping
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
        
        
    }
	public static void main(String[] args) {
        int[] array=new int[]{100,90,80,60,70,50};
        bubbleSort(array);
        //print sorted array
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
	}
}
