package dsa.util;

public class sortingTechniques {
	
	void display(int[] arr) {
		System.out.println();
		for(int temp:arr) {
        	System.out.print(temp+" ");
        }
		System.out.println();
	}
	
	void bubbleSort(int arr[])
    {
//        Bubble Sort
        int n=arr.length;
        boolean swap;
        for (int i=0;i<n-1;i++) 
        {
            swap = false;
            for (int j=0;j<n-i-1;j++) 
            {
                if (arr[j]>arr[j+1]) 
                {
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap==false)
                break;
        }
        display(arr);
    }

}
